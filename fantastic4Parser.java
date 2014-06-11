// $ANTLR 3.3 Nov 30, 2010 12:50:56 fantastic4.g 2014-06-11 12:21:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class fantastic4Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGUMENTS", "ARGU", "BLOCK", "CALLFUNCTION", "EPSILON", "IDF", "CSTEINT", "CSTEBOOL", "CSTESTRING", "COMM", "WS", "'program'", "'var'", "':'", "';'", "','", "'void'", "'bool'", "'int'", "'char'", "'function'", "'('", "')'", "'ref'", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'='", "'return'", "'{'", "'}'", "'read'", "'write'", "'&&'", "'||'", "'^'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'!='", "'not'", "'!'"
    };
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int ARGUMENTS=4;
    public static final int ARGU=5;
    public static final int BLOCK=6;
    public static final int CALLFUNCTION=7;
    public static final int EPSILON=8;
    public static final int IDF=9;
    public static final int CSTEINT=10;
    public static final int CSTEBOOL=11;
    public static final int CSTESTRING=12;
    public static final int COMM=13;
    public static final int WS=14;

    // delegates
    // delegators


        public fantastic4Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public fantastic4Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return fantastic4Parser.tokenNames; }
    public String getGrammarFileName() { return "fantastic4.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // fantastic4.g:12:1: prog : 'program' IDF ( vardeclist )? ( funcdeclist )? ( instr )? -> ^( IDF ( vardeclist )? ( funcdeclist )? ( instr )? ) ;
    public final fantastic4Parser.prog_return prog() throws RecognitionException {
        fantastic4Parser.prog_return retval = new fantastic4Parser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token IDF2=null;
        fantastic4Parser.vardeclist_return vardeclist3 = null;

        fantastic4Parser.funcdeclist_return funcdeclist4 = null;

        fantastic4Parser.instr_return instr5 = null;


        Object string_literal1_tree=null;
        Object IDF2_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleSubtreeStream stream_vardeclist=new RewriteRuleSubtreeStream(adaptor,"rule vardeclist");
        RewriteRuleSubtreeStream stream_funcdeclist=new RewriteRuleSubtreeStream(adaptor,"rule funcdeclist");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // fantastic4.g:12:13: ( 'program' IDF ( vardeclist )? ( funcdeclist )? ( instr )? -> ^( IDF ( vardeclist )? ( funcdeclist )? ( instr )? ) )
            // fantastic4.g:12:15: 'program' IDF ( vardeclist )? ( funcdeclist )? ( instr )?
            {
            string_literal1=(Token)match(input,15,FOLLOW_15_in_prog56);  
            stream_15.add(string_literal1);

            IDF2=(Token)match(input,IDF,FOLLOW_IDF_in_prog58);  
            stream_IDF.add(IDF2);

            // fantastic4.g:12:29: ( vardeclist )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // fantastic4.g:12:29: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_prog60);
                    vardeclist3=vardeclist();

                    state._fsp--;

                    stream_vardeclist.add(vardeclist3.getTree());

                    }
                    break;

            }

            // fantastic4.g:12:41: ( funcdeclist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // fantastic4.g:12:41: funcdeclist
                    {
                    pushFollow(FOLLOW_funcdeclist_in_prog63);
                    funcdeclist4=funcdeclist();

                    state._fsp--;

                    stream_funcdeclist.add(funcdeclist4.getTree());

                    }
                    break;

            }

            // fantastic4.g:12:54: ( instr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDF||LA3_0==28||LA3_0==32||(LA3_0>=35 && LA3_0<=36)||(LA3_0>=38 && LA3_0<=39)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // fantastic4.g:12:54: instr
                    {
                    pushFollow(FOLLOW_instr_in_prog66);
                    instr5=instr();

                    state._fsp--;

                    stream_instr.add(instr5.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: instr, vardeclist, funcdeclist, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 12:61: -> ^( IDF ( vardeclist )? ( funcdeclist )? ( instr )? )
            {
                // fantastic4.g:12:64: ^( IDF ( vardeclist )? ( funcdeclist )? ( instr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);

                // fantastic4.g:12:70: ( vardeclist )?
                if ( stream_vardeclist.hasNext() ) {
                    adaptor.addChild(root_1, stream_vardeclist.nextTree());

                }
                stream_vardeclist.reset();
                // fantastic4.g:12:82: ( funcdeclist )?
                if ( stream_funcdeclist.hasNext() ) {
                    adaptor.addChild(root_1, stream_funcdeclist.nextTree());

                }
                stream_funcdeclist.reset();
                // fantastic4.g:12:95: ( instr )?
                if ( stream_instr.hasNext() ) {
                    adaptor.addChild(root_1, stream_instr.nextTree());

                }
                stream_instr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class vardeclist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vardeclist"
    // fantastic4.g:15:1: vardeclist : varsuitdecl ( vardeclist )? -> varsuitdecl ( vardeclist )? ;
    public final fantastic4Parser.vardeclist_return vardeclist() throws RecognitionException {
        fantastic4Parser.vardeclist_return retval = new fantastic4Parser.vardeclist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.varsuitdecl_return varsuitdecl6 = null;

        fantastic4Parser.vardeclist_return vardeclist7 = null;


        RewriteRuleSubtreeStream stream_vardeclist=new RewriteRuleSubtreeStream(adaptor,"rule vardeclist");
        RewriteRuleSubtreeStream stream_varsuitdecl=new RewriteRuleSubtreeStream(adaptor,"rule varsuitdecl");
        try {
            // fantastic4.g:15:13: ( varsuitdecl ( vardeclist )? -> varsuitdecl ( vardeclist )? )
            // fantastic4.g:15:15: varsuitdecl ( vardeclist )?
            {
            pushFollow(FOLLOW_varsuitdecl_in_vardeclist104);
            varsuitdecl6=varsuitdecl();

            state._fsp--;

            stream_varsuitdecl.add(varsuitdecl6.getTree());
            // fantastic4.g:15:27: ( vardeclist )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // fantastic4.g:15:27: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_vardeclist106);
                    vardeclist7=vardeclist();

                    state._fsp--;

                    stream_vardeclist.add(vardeclist7.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: varsuitdecl, vardeclist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 15:39: -> varsuitdecl ( vardeclist )?
            {
                adaptor.addChild(root_0, stream_varsuitdecl.nextTree());
                // fantastic4.g:15:55: ( vardeclist )?
                if ( stream_vardeclist.hasNext() ) {
                    adaptor.addChild(root_0, stream_vardeclist.nextTree());

                }
                stream_vardeclist.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vardeclist"

    public static class varsuitdecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varsuitdecl"
    // fantastic4.g:18:1: varsuitdecl : 'var' idenlist ':' typename ';' -> ^( typename idenlist ) ;
    public final fantastic4Parser.varsuitdecl_return varsuitdecl() throws RecognitionException {
        fantastic4Parser.varsuitdecl_return retval = new fantastic4Parser.varsuitdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal8=null;
        Token char_literal10=null;
        Token char_literal12=null;
        fantastic4Parser.idenlist_return idenlist9 = null;

        fantastic4Parser.typename_return typename11 = null;


        Object string_literal8_tree=null;
        Object char_literal10_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_idenlist=new RewriteRuleSubtreeStream(adaptor,"rule idenlist");
        RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");
        try {
            // fantastic4.g:18:13: ( 'var' idenlist ':' typename ';' -> ^( typename idenlist ) )
            // fantastic4.g:18:15: 'var' idenlist ':' typename ';'
            {
            string_literal8=(Token)match(input,16,FOLLOW_16_in_varsuitdecl148);  
            stream_16.add(string_literal8);

            pushFollow(FOLLOW_idenlist_in_varsuitdecl150);
            idenlist9=idenlist();

            state._fsp--;

            stream_idenlist.add(idenlist9.getTree());
            char_literal10=(Token)match(input,17,FOLLOW_17_in_varsuitdecl152);  
            stream_17.add(char_literal10);

            pushFollow(FOLLOW_typename_in_varsuitdecl154);
            typename11=typename();

            state._fsp--;

            stream_typename.add(typename11.getTree());
            char_literal12=(Token)match(input,18,FOLLOW_18_in_varsuitdecl156);  
            stream_18.add(char_literal12);



            // AST REWRITE
            // elements: idenlist, typename
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 18:47: -> ^( typename idenlist )
            {
                // fantastic4.g:18:50: ^( typename idenlist )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_typename.nextNode(), root_1);

                adaptor.addChild(root_1, stream_idenlist.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varsuitdecl"

    public static class idenlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idenlist"
    // fantastic4.g:21:1: idenlist : ( IDF -> ^( IDF ) | IDF ',' idenlist -> IDF idenlist );
    public final fantastic4Parser.idenlist_return idenlist() throws RecognitionException {
        fantastic4Parser.idenlist_return retval = new fantastic4Parser.idenlist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF13=null;
        Token IDF14=null;
        Token char_literal15=null;
        fantastic4Parser.idenlist_return idenlist16 = null;


        Object IDF13_tree=null;
        Object IDF14_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_idenlist=new RewriteRuleSubtreeStream(adaptor,"rule idenlist");
        try {
            // fantastic4.g:21:13: ( IDF -> ^( IDF ) | IDF ',' idenlist -> IDF idenlist )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDF) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=2;
                }
                else if ( (LA5_1==17) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // fantastic4.g:21:15: IDF
                    {
                    IDF13=(Token)match(input,IDF,FOLLOW_IDF_in_idenlist200);  
                    stream_IDF.add(IDF13);



                    // AST REWRITE
                    // elements: IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 21:20: -> ^( IDF )
                    {
                        // fantastic4.g:21:23: ^( IDF )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:22:15: IDF ',' idenlist
                    {
                    IDF14=(Token)match(input,IDF,FOLLOW_IDF_in_idenlist223);  
                    stream_IDF.add(IDF14);

                    char_literal15=(Token)match(input,19,FOLLOW_19_in_idenlist225);  
                    stream_19.add(char_literal15);

                    pushFollow(FOLLOW_idenlist_in_idenlist227);
                    idenlist16=idenlist();

                    state._fsp--;

                    stream_idenlist.add(idenlist16.getTree());


                    // AST REWRITE
                    // elements: IDF, idenlist
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 22:32: -> IDF idenlist
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());
                        adaptor.addChild(root_0, stream_idenlist.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idenlist"

    public static class typename_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typename"
    // fantastic4.g:25:1: typename : ( 'void' -> 'void' | 'bool' -> 'bool' | 'int' -> 'int' | 'char' -> 'char' );
    public final fantastic4Parser.typename_return typename() throws RecognitionException {
        fantastic4Parser.typename_return retval = new fantastic4Parser.typename_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal17=null;
        Token string_literal18=null;
        Token string_literal19=null;
        Token string_literal20=null;

        Object string_literal17_tree=null;
        Object string_literal18_tree=null;
        Object string_literal19_tree=null;
        Object string_literal20_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");

        try {
            // fantastic4.g:25:13: ( 'void' -> 'void' | 'bool' -> 'bool' | 'int' -> 'int' | 'char' -> 'char' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // fantastic4.g:25:15: 'void'
                    {
                    string_literal17=(Token)match(input,20,FOLLOW_20_in_typename269);  
                    stream_20.add(string_literal17);



                    // AST REWRITE
                    // elements: 20
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 25:22: -> 'void'
                    {
                        adaptor.addChild(root_0, stream_20.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:26:15: 'bool'
                    {
                    string_literal18=(Token)match(input,21,FOLLOW_21_in_typename289);  
                    stream_21.add(string_literal18);



                    // AST REWRITE
                    // elements: 21
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 26:22: -> 'bool'
                    {
                        adaptor.addChild(root_0, stream_21.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // fantastic4.g:27:15: 'int'
                    {
                    string_literal19=(Token)match(input,22,FOLLOW_22_in_typename309);  
                    stream_22.add(string_literal19);



                    // AST REWRITE
                    // elements: 22
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 27:22: -> 'int'
                    {
                        adaptor.addChild(root_0, stream_22.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // fantastic4.g:28:15: 'char'
                    {
                    string_literal20=(Token)match(input,23,FOLLOW_23_in_typename330);  
                    stream_23.add(string_literal20);



                    // AST REWRITE
                    // elements: 23
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:22: -> 'char'
                    {
                        adaptor.addChild(root_0, stream_23.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typename"

    public static class funcdeclist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcdeclist"
    // fantastic4.g:31:1: funcdeclist : funcdecl ( funcdeclist )? ;
    public final fantastic4Parser.funcdeclist_return funcdeclist() throws RecognitionException {
        fantastic4Parser.funcdeclist_return retval = new fantastic4Parser.funcdeclist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.funcdecl_return funcdecl21 = null;

        fantastic4Parser.funcdeclist_return funcdeclist22 = null;



        try {
            // fantastic4.g:31:13: ( funcdecl ( funcdeclist )? )
            // fantastic4.g:31:15: funcdecl ( funcdeclist )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_funcdecl_in_funcdeclist367);
            funcdecl21=funcdecl();

            state._fsp--;

            adaptor.addChild(root_0, funcdecl21.getTree());
            // fantastic4.g:31:24: ( funcdeclist )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // fantastic4.g:31:24: funcdeclist
                    {
                    pushFollow(FOLLOW_funcdeclist_in_funcdeclist369);
                    funcdeclist22=funcdeclist();

                    state._fsp--;

                    adaptor.addChild(root_0, funcdeclist22.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcdeclist"

    public static class funcdecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcdecl"
    // fantastic4.g:34:1: funcdecl : 'function' IDF '(' ( arglist )? ')' ':' typename ( vardeclist )? instr -> ^( 'function' typename ^( IDF ( vardeclist )? instr ) ( arglist )? ) ;
    public final fantastic4Parser.funcdecl_return funcdecl() throws RecognitionException {
        fantastic4Parser.funcdecl_return retval = new fantastic4Parser.funcdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal23=null;
        Token IDF24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal28=null;
        fantastic4Parser.arglist_return arglist26 = null;

        fantastic4Parser.typename_return typename29 = null;

        fantastic4Parser.vardeclist_return vardeclist30 = null;

        fantastic4Parser.instr_return instr31 = null;


        Object string_literal23_tree=null;
        Object IDF24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal27_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_arglist=new RewriteRuleSubtreeStream(adaptor,"rule arglist");
        RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");
        RewriteRuleSubtreeStream stream_vardeclist=new RewriteRuleSubtreeStream(adaptor,"rule vardeclist");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // fantastic4.g:34:13: ( 'function' IDF '(' ( arglist )? ')' ':' typename ( vardeclist )? instr -> ^( 'function' typename ^( IDF ( vardeclist )? instr ) ( arglist )? ) )
            // fantastic4.g:34:15: 'function' IDF '(' ( arglist )? ')' ':' typename ( vardeclist )? instr
            {
            string_literal23=(Token)match(input,24,FOLLOW_24_in_funcdecl406);  
            stream_24.add(string_literal23);

            IDF24=(Token)match(input,IDF,FOLLOW_IDF_in_funcdecl408);  
            stream_IDF.add(IDF24);

            char_literal25=(Token)match(input,25,FOLLOW_25_in_funcdecl410);  
            stream_25.add(char_literal25);

            // fantastic4.g:34:34: ( arglist )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDF||LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // fantastic4.g:34:34: arglist
                    {
                    pushFollow(FOLLOW_arglist_in_funcdecl412);
                    arglist26=arglist();

                    state._fsp--;

                    stream_arglist.add(arglist26.getTree());

                    }
                    break;

            }

            char_literal27=(Token)match(input,26,FOLLOW_26_in_funcdecl415);  
            stream_26.add(char_literal27);

            char_literal28=(Token)match(input,17,FOLLOW_17_in_funcdecl417);  
            stream_17.add(char_literal28);

            pushFollow(FOLLOW_typename_in_funcdecl419);
            typename29=typename();

            state._fsp--;

            stream_typename.add(typename29.getTree());
            // fantastic4.g:34:60: ( vardeclist )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // fantastic4.g:34:60: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_funcdecl421);
                    vardeclist30=vardeclist();

                    state._fsp--;

                    stream_vardeclist.add(vardeclist30.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_instr_in_funcdecl424);
            instr31=instr();

            state._fsp--;

            stream_instr.add(instr31.getTree());


            // AST REWRITE
            // elements: instr, IDF, typename, vardeclist, 24, arglist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:78: -> ^( 'function' typename ^( IDF ( vardeclist )? instr ) ( arglist )? )
            {
                // fantastic4.g:34:81: ^( 'function' typename ^( IDF ( vardeclist )? instr ) ( arglist )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_24.nextNode(), root_1);

                adaptor.addChild(root_1, stream_typename.nextTree());
                // fantastic4.g:34:103: ^( IDF ( vardeclist )? instr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);

                // fantastic4.g:34:109: ( vardeclist )?
                if ( stream_vardeclist.hasNext() ) {
                    adaptor.addChild(root_2, stream_vardeclist.nextTree());

                }
                stream_vardeclist.reset();
                adaptor.addChild(root_2, stream_instr.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // fantastic4.g:34:129: ( arglist )?
                if ( stream_arglist.hasNext() ) {
                    adaptor.addChild(root_1, stream_arglist.nextTree());

                }
                stream_arglist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcdecl"

    public static class arglist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arglist"
    // fantastic4.g:37:1: arglist : ( arg | arg ',' arglist -> ^( ARGUMENTS arg arglist ) );
    public final fantastic4Parser.arglist_return arglist() throws RecognitionException {
        fantastic4Parser.arglist_return retval = new fantastic4Parser.arglist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal34=null;
        fantastic4Parser.arg_return arg32 = null;

        fantastic4Parser.arg_return arg33 = null;

        fantastic4Parser.arglist_return arglist35 = null;


        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_arglist=new RewriteRuleSubtreeStream(adaptor,"rule arglist");
        RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");
        try {
            // fantastic4.g:37:13: ( arg | arg ',' arglist -> ^( ARGUMENTS arg arglist ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // fantastic4.g:37:15: arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arg_in_arglist471);
                    arg32=arg();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(arg32.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // fantastic4.g:38:15: arg ',' arglist
                    {
                    pushFollow(FOLLOW_arg_in_arglist488);
                    arg33=arg();

                    state._fsp--;

                    stream_arg.add(arg33.getTree());
                    char_literal34=(Token)match(input,19,FOLLOW_19_in_arglist490);  
                    stream_19.add(char_literal34);

                    pushFollow(FOLLOW_arglist_in_arglist492);
                    arglist35=arglist();

                    state._fsp--;

                    stream_arglist.add(arglist35.getTree());


                    // AST REWRITE
                    // elements: arg, arglist
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:31: -> ^( ARGUMENTS arg arglist )
                    {
                        // fantastic4.g:38:34: ^( ARGUMENTS arg arglist )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                        adaptor.addChild(root_1, stream_arg.nextTree());
                        adaptor.addChild(root_1, stream_arglist.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arglist"

    public static class arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg"
    // fantastic4.g:41:1: arg : ( IDF ':' typename -> ^( ARGU IDF typename ) | 'ref' IDF ':' typename -> ^( 'ref' IDF typename ) );
    public final fantastic4Parser.arg_return arg() throws RecognitionException {
        fantastic4Parser.arg_return retval = new fantastic4Parser.arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF36=null;
        Token char_literal37=null;
        Token string_literal39=null;
        Token IDF40=null;
        Token char_literal41=null;
        fantastic4Parser.typename_return typename38 = null;

        fantastic4Parser.typename_return typename42 = null;


        Object IDF36_tree=null;
        Object char_literal37_tree=null;
        Object string_literal39_tree=null;
        Object IDF40_tree=null;
        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");
        try {
            // fantastic4.g:41:13: ( IDF ':' typename -> ^( ARGU IDF typename ) | 'ref' IDF ':' typename -> ^( 'ref' IDF typename ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDF) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // fantastic4.g:41:15: IDF ':' typename
                    {
                    IDF36=(Token)match(input,IDF,FOLLOW_IDF_in_arg531);  
                    stream_IDF.add(IDF36);

                    char_literal37=(Token)match(input,17,FOLLOW_17_in_arg533);  
                    stream_17.add(char_literal37);

                    pushFollow(FOLLOW_typename_in_arg535);
                    typename38=typename();

                    state._fsp--;

                    stream_typename.add(typename38.getTree());


                    // AST REWRITE
                    // elements: IDF, typename
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 41:32: -> ^( ARGU IDF typename )
                    {
                        // fantastic4.g:41:35: ^( ARGU IDF typename )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGU, "ARGU"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_typename.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:42:15: 'ref' IDF ':' typename
                    {
                    string_literal39=(Token)match(input,27,FOLLOW_27_in_arg561);  
                    stream_27.add(string_literal39);

                    IDF40=(Token)match(input,IDF,FOLLOW_IDF_in_arg563);  
                    stream_IDF.add(IDF40);

                    char_literal41=(Token)match(input,17,FOLLOW_17_in_arg565);  
                    stream_17.add(char_literal41);

                    pushFollow(FOLLOW_typename_in_arg567);
                    typename42=typename();

                    state._fsp--;

                    stream_typename.add(typename42.getTree());


                    // AST REWRITE
                    // elements: IDF, 27, typename
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 42:38: -> ^( 'ref' IDF typename )
                    {
                        // fantastic4.g:42:41: ^( 'ref' IDF typename )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_27.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_typename.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg"

    public static class instr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // fantastic4.g:45:1: instr : ( 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( 'if' expr ^( 'then' instr ) ( ^( 'else' instr ) )? ) | 'while' expr 'do' instr -> ^( 'while' expr ^( BLOCK instr ) ) | IDF '=' expr ';' -> ^( '=' IDF expr ) | 'return' returnable -> ^( 'return' returnable ) | IDF '(' exprlist ')' ';' -> ^( CALLFUNCTION IDF exprlist ) | '{' ( sequence )? '}' -> ( sequence )? | 'read' IDF ';' -> ^( 'read' IDF ) | 'write' writable ';' -> ^( 'write' writable ) );
    public final fantastic4Parser.instr_return instr() throws RecognitionException {
        fantastic4Parser.instr_return retval = new fantastic4Parser.instr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        Token string_literal45=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal50=null;
        Token string_literal52=null;
        Token IDF54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token IDF60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token char_literal67=null;
        Token string_literal68=null;
        Token IDF69=null;
        Token char_literal70=null;
        Token string_literal71=null;
        Token char_literal73=null;
        fantastic4Parser.expr_return expr44 = null;

        fantastic4Parser.instr_return instr46 = null;

        fantastic4Parser.instr_return instr48 = null;

        fantastic4Parser.expr_return expr51 = null;

        fantastic4Parser.instr_return instr53 = null;

        fantastic4Parser.expr_return expr56 = null;

        fantastic4Parser.returnable_return returnable59 = null;

        fantastic4Parser.exprlist_return exprlist62 = null;

        fantastic4Parser.sequence_return sequence66 = null;

        fantastic4Parser.writable_return writable72 = null;


        Object string_literal43_tree=null;
        Object string_literal45_tree=null;
        Object string_literal47_tree=null;
        Object string_literal49_tree=null;
        Object string_literal50_tree=null;
        Object string_literal52_tree=null;
        Object IDF54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        Object string_literal58_tree=null;
        Object IDF60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;
        Object char_literal67_tree=null;
        Object string_literal68_tree=null;
        Object IDF69_tree=null;
        Object char_literal70_tree=null;
        Object string_literal71_tree=null;
        Object char_literal73_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_writable=new RewriteRuleSubtreeStream(adaptor,"rule writable");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprlist=new RewriteRuleSubtreeStream(adaptor,"rule exprlist");
        RewriteRuleSubtreeStream stream_returnable=new RewriteRuleSubtreeStream(adaptor,"rule returnable");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // fantastic4.g:45:13: ( 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( 'if' expr ^( 'then' instr ) ( ^( 'else' instr ) )? ) | 'while' expr 'do' instr -> ^( 'while' expr ^( BLOCK instr ) ) | IDF '=' expr ';' -> ^( '=' IDF expr ) | 'return' returnable -> ^( 'return' returnable ) | IDF '(' exprlist ')' ';' -> ^( CALLFUNCTION IDF exprlist ) | '{' ( sequence )? '}' -> ( sequence )? | 'read' IDF ';' -> ^( 'read' IDF ) | 'write' writable ';' -> ^( 'write' writable ) )
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // fantastic4.g:45:15: 'if' expr 'then' instr ( 'else' instr )? 'fi'
                    {
                    string_literal43=(Token)match(input,28,FOLLOW_28_in_instr616);  
                    stream_28.add(string_literal43);

                    pushFollow(FOLLOW_expr_in_instr618);
                    expr44=expr();

                    state._fsp--;

                    stream_expr.add(expr44.getTree());
                    string_literal45=(Token)match(input,29,FOLLOW_29_in_instr620);  
                    stream_29.add(string_literal45);

                    pushFollow(FOLLOW_instr_in_instr622);
                    instr46=instr();

                    state._fsp--;

                    stream_instr.add(instr46.getTree());
                    // fantastic4.g:45:38: ( 'else' instr )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==30) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // fantastic4.g:45:39: 'else' instr
                            {
                            string_literal47=(Token)match(input,30,FOLLOW_30_in_instr625);  
                            stream_30.add(string_literal47);

                            pushFollow(FOLLOW_instr_in_instr628);
                            instr48=instr();

                            state._fsp--;

                            stream_instr.add(instr48.getTree());

                            }
                            break;

                    }

                    string_literal49=(Token)match(input,31,FOLLOW_31_in_instr632);  
                    stream_31.add(string_literal49);



                    // AST REWRITE
                    // elements: instr, instr, 29, 30, 28, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 45:60: -> ^( 'if' expr ^( 'then' instr ) ( ^( 'else' instr ) )? )
                    {
                        // fantastic4.g:45:64: ^( 'if' expr ^( 'then' instr ) ( ^( 'else' instr ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_28.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // fantastic4.g:45:76: ^( 'then' instr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_29.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_instr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // fantastic4.g:45:92: ( ^( 'else' instr ) )?
                        if ( stream_instr.hasNext()||stream_30.hasNext() ) {
                            // fantastic4.g:45:92: ^( 'else' instr )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_30.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_instr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_instr.reset();
                        stream_30.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:46:15: 'while' expr 'do' instr
                    {
                    string_literal50=(Token)match(input,32,FOLLOW_32_in_instr670);  
                    stream_32.add(string_literal50);

                    pushFollow(FOLLOW_expr_in_instr672);
                    expr51=expr();

                    state._fsp--;

                    stream_expr.add(expr51.getTree());
                    string_literal52=(Token)match(input,33,FOLLOW_33_in_instr674);  
                    stream_33.add(string_literal52);

                    pushFollow(FOLLOW_instr_in_instr676);
                    instr53=instr();

                    state._fsp--;

                    stream_instr.add(instr53.getTree());


                    // AST REWRITE
                    // elements: instr, expr, 32
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:39: -> ^( 'while' expr ^( BLOCK instr ) )
                    {
                        // fantastic4.g:46:42: ^( 'while' expr ^( BLOCK instr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_32.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // fantastic4.g:46:57: ^( BLOCK instr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                        adaptor.addChild(root_2, stream_instr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // fantastic4.g:47:15: IDF '=' expr ';'
                    {
                    IDF54=(Token)match(input,IDF,FOLLOW_IDF_in_instr706);  
                    stream_IDF.add(IDF54);

                    char_literal55=(Token)match(input,34,FOLLOW_34_in_instr708);  
                    stream_34.add(char_literal55);

                    pushFollow(FOLLOW_expr_in_instr710);
                    expr56=expr();

                    state._fsp--;

                    stream_expr.add(expr56.getTree());
                    char_literal57=(Token)match(input,18,FOLLOW_18_in_instr712);  
                    stream_18.add(char_literal57);



                    // AST REWRITE
                    // elements: 34, IDF, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 47:33: -> ^( '=' IDF expr )
                    {
                        // fantastic4.g:47:36: ^( '=' IDF expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_34.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // fantastic4.g:48:15: 'return' returnable
                    {
                    string_literal58=(Token)match(input,35,FOLLOW_35_in_instr739);  
                    stream_35.add(string_literal58);

                    pushFollow(FOLLOW_returnable_in_instr741);
                    returnable59=returnable();

                    state._fsp--;

                    stream_returnable.add(returnable59.getTree());


                    // AST REWRITE
                    // elements: returnable, 35
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 48:35: -> ^( 'return' returnable )
                    {
                        // fantastic4.g:48:38: ^( 'return' returnable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_returnable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // fantastic4.g:49:15: IDF '(' exprlist ')' ';'
                    {
                    IDF60=(Token)match(input,IDF,FOLLOW_IDF_in_instr765);  
                    stream_IDF.add(IDF60);

                    char_literal61=(Token)match(input,25,FOLLOW_25_in_instr767);  
                    stream_25.add(char_literal61);

                    pushFollow(FOLLOW_exprlist_in_instr769);
                    exprlist62=exprlist();

                    state._fsp--;

                    stream_exprlist.add(exprlist62.getTree());
                    char_literal63=(Token)match(input,26,FOLLOW_26_in_instr771);  
                    stream_26.add(char_literal63);

                    char_literal64=(Token)match(input,18,FOLLOW_18_in_instr773);  
                    stream_18.add(char_literal64);



                    // AST REWRITE
                    // elements: IDF, exprlist
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:40: -> ^( CALLFUNCTION IDF exprlist )
                    {
                        // fantastic4.g:49:44: ^( CALLFUNCTION IDF exprlist )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALLFUNCTION, "CALLFUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_exprlist.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // fantastic4.g:50:15: '{' ( sequence )? '}'
                    {
                    char_literal65=(Token)match(input,36,FOLLOW_36_in_instr801);  
                    stream_36.add(char_literal65);

                    // fantastic4.g:50:19: ( sequence )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==IDF||LA13_0==28||LA13_0==32||(LA13_0>=35 && LA13_0<=36)||(LA13_0>=38 && LA13_0<=39)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // fantastic4.g:50:19: sequence
                            {
                            pushFollow(FOLLOW_sequence_in_instr803);
                            sequence66=sequence();

                            state._fsp--;

                            stream_sequence.add(sequence66.getTree());

                            }
                            break;

                    }

                    char_literal67=(Token)match(input,37,FOLLOW_37_in_instr806);  
                    stream_37.add(char_literal67);



                    // AST REWRITE
                    // elements: sequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:33: -> ( sequence )?
                    {
                        // fantastic4.g:50:37: ( sequence )?
                        if ( stream_sequence.hasNext() ) {
                            adaptor.addChild(root_0, stream_sequence.nextTree());

                        }
                        stream_sequence.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // fantastic4.g:51:15: 'read' IDF ';'
                    {
                    string_literal68=(Token)match(input,38,FOLLOW_38_in_instr828);  
                    stream_38.add(string_literal68);

                    IDF69=(Token)match(input,IDF,FOLLOW_IDF_in_instr830);  
                    stream_IDF.add(IDF69);

                    char_literal70=(Token)match(input,18,FOLLOW_18_in_instr832);  
                    stream_18.add(char_literal70);



                    // AST REWRITE
                    // elements: IDF, 38
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 51:30: -> ^( 'read' IDF )
                    {
                        // fantastic4.g:51:33: ^( 'read' IDF )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_38.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // fantastic4.g:52:15: 'write' writable ';'
                    {
                    string_literal71=(Token)match(input,39,FOLLOW_39_in_instr856);  
                    stream_39.add(string_literal71);

                    pushFollow(FOLLOW_writable_in_instr858);
                    writable72=writable();

                    state._fsp--;

                    stream_writable.add(writable72.getTree());
                    char_literal73=(Token)match(input,18,FOLLOW_18_in_instr860);  
                    stream_18.add(char_literal73);



                    // AST REWRITE
                    // elements: writable, 39
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:36: -> ^( 'write' writable )
                    {
                        // fantastic4.g:52:39: ^( 'write' writable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_39.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_writable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instr"

    public static class returnable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnable"
    // fantastic4.g:55:1: returnable : expr ';' -> expr ;
    public final fantastic4Parser.returnable_return returnable() throws RecognitionException {
        fantastic4Parser.returnable_return retval = new fantastic4Parser.returnable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal75=null;
        fantastic4Parser.expr_return expr74 = null;


        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // fantastic4.g:55:12: ( expr ';' -> expr )
            // fantastic4.g:55:14: expr ';'
            {
            pushFollow(FOLLOW_expr_in_returnable889);
            expr74=expr();

            state._fsp--;

            stream_expr.add(expr74.getTree());
            char_literal75=(Token)match(input,18,FOLLOW_18_in_returnable891);  
            stream_18.add(char_literal75);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:23: -> expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnable"

    public static class writable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "writable"
    // fantastic4.g:59:1: writable : ( IDF -> IDF | cste -> cste );
    public final fantastic4Parser.writable_return writable() throws RecognitionException {
        fantastic4Parser.writable_return retval = new fantastic4Parser.writable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF76=null;
        fantastic4Parser.cste_return cste77 = null;


        Object IDF76_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_cste=new RewriteRuleSubtreeStream(adaptor,"rule cste");
        try {
            // fantastic4.g:59:13: ( IDF -> IDF | cste -> cste )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDF) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=CSTEINT && LA15_0<=CSTESTRING)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // fantastic4.g:59:15: IDF
                    {
                    IDF76=(Token)match(input,IDF,FOLLOW_IDF_in_writable911);  
                    stream_IDF.add(IDF76);



                    // AST REWRITE
                    // elements: IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:19: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:60:15: cste
                    {
                    pushFollow(FOLLOW_cste_in_writable931);
                    cste77=cste();

                    state._fsp--;

                    stream_cste.add(cste77.getTree());


                    // AST REWRITE
                    // elements: cste
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:20: -> cste
                    {
                        adaptor.addChild(root_0, stream_cste.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "writable"

    public static class sequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence"
    // fantastic4.g:63:1: sequence : instr ( sequence )? -> instr ( sequence )? ;
    public final fantastic4Parser.sequence_return sequence() throws RecognitionException {
        fantastic4Parser.sequence_return retval = new fantastic4Parser.sequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.instr_return instr78 = null;

        fantastic4Parser.sequence_return sequence79 = null;


        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // fantastic4.g:63:13: ( instr ( sequence )? -> instr ( sequence )? )
            // fantastic4.g:63:16: instr ( sequence )?
            {
            pushFollow(FOLLOW_instr_in_sequence960);
            instr78=instr();

            state._fsp--;

            stream_instr.add(instr78.getTree());
            // fantastic4.g:63:23: ( sequence )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDF||LA16_0==28||LA16_0==32||(LA16_0>=35 && LA16_0<=36)||(LA16_0>=38 && LA16_0<=39)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // fantastic4.g:63:23: sequence
                    {
                    pushFollow(FOLLOW_sequence_in_sequence963);
                    sequence79=sequence();

                    state._fsp--;

                    stream_sequence.add(sequence79.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: instr, sequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:33: -> instr ( sequence )?
            {
                adaptor.addChild(root_0, stream_instr.nextTree());
                // fantastic4.g:63:42: ( sequence )?
                if ( stream_sequence.hasNext() ) {
                    adaptor.addChild(root_0, stream_sequence.nextTree());

                }
                stream_sequence.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sequence"

    public static class exprlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprlist"
    // fantastic4.g:66:1: exprlist : expr ( nextexpr )? -> expr ( nextexpr )? ;
    public final fantastic4Parser.exprlist_return exprlist() throws RecognitionException {
        fantastic4Parser.exprlist_return retval = new fantastic4Parser.exprlist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.expr_return expr80 = null;

        fantastic4Parser.nextexpr_return nextexpr81 = null;


        RewriteRuleSubtreeStream stream_nextexpr=new RewriteRuleSubtreeStream(adaptor,"rule nextexpr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // fantastic4.g:66:13: ( expr ( nextexpr )? -> expr ( nextexpr )? )
            // fantastic4.g:66:15: expr ( nextexpr )?
            {
            pushFollow(FOLLOW_expr_in_exprlist1007);
            expr80=expr();

            state._fsp--;

            stream_expr.add(expr80.getTree());
            // fantastic4.g:66:20: ( nextexpr )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // fantastic4.g:66:20: nextexpr
                    {
                    pushFollow(FOLLOW_nextexpr_in_exprlist1009);
                    nextexpr81=nextexpr();

                    state._fsp--;

                    stream_nextexpr.add(nextexpr81.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: nextexpr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:30: -> expr ( nextexpr )?
            {
                adaptor.addChild(root_0, stream_expr.nextTree());
                // fantastic4.g:66:38: ( nextexpr )?
                if ( stream_nextexpr.hasNext() ) {
                    adaptor.addChild(root_0, stream_nextexpr.nextTree());

                }
                stream_nextexpr.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprlist"

    public static class nextexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nextexpr"
    // fantastic4.g:69:1: nextexpr : ',' exprlist -> exprlist ;
    public final fantastic4Parser.nextexpr_return nextexpr() throws RecognitionException {
        fantastic4Parser.nextexpr_return retval = new fantastic4Parser.nextexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal82=null;
        fantastic4Parser.exprlist_return exprlist83 = null;


        Object char_literal82_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_exprlist=new RewriteRuleSubtreeStream(adaptor,"rule exprlist");
        try {
            // fantastic4.g:69:13: ( ',' exprlist -> exprlist )
            // fantastic4.g:69:14: ',' exprlist
            {
            char_literal82=(Token)match(input,19,FOLLOW_19_in_nextexpr1040);  
            stream_19.add(char_literal82);

            pushFollow(FOLLOW_exprlist_in_nextexpr1042);
            exprlist83=exprlist();

            state._fsp--;

            stream_exprlist.add(exprlist83.getTree());


            // AST REWRITE
            // elements: exprlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:27: -> exprlist
            {
                adaptor.addChild(root_0, stream_exprlist.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nextexpr"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // fantastic4.g:72:1: expr : add -> add ;
    public final fantastic4Parser.expr_return expr() throws RecognitionException {
        fantastic4Parser.expr_return retval = new fantastic4Parser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.add_return add84 = null;


        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try {
            // fantastic4.g:72:6: ( add -> add )
            // fantastic4.g:72:9: add
            {
            pushFollow(FOLLOW_add_in_expr1068);
            add84=add();

            state._fsp--;

            stream_add.add(add84.getTree());


            // AST REWRITE
            // elements: add
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:13: -> add
            {
                adaptor.addChild(root_0, stream_add.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // fantastic4.g:75:1: add : mult ( addSubtractOp add )? ;
    public final fantastic4Parser.add_return add() throws RecognitionException {
        fantastic4Parser.add_return retval = new fantastic4Parser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.mult_return mult85 = null;

        fantastic4Parser.addSubtractOp_return addSubtractOp86 = null;

        fantastic4Parser.add_return add87 = null;



        try {
            // fantastic4.g:75:5: ( mult ( addSubtractOp add )? )
            // fantastic4.g:75:7: mult ( addSubtractOp add )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add1087);
            mult85=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult85.getTree());
            // fantastic4.g:75:12: ( addSubtractOp add )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=43 && LA18_0<=44)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // fantastic4.g:75:13: addSubtractOp add
                    {
                    pushFollow(FOLLOW_addSubtractOp_in_add1090);
                    addSubtractOp86=addSubtractOp();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(addSubtractOp86.getTree(), root_0);
                    pushFollow(FOLLOW_add_in_add1093);
                    add87=add();

                    state._fsp--;

                    adaptor.addChild(root_0, add87.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class mult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // fantastic4.g:79:1: mult : and ( multiplyDivideOp mult )? ;
    public final fantastic4Parser.mult_return mult() throws RecognitionException {
        fantastic4Parser.mult_return retval = new fantastic4Parser.mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.and_return and88 = null;

        fantastic4Parser.multiplyDivideOp_return multiplyDivideOp89 = null;

        fantastic4Parser.mult_return mult90 = null;



        try {
            // fantastic4.g:80:2: ( and ( multiplyDivideOp mult )? )
            // fantastic4.g:80:4: and ( multiplyDivideOp mult )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_in_mult1111);
            and88=and();

            state._fsp--;

            adaptor.addChild(root_0, and88.getTree());
            // fantastic4.g:80:8: ( multiplyDivideOp mult )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=45 && LA19_0<=46)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // fantastic4.g:80:9: multiplyDivideOp mult
                    {
                    pushFollow(FOLLOW_multiplyDivideOp_in_mult1114);
                    multiplyDivideOp89=multiplyDivideOp();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(multiplyDivideOp89.getTree(), root_0);
                    pushFollow(FOLLOW_mult_in_mult1118);
                    mult90=mult();

                    state._fsp--;

                    adaptor.addChild(root_0, mult90.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mult"

    public static class and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and"
    // fantastic4.g:83:1: and : comp ( '&&' and )? ;
    public final fantastic4Parser.and_return and() throws RecognitionException {
        fantastic4Parser.and_return retval = new fantastic4Parser.and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal92=null;
        fantastic4Parser.comp_return comp91 = null;

        fantastic4Parser.and_return and93 = null;


        Object string_literal92_tree=null;

        try {
            // fantastic4.g:84:2: ( comp ( '&&' and )? )
            // fantastic4.g:84:4: comp ( '&&' and )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_comp_in_and1138);
            comp91=comp();

            state._fsp--;

            adaptor.addChild(root_0, comp91.getTree());
            // fantastic4.g:84:9: ( '&&' and )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // fantastic4.g:84:10: '&&' and
                    {
                    string_literal92=(Token)match(input,40,FOLLOW_40_in_and1141); 
                    string_literal92_tree = (Object)adaptor.create(string_literal92);
                    root_0 = (Object)adaptor.becomeRoot(string_literal92_tree, root_0);

                    pushFollow(FOLLOW_and_in_and1145);
                    and93=and();

                    state._fsp--;

                    adaptor.addChild(root_0, and93.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and"

    public static class comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp"
    // fantastic4.g:87:1: comp : or ( comparatorOp comp )? ;
    public final fantastic4Parser.comp_return comp() throws RecognitionException {
        fantastic4Parser.comp_return retval = new fantastic4Parser.comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.or_return or94 = null;

        fantastic4Parser.comparatorOp_return comparatorOp95 = null;

        fantastic4Parser.comp_return comp96 = null;



        try {
            // fantastic4.g:88:2: ( or ( comparatorOp comp )? )
            // fantastic4.g:88:4: or ( comparatorOp comp )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_in_comp1160);
            or94=or();

            state._fsp--;

            adaptor.addChild(root_0, or94.getTree());
            // fantastic4.g:88:7: ( comparatorOp comp )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=47 && LA21_0<=51)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // fantastic4.g:88:8: comparatorOp comp
                    {
                    pushFollow(FOLLOW_comparatorOp_in_comp1163);
                    comparatorOp95=comparatorOp();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(comparatorOp95.getTree(), root_0);
                    pushFollow(FOLLOW_comp_in_comp1167);
                    comp96=comp();

                    state._fsp--;

                    adaptor.addChild(root_0, comp96.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comp"

    public static class or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or"
    // fantastic4.g:91:1: or : puis ( '||' or )? ;
    public final fantastic4Parser.or_return or() throws RecognitionException {
        fantastic4Parser.or_return retval = new fantastic4Parser.or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal98=null;
        fantastic4Parser.puis_return puis97 = null;

        fantastic4Parser.or_return or99 = null;


        Object string_literal98_tree=null;

        try {
            // fantastic4.g:91:5: ( puis ( '||' or )? )
            // fantastic4.g:91:7: puis ( '||' or )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_puis_in_or1185);
            puis97=puis();

            state._fsp--;

            adaptor.addChild(root_0, puis97.getTree());
            // fantastic4.g:91:12: ( '||' or )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // fantastic4.g:91:13: '||' or
                    {
                    string_literal98=(Token)match(input,41,FOLLOW_41_in_or1188); 
                    string_literal98_tree = (Object)adaptor.create(string_literal98);
                    root_0 = (Object)adaptor.becomeRoot(string_literal98_tree, root_0);

                    pushFollow(FOLLOW_or_in_or1192);
                    or99=or();

                    state._fsp--;

                    adaptor.addChild(root_0, or99.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or"

    public static class puis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "puis"
    // fantastic4.g:94:1: puis : negExpression ( '^' puis )? ;
    public final fantastic4Parser.puis_return puis() throws RecognitionException {
        fantastic4Parser.puis_return retval = new fantastic4Parser.puis_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal101=null;
        fantastic4Parser.negExpression_return negExpression100 = null;

        fantastic4Parser.puis_return puis102 = null;


        Object char_literal101_tree=null;

        try {
            // fantastic4.g:95:2: ( negExpression ( '^' puis )? )
            // fantastic4.g:95:5: negExpression ( '^' puis )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_negExpression_in_puis1209);
            negExpression100=negExpression();

            state._fsp--;

            adaptor.addChild(root_0, negExpression100.getTree());
            // fantastic4.g:95:19: ( '^' puis )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // fantastic4.g:95:20: '^' puis
                    {
                    char_literal101=(Token)match(input,42,FOLLOW_42_in_puis1212); 
                    char_literal101_tree = (Object)adaptor.create(char_literal101);
                    root_0 = (Object)adaptor.becomeRoot(char_literal101_tree, root_0);

                    pushFollow(FOLLOW_puis_in_puis1215);
                    puis102=puis();

                    state._fsp--;

                    adaptor.addChild(root_0, puis102.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "puis"

    public static class negExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negExpression"
    // fantastic4.g:98:1: negExpression : ( neg )? expressionAtom ;
    public final fantastic4Parser.negExpression_return negExpression() throws RecognitionException {
        fantastic4Parser.negExpression_return retval = new fantastic4Parser.negExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fantastic4Parser.neg_return neg103 = null;

        fantastic4Parser.expressionAtom_return expressionAtom104 = null;



        try {
            // fantastic4.g:98:14: ( ( neg )? expressionAtom )
            // fantastic4.g:98:16: ( neg )? expressionAtom
            {
            root_0 = (Object)adaptor.nil();

            // fantastic4.g:98:16: ( neg )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=52 && LA24_0<=53)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // fantastic4.g:98:16: neg
                    {
                    pushFollow(FOLLOW_neg_in_negExpression1227);
                    neg103=neg();

                    state._fsp--;

                    adaptor.addChild(root_0, neg103.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expressionAtom_in_negExpression1230);
            expressionAtom104=expressionAtom();

            state._fsp--;

            adaptor.addChild(root_0, expressionAtom104.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "negExpression"

    public static class expressionAtom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionAtom"
    // fantastic4.g:101:2: expressionAtom : ( -> EPSILON | cste -> cste | IDF -> IDF | ( '(' add ')' ) -> add | IDF '(' exprlist ')' -> ^( IDF exprlist ) );
    public final fantastic4Parser.expressionAtom_return expressionAtom() throws RecognitionException {
        fantastic4Parser.expressionAtom_return retval = new fantastic4Parser.expressionAtom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        Token IDF110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        fantastic4Parser.cste_return cste105 = null;

        fantastic4Parser.add_return add108 = null;

        fantastic4Parser.exprlist_return exprlist112 = null;


        Object IDF106_tree=null;
        Object char_literal107_tree=null;
        Object char_literal109_tree=null;
        Object IDF110_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_cste=new RewriteRuleSubtreeStream(adaptor,"rule cste");
        RewriteRuleSubtreeStream stream_exprlist=new RewriteRuleSubtreeStream(adaptor,"rule exprlist");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        try {
            // fantastic4.g:101:17: ( -> EPSILON | cste -> cste | IDF -> IDF | ( '(' add ')' ) -> add | IDF '(' exprlist ')' -> ^( IDF exprlist ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
            case 26:
            case 29:
            case 33:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt25=1;
                }
                break;
            case CSTEINT:
            case CSTEBOOL:
            case CSTESTRING:
                {
                alt25=2;
                }
                break;
            case IDF:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==25) ) {
                    alt25=5;
                }
                else if ( ((LA25_3>=18 && LA25_3<=19)||LA25_3==26||LA25_3==29||LA25_3==33||(LA25_3>=40 && LA25_3<=51)) ) {
                    alt25=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // fantastic4.g:101:19: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:19: -> EPSILON
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(EPSILON, "EPSILON"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:102:9: cste
                    {
                    pushFollow(FOLLOW_cste_in_expressionAtom1254);
                    cste105=cste();

                    state._fsp--;

                    stream_cste.add(cste105.getTree());


                    // AST REWRITE
                    // elements: cste
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:14: -> cste
                    {
                        adaptor.addChild(root_0, stream_cste.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // fantastic4.g:103:9: IDF
                    {
                    IDF106=(Token)match(input,IDF,FOLLOW_IDF_in_expressionAtom1268);  
                    stream_IDF.add(IDF106);



                    // AST REWRITE
                    // elements: IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:13: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // fantastic4.g:104:8: ( '(' add ')' )
                    {
                    // fantastic4.g:104:8: ( '(' add ')' )
                    // fantastic4.g:104:10: '(' add ')'
                    {
                    char_literal107=(Token)match(input,25,FOLLOW_25_in_expressionAtom1283);  
                    stream_25.add(char_literal107);

                    pushFollow(FOLLOW_add_in_expressionAtom1285);
                    add108=add();

                    state._fsp--;

                    stream_add.add(add108.getTree());
                    char_literal109=(Token)match(input,26,FOLLOW_26_in_expressionAtom1287);  
                    stream_26.add(char_literal109);


                    }



                    // AST REWRITE
                    // elements: add
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:24: -> add
                    {
                        adaptor.addChild(root_0, stream_add.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // fantastic4.g:105:7: IDF '(' exprlist ')'
                    {
                    IDF110=(Token)match(input,IDF,FOLLOW_IDF_in_expressionAtom1301);  
                    stream_IDF.add(IDF110);

                    char_literal111=(Token)match(input,25,FOLLOW_25_in_expressionAtom1303);  
                    stream_25.add(char_literal111);

                    pushFollow(FOLLOW_exprlist_in_expressionAtom1305);
                    exprlist112=exprlist();

                    state._fsp--;

                    stream_exprlist.add(exprlist112.getTree());
                    char_literal113=(Token)match(input,26,FOLLOW_26_in_expressionAtom1307);  
                    stream_26.add(char_literal113);



                    // AST REWRITE
                    // elements: IDF, exprlist
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:28: -> ^( IDF exprlist )
                    {
                        // fantastic4.g:105:31: ^( IDF exprlist )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_exprlist.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionAtom"

    public static class addSubtractOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addSubtractOp"
    // fantastic4.g:107:1: addSubtractOp : ( '+' -> '+' | '-' -> '-' );
    public final fantastic4Parser.addSubtractOp_return addSubtractOp() throws RecognitionException {
        fantastic4Parser.addSubtractOp_return retval = new fantastic4Parser.addSubtractOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal114=null;
        Token char_literal115=null;

        Object char_literal114_tree=null;
        Object char_literal115_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");

        try {
            // fantastic4.g:108:2: ( '+' -> '+' | '-' -> '-' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            else if ( (LA26_0==44) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // fantastic4.g:108:4: '+'
                    {
                    char_literal114=(Token)match(input,43,FOLLOW_43_in_addSubtractOp1329);  
                    stream_43.add(char_literal114);



                    // AST REWRITE
                    // elements: 43
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:8: -> '+'
                    {
                        adaptor.addChild(root_0, stream_43.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:109:6: '-'
                    {
                    char_literal115=(Token)match(input,44,FOLLOW_44_in_addSubtractOp1340);  
                    stream_44.add(char_literal115);



                    // AST REWRITE
                    // elements: 44
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:10: -> '-'
                    {
                        adaptor.addChild(root_0, stream_44.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addSubtractOp"

    public static class multiplyDivideOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplyDivideOp"
    // fantastic4.g:112:1: multiplyDivideOp : ( '*' -> '*' | '/' -> '/' );
    public final fantastic4Parser.multiplyDivideOp_return multiplyDivideOp() throws RecognitionException {
        fantastic4Parser.multiplyDivideOp_return retval = new fantastic4Parser.multiplyDivideOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal116=null;
        Token char_literal117=null;

        Object char_literal116_tree=null;
        Object char_literal117_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");

        try {
            // fantastic4.g:113:2: ( '*' -> '*' | '/' -> '/' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // fantastic4.g:113:4: '*'
                    {
                    char_literal116=(Token)match(input,45,FOLLOW_45_in_multiplyDivideOp1361);  
                    stream_45.add(char_literal116);



                    // AST REWRITE
                    // elements: 45
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:8: -> '*'
                    {
                        adaptor.addChild(root_0, stream_45.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:114:6: '/'
                    {
                    char_literal117=(Token)match(input,46,FOLLOW_46_in_multiplyDivideOp1372);  
                    stream_46.add(char_literal117);



                    // AST REWRITE
                    // elements: 46
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:10: -> '/'
                    {
                        adaptor.addChild(root_0, stream_46.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplyDivideOp"

    public static class comparatorOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparatorOp"
    // fantastic4.g:118:1: comparatorOp : ( '>' -> '>' | '<' -> '<' | '>=' -> '>=' | '<=' -> '<=' | '!=' -> '!=' );
    public final fantastic4Parser.comparatorOp_return comparatorOp() throws RecognitionException {
        fantastic4Parser.comparatorOp_return retval = new fantastic4Parser.comparatorOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal118=null;
        Token char_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;

        Object char_literal118_tree=null;
        Object char_literal119_tree=null;
        Object string_literal120_tree=null;
        Object string_literal121_tree=null;
        Object string_literal122_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // fantastic4.g:119:2: ( '>' -> '>' | '<' -> '<' | '>=' -> '>=' | '<=' -> '<=' | '!=' -> '!=' )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt28=1;
                }
                break;
            case 48:
                {
                alt28=2;
                }
                break;
            case 49:
                {
                alt28=3;
                }
                break;
            case 50:
                {
                alt28=4;
                }
                break;
            case 51:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // fantastic4.g:119:4: '>'
                    {
                    char_literal118=(Token)match(input,47,FOLLOW_47_in_comparatorOp1394);  
                    stream_47.add(char_literal118);



                    // AST REWRITE
                    // elements: 47
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:8: -> '>'
                    {
                        adaptor.addChild(root_0, stream_47.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:120:5: '<'
                    {
                    char_literal119=(Token)match(input,48,FOLLOW_48_in_comparatorOp1404);  
                    stream_48.add(char_literal119);



                    // AST REWRITE
                    // elements: 48
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:9: -> '<'
                    {
                        adaptor.addChild(root_0, stream_48.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // fantastic4.g:121:5: '>='
                    {
                    string_literal120=(Token)match(input,49,FOLLOW_49_in_comparatorOp1414);  
                    stream_49.add(string_literal120);



                    // AST REWRITE
                    // elements: 49
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:10: -> '>='
                    {
                        adaptor.addChild(root_0, stream_49.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // fantastic4.g:122:4: '<='
                    {
                    string_literal121=(Token)match(input,50,FOLLOW_50_in_comparatorOp1423);  
                    stream_50.add(string_literal121);



                    // AST REWRITE
                    // elements: 50
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:9: -> '<='
                    {
                        adaptor.addChild(root_0, stream_50.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // fantastic4.g:123:4: '!='
                    {
                    string_literal122=(Token)match(input,51,FOLLOW_51_in_comparatorOp1432);  
                    stream_51.add(string_literal122);



                    // AST REWRITE
                    // elements: 51
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:9: -> '!='
                    {
                        adaptor.addChild(root_0, stream_51.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparatorOp"

    public static class cste_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cste"
    // fantastic4.g:126:1: cste : ( CSTEINT -> CSTEINT | CSTEBOOL -> CSTEBOOL | CSTESTRING -> CSTESTRING );
    public final fantastic4Parser.cste_return cste() throws RecognitionException {
        fantastic4Parser.cste_return retval = new fantastic4Parser.cste_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CSTEINT123=null;
        Token CSTEBOOL124=null;
        Token CSTESTRING125=null;

        Object CSTEINT123_tree=null;
        Object CSTEBOOL124_tree=null;
        Object CSTESTRING125_tree=null;
        RewriteRuleTokenStream stream_CSTEBOOL=new RewriteRuleTokenStream(adaptor,"token CSTEBOOL");
        RewriteRuleTokenStream stream_CSTEINT=new RewriteRuleTokenStream(adaptor,"token CSTEINT");
        RewriteRuleTokenStream stream_CSTESTRING=new RewriteRuleTokenStream(adaptor,"token CSTESTRING");

        try {
            // fantastic4.g:126:7: ( CSTEINT -> CSTEINT | CSTEBOOL -> CSTEBOOL | CSTESTRING -> CSTESTRING )
            int alt29=3;
            switch ( input.LA(1) ) {
            case CSTEINT:
                {
                alt29=1;
                }
                break;
            case CSTEBOOL:
                {
                alt29=2;
                }
                break;
            case CSTESTRING:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // fantastic4.g:126:9: CSTEINT
                    {
                    CSTEINT123=(Token)match(input,CSTEINT,FOLLOW_CSTEINT_in_cste1447);  
                    stream_CSTEINT.add(CSTEINT123);



                    // AST REWRITE
                    // elements: CSTEINT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:17: -> CSTEINT
                    {
                        adaptor.addChild(root_0, stream_CSTEINT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:127:6: CSTEBOOL
                    {
                    CSTEBOOL124=(Token)match(input,CSTEBOOL,FOLLOW_CSTEBOOL_in_cste1458);  
                    stream_CSTEBOOL.add(CSTEBOOL124);



                    // AST REWRITE
                    // elements: CSTEBOOL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:15: -> CSTEBOOL
                    {
                        adaptor.addChild(root_0, stream_CSTEBOOL.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // fantastic4.g:128:6: CSTESTRING
                    {
                    CSTESTRING125=(Token)match(input,CSTESTRING,FOLLOW_CSTESTRING_in_cste1469);  
                    stream_CSTESTRING.add(CSTESTRING125);



                    // AST REWRITE
                    // elements: CSTESTRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:17: -> CSTESTRING
                    {
                        adaptor.addChild(root_0, stream_CSTESTRING.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cste"

    public static class neg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "neg"
    // fantastic4.g:131:1: neg : ( 'not' -> 'not' | '!' -> '!' );
    public final fantastic4Parser.neg_return neg() throws RecognitionException {
        fantastic4Parser.neg_return retval = new fantastic4Parser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal126=null;
        Token char_literal127=null;

        Object string_literal126_tree=null;
        Object char_literal127_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // fantastic4.g:131:13: ( 'not' -> 'not' | '!' -> '!' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            else if ( (LA30_0==53) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // fantastic4.g:131:15: 'not'
                    {
                    string_literal126=(Token)match(input,52,FOLLOW_52_in_neg1505);  
                    stream_52.add(string_literal126);



                    // AST REWRITE
                    // elements: 52
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:21: -> 'not'
                    {
                        adaptor.addChild(root_0, stream_52.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:132:3: '!'
                    {
                    char_literal127=(Token)match(input,53,FOLLOW_53_in_neg1513);  
                    stream_53.add(char_literal127);



                    // AST REWRITE
                    // elements: 53
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:7: -> '!'
                    {
                        adaptor.addChild(root_0, stream_53.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "neg"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA10_eotS =
        "\20\uffff";
    static final String DFA10_eofS =
        "\20\uffff";
    static final String DFA10_minS =
        "\1\11\1\21\1\11\1\24\1\21\4\23\1\24\2\uffff\4\23";
    static final String DFA10_maxS =
        "\1\33\1\21\1\11\1\27\1\21\4\32\1\27\2\uffff\4\32";
    static final String DFA10_acceptS =
        "\12\uffff\1\1\1\2\4\uffff";
    static final String DFA10_specialS =
        "\20\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\21\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\5\1\6\1\7\1\10",
            "\1\11",
            "\1\13\6\uffff\1\12",
            "\1\13\6\uffff\1\12",
            "\1\13\6\uffff\1\12",
            "\1\13\6\uffff\1\12",
            "\1\14\1\15\1\16\1\17",
            "",
            "",
            "\1\13\6\uffff\1\12",
            "\1\13\6\uffff\1\12",
            "\1\13\6\uffff\1\12",
            "\1\13\6\uffff\1\12"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "37:1: arglist : ( arg | arg ',' arglist -> ^( ARGUMENTS arg arglist ) );";
        }
    }
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\11\2\uffff\1\31\6\uffff";
    static final String DFA14_maxS =
        "\1\47\2\uffff\1\42\6\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\6\1\7\1\10\1\3\1\5";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\22\uffff\1\1\3\uffff\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1"+
            "\7",
            "",
            "",
            "\1\11\10\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "45:1: instr : ( 'if' expr 'then' instr ( 'else' instr )? 'fi' -> ^( 'if' expr ^( 'then' instr ) ( ^( 'else' instr ) )? ) | 'while' expr 'do' instr -> ^( 'while' expr ^( BLOCK instr ) ) | IDF '=' expr ';' -> ^( '=' IDF expr ) | 'return' returnable -> ^( 'return' returnable ) | IDF '(' exprlist ')' ';' -> ^( CALLFUNCTION IDF exprlist ) | '{' ( sequence )? '}' -> ( sequence )? | 'read' IDF ';' -> ^( 'read' IDF ) | 'write' writable ';' -> ^( 'write' writable ) );";
        }
    }
 

    public static final BitSet FOLLOW_15_in_prog56 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IDF_in_prog58 = new BitSet(new long[]{0x000000D911010202L});
    public static final BitSet FOLLOW_vardeclist_in_prog60 = new BitSet(new long[]{0x000000D911000202L});
    public static final BitSet FOLLOW_funcdeclist_in_prog63 = new BitSet(new long[]{0x000000D910000202L});
    public static final BitSet FOLLOW_instr_in_prog66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varsuitdecl_in_vardeclist104 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_vardeclist_in_vardeclist106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_varsuitdecl148 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_idenlist_in_varsuitdecl150 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_varsuitdecl152 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_typename_in_varsuitdecl154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_varsuitdecl156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_idenlist200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_idenlist223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_idenlist225 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_idenlist_in_idenlist227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_typename269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_typename289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_typename309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_typename330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcdecl_in_funcdeclist367 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_funcdeclist_in_funcdeclist369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_funcdecl406 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IDF_in_funcdecl408 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_funcdecl410 = new BitSet(new long[]{0x000000000C000200L});
    public static final BitSet FOLLOW_arglist_in_funcdecl412 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_funcdecl415 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_funcdecl417 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_typename_in_funcdecl419 = new BitSet(new long[]{0x000000D910010200L});
    public static final BitSet FOLLOW_vardeclist_in_funcdecl421 = new BitSet(new long[]{0x000000D910000200L});
    public static final BitSet FOLLOW_instr_in_funcdecl424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arglist471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arglist488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_arglist490 = new BitSet(new long[]{0x0000000008000200L});
    public static final BitSet FOLLOW_arglist_in_arglist492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_arg531 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_arg533 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_typename_in_arg535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_arg561 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IDF_in_arg563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_arg565 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_typename_in_arg567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_instr616 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_expr_in_instr618 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_instr620 = new BitSet(new long[]{0x000000D910000200L});
    public static final BitSet FOLLOW_instr_in_instr622 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_instr625 = new BitSet(new long[]{0x000000D910000200L});
    public static final BitSet FOLLOW_instr_in_instr628 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_instr632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_instr670 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_expr_in_instr672 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_instr674 = new BitSet(new long[]{0x000000D910000200L});
    public static final BitSet FOLLOW_instr_in_instr676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr706 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_instr708 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_expr_in_instr710 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_instr712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_instr739 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_returnable_in_instr741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr765 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instr767 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_exprlist_in_instr769 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_instr771 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_instr773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_instr801 = new BitSet(new long[]{0x000000F910000200L});
    public static final BitSet FOLLOW_sequence_in_instr803 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_instr806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_instr828 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IDF_in_instr830 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_instr832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_instr856 = new BitSet(new long[]{0x0000000000001E00L});
    public static final BitSet FOLLOW_writable_in_instr858 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_instr860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_returnable889 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_returnable891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_writable911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cste_in_writable931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instr_in_sequence960 = new BitSet(new long[]{0x000000D910000202L});
    public static final BitSet FOLLOW_sequence_in_sequence963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprlist1007 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_nextexpr_in_exprlist1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_nextexpr1040 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_exprlist_in_nextexpr1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_expr1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_add1087 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_addSubtractOp_in_add1090 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_add_in_add1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_mult1111 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_multiplyDivideOp_in_mult1114 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_mult_in_mult1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_in_and1138 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_and1141 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_and_in_and1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_comp1160 = new BitSet(new long[]{0x000F800000000002L});
    public static final BitSet FOLLOW_comparatorOp_in_comp1163 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_comp_in_comp1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_puis_in_or1185 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_or1188 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_or_in_or1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negExpression_in_puis1209 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_puis1212 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_puis_in_puis1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neg_in_negExpression1227 = new BitSet(new long[]{0x0000000002001E00L});
    public static final BitSet FOLLOW_expressionAtom_in_negExpression1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cste_in_expressionAtom1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expressionAtom1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_expressionAtom1283 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_add_in_expressionAtom1285 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expressionAtom1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expressionAtom1301 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_expressionAtom1303 = new BitSet(new long[]{0x0030000002001E00L});
    public static final BitSet FOLLOW_exprlist_in_expressionAtom1305 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expressionAtom1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_addSubtractOp1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_addSubtractOp1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_multiplyDivideOp1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_multiplyDivideOp1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_comparatorOp1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_comparatorOp1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_comparatorOp1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_comparatorOp1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_comparatorOp1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTEINT_in_cste1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTEBOOL_in_cste1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTESTRING_in_cste1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_neg1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_neg1513 = new BitSet(new long[]{0x0000000000000002L});

}