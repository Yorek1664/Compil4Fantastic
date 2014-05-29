// $ANTLR 3.3 Nov 30, 2010 12:50:56 fantastic4.g 2014-05-29 15:55:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class fantastic4Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDF", "CSTEINT", "CSTEBOOL", "CSTESTRING", "COMM", "WS", "'program'", "'var'", "':'", "';'", "','", "'void'", "'bool'", "'int'", "'char'", "'function'", "'('", "')'", "'ref'", "'if'", "'then'", "'else'", "'while'", "'do'", "'='", "'return'", "'{'", "'}'", "'read'", "'write'", "'&&'", "'||'", "'^'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'!='", "'not'", "'!'"
    };
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int IDF=4;
    public static final int CSTEINT=5;
    public static final int CSTEBOOL=6;
    public static final int CSTESTRING=7;
    public static final int COMM=8;
    public static final int WS=9;

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // fantastic4.g:11:1: prog : 'program' IDF ( vardeclist )? ( funcdeclist )? instr -> ^( 'program' IDF ) ;
    public final fantastic4Parser.prog_return prog() throws RecognitionException {
        fantastic4Parser.prog_return retval = new fantastic4Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal1=null;
        Token IDF2=null;
        fantastic4Parser.vardeclist_return vardeclist3 = null;

        fantastic4Parser.funcdeclist_return funcdeclist4 = null;

        fantastic4Parser.instr_return instr5 = null;


        CommonTree string_literal1_tree=null;
        CommonTree IDF2_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");
        RewriteRuleSubtreeStream stream_vardeclist=new RewriteRuleSubtreeStream(adaptor,"rule vardeclist");
        RewriteRuleSubtreeStream stream_funcdeclist=new RewriteRuleSubtreeStream(adaptor,"rule funcdeclist");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // fantastic4.g:11:13: ( 'program' IDF ( vardeclist )? ( funcdeclist )? instr -> ^( 'program' IDF ) )
            // fantastic4.g:11:15: 'program' IDF ( vardeclist )? ( funcdeclist )? instr
            {
            string_literal1=(Token)match(input,10,FOLLOW_10_in_prog50);  
            stream_10.add(string_literal1);

            IDF2=(Token)match(input,IDF,FOLLOW_IDF_in_prog52);  
            stream_IDF.add(IDF2);

            // fantastic4.g:11:29: ( vardeclist )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // fantastic4.g:11:29: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_prog54);
                    vardeclist3=vardeclist();

                    state._fsp--;

                    stream_vardeclist.add(vardeclist3.getTree());

                    }
                    break;

            }

            // fantastic4.g:11:41: ( funcdeclist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // fantastic4.g:11:41: funcdeclist
                    {
                    pushFollow(FOLLOW_funcdeclist_in_prog57);
                    funcdeclist4=funcdeclist();

                    state._fsp--;

                    stream_funcdeclist.add(funcdeclist4.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_instr_in_prog60);
            instr5=instr();

            state._fsp--;

            stream_instr.add(instr5.getTree());


            // AST REWRITE
            // elements: IDF, 10
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 11:60: -> ^( 'program' IDF )
            {
                // fantastic4.g:11:63: ^( 'program' IDF )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_10.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class vardeclist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vardeclist"
    // fantastic4.g:14:1: vardeclist : varsuitdecl ( vardeclist )? ;
    public final fantastic4Parser.vardeclist_return vardeclist() throws RecognitionException {
        fantastic4Parser.vardeclist_return retval = new fantastic4Parser.vardeclist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.varsuitdecl_return varsuitdecl6 = null;

        fantastic4Parser.vardeclist_return vardeclist7 = null;



        try {
            // fantastic4.g:14:13: ( varsuitdecl ( vardeclist )? )
            // fantastic4.g:14:15: varsuitdecl ( vardeclist )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_varsuitdecl_in_vardeclist90);
            varsuitdecl6=varsuitdecl();

            state._fsp--;

            adaptor.addChild(root_0, varsuitdecl6.getTree());
            // fantastic4.g:14:27: ( vardeclist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // fantastic4.g:14:27: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_vardeclist92);
                    vardeclist7=vardeclist();

                    state._fsp--;

                    adaptor.addChild(root_0, vardeclist7.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vardeclist"

    public static class varsuitdecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varsuitdecl"
    // fantastic4.g:17:1: varsuitdecl : 'var' idenlist ':' typename ';' -> 'var' ;
    public final fantastic4Parser.varsuitdecl_return varsuitdecl() throws RecognitionException {
        fantastic4Parser.varsuitdecl_return retval = new fantastic4Parser.varsuitdecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal8=null;
        Token char_literal10=null;
        Token char_literal12=null;
        fantastic4Parser.idenlist_return idenlist9 = null;

        fantastic4Parser.typename_return typename11 = null;


        CommonTree string_literal8_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleSubtreeStream stream_idenlist=new RewriteRuleSubtreeStream(adaptor,"rule idenlist");
        RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");
        try {
            // fantastic4.g:17:13: ( 'var' idenlist ':' typename ';' -> 'var' )
            // fantastic4.g:17:15: 'var' idenlist ':' typename ';'
            {
            string_literal8=(Token)match(input,11,FOLLOW_11_in_varsuitdecl127);  
            stream_11.add(string_literal8);

            pushFollow(FOLLOW_idenlist_in_varsuitdecl129);
            idenlist9=idenlist();

            state._fsp--;

            stream_idenlist.add(idenlist9.getTree());
            char_literal10=(Token)match(input,12,FOLLOW_12_in_varsuitdecl131);  
            stream_12.add(char_literal10);

            pushFollow(FOLLOW_typename_in_varsuitdecl133);
            typename11=typename();

            state._fsp--;

            stream_typename.add(typename11.getTree());
            char_literal12=(Token)match(input,13,FOLLOW_13_in_varsuitdecl135);  
            stream_13.add(char_literal12);



            // AST REWRITE
            // elements: 11
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 17:47: -> 'var'
            {
                adaptor.addChild(root_0, stream_11.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varsuitdecl"

    public static class idenlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idenlist"
    // fantastic4.g:20:1: idenlist : ( IDF -> ^( IDF ':' ) | IDF ',' idenlist -> ^( IDF ',' ) );
    public final fantastic4Parser.idenlist_return idenlist() throws RecognitionException {
        fantastic4Parser.idenlist_return retval = new fantastic4Parser.idenlist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF13=null;
        Token IDF14=null;
        Token char_literal15=null;
        fantastic4Parser.idenlist_return idenlist16 = null;


        CommonTree IDF13_tree=null;
        CommonTree IDF14_tree=null;
        CommonTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_idenlist=new RewriteRuleSubtreeStream(adaptor,"rule idenlist");
        try {
            // fantastic4.g:20:13: ( IDF -> ^( IDF ':' ) | IDF ',' idenlist -> ^( IDF ',' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDF) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    alt4=2;
                }
                else if ( (LA4_1==12) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // fantastic4.g:20:15: IDF
                    {
                    IDF13=(Token)match(input,IDF,FOLLOW_IDF_in_idenlist175);  
                    stream_IDF.add(IDF13);



                    // AST REWRITE
                    // elements: IDF, 12
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 20:20: -> ^( IDF ':' )
                    {
                        // fantastic4.g:20:23: ^( IDF ':' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(12, "12"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:21:15: IDF ',' idenlist
                    {
                    IDF14=(Token)match(input,IDF,FOLLOW_IDF_in_idenlist200);  
                    stream_IDF.add(IDF14);

                    char_literal15=(Token)match(input,14,FOLLOW_14_in_idenlist202);  
                    stream_14.add(char_literal15);

                    pushFollow(FOLLOW_idenlist_in_idenlist204);
                    idenlist16=idenlist();

                    state._fsp--;

                    stream_idenlist.add(idenlist16.getTree());


                    // AST REWRITE
                    // elements: 14, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 21:32: -> ^( IDF ',' )
                    {
                        // fantastic4.g:21:35: ^( IDF ',' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_14.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idenlist"

    public static class typename_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typename"
    // fantastic4.g:24:1: typename : ( 'void' -> 'void' | 'bool' -> 'bool' | 'int' -> 'int' | 'char' -> 'char' );
    public final fantastic4Parser.typename_return typename() throws RecognitionException {
        fantastic4Parser.typename_return retval = new fantastic4Parser.typename_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal17=null;
        Token string_literal18=null;
        Token string_literal19=null;
        Token string_literal20=null;

        CommonTree string_literal17_tree=null;
        CommonTree string_literal18_tree=null;
        CommonTree string_literal19_tree=null;
        CommonTree string_literal20_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");

        try {
            // fantastic4.g:24:13: ( 'void' -> 'void' | 'bool' -> 'bool' | 'int' -> 'int' | 'char' -> 'char' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // fantastic4.g:24:15: 'void'
                    {
                    string_literal17=(Token)match(input,15,FOLLOW_15_in_typename248);  
                    stream_15.add(string_literal17);



                    // AST REWRITE
                    // elements: 15
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 24:22: -> 'void'
                    {
                        adaptor.addChild(root_0, stream_15.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // fantastic4.g:25:15: 'bool'
                    {
                    string_literal18=(Token)match(input,16,FOLLOW_16_in_typename268);  
                    stream_16.add(string_literal18);



                    // AST REWRITE
                    // elements: 16
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 25:22: -> 'bool'
                    {
                        adaptor.addChild(root_0, stream_16.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // fantastic4.g:26:15: 'int'
                    {
                    string_literal19=(Token)match(input,17,FOLLOW_17_in_typename288);  
                    stream_17.add(string_literal19);



                    // AST REWRITE
                    // elements: 17
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 26:22: -> 'int'
                    {
                        adaptor.addChild(root_0, stream_17.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // fantastic4.g:27:15: 'char'
                    {
                    string_literal20=(Token)match(input,18,FOLLOW_18_in_typename309);  
                    stream_18.add(string_literal20);



                    // AST REWRITE
                    // elements: 18
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 27:22: -> 'char'
                    {
                        adaptor.addChild(root_0, stream_18.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typename"

    public static class funcdeclist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcdeclist"
    // fantastic4.g:30:1: funcdeclist : funcdecl ( funcdeclist )? ;
    public final fantastic4Parser.funcdeclist_return funcdeclist() throws RecognitionException {
        fantastic4Parser.funcdeclist_return retval = new fantastic4Parser.funcdeclist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.funcdecl_return funcdecl21 = null;

        fantastic4Parser.funcdeclist_return funcdeclist22 = null;



        try {
            // fantastic4.g:30:13: ( funcdecl ( funcdeclist )? )
            // fantastic4.g:30:15: funcdecl ( funcdeclist )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_funcdecl_in_funcdeclist346);
            funcdecl21=funcdecl();

            state._fsp--;

            adaptor.addChild(root_0, funcdecl21.getTree());
            // fantastic4.g:30:24: ( funcdeclist )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // fantastic4.g:30:24: funcdeclist
                    {
                    pushFollow(FOLLOW_funcdeclist_in_funcdeclist348);
                    funcdeclist22=funcdeclist();

                    state._fsp--;

                    adaptor.addChild(root_0, funcdeclist22.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcdeclist"

    public static class funcdecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcdecl"
    // fantastic4.g:33:1: funcdecl : 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr -> ^( 'function' IDF '(' ')' ':' ) ;
    public final fantastic4Parser.funcdecl_return funcdecl() throws RecognitionException {
        fantastic4Parser.funcdecl_return retval = new fantastic4Parser.funcdecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal23=null;
        Token IDF24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal28=null;
        fantastic4Parser.arglist_return arglist26 = null;

        fantastic4Parser.typename_return typename29 = null;

        fantastic4Parser.vardeclist_return vardeclist30 = null;

        fantastic4Parser.instr_return instr31 = null;


        CommonTree string_literal23_tree=null;
        CommonTree IDF24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleSubtreeStream stream_vardeclist=new RewriteRuleSubtreeStream(adaptor,"rule vardeclist");
        RewriteRuleSubtreeStream stream_arglist=new RewriteRuleSubtreeStream(adaptor,"rule arglist");
        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");
        try {
            // fantastic4.g:33:13: ( 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr -> ^( 'function' IDF '(' ')' ':' ) )
            // fantastic4.g:33:15: 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr
            {
            string_literal23=(Token)match(input,19,FOLLOW_19_in_funcdecl385);  
            stream_19.add(string_literal23);

            IDF24=(Token)match(input,IDF,FOLLOW_IDF_in_funcdecl387);  
            stream_IDF.add(IDF24);

            char_literal25=(Token)match(input,20,FOLLOW_20_in_funcdecl389);  
            stream_20.add(char_literal25);

            pushFollow(FOLLOW_arglist_in_funcdecl391);
            arglist26=arglist();

            state._fsp--;

            stream_arglist.add(arglist26.getTree());
            char_literal27=(Token)match(input,21,FOLLOW_21_in_funcdecl393);  
            stream_21.add(char_literal27);

            char_literal28=(Token)match(input,12,FOLLOW_12_in_funcdecl395);  
            stream_12.add(char_literal28);

            pushFollow(FOLLOW_typename_in_funcdecl397);
            typename29=typename();

            state._fsp--;

            stream_typename.add(typename29.getTree());
            // fantastic4.g:33:59: ( vardeclist )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // fantastic4.g:33:59: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_funcdecl399);
                    vardeclist30=vardeclist();

                    state._fsp--;

                    stream_vardeclist.add(vardeclist30.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_instr_in_funcdecl402);
            instr31=instr();

            state._fsp--;

            stream_instr.add(instr31.getTree());


            // AST REWRITE
            // elements: 20, 12, 21, IDF, 19
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 33:77: -> ^( 'function' IDF '(' ')' ':' )
            {
                // fantastic4.g:33:80: ^( 'function' IDF '(' ')' ':' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_19.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_20.nextNode());
                adaptor.addChild(root_1, stream_21.nextNode());
                adaptor.addChild(root_1, stream_12.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcdecl"

    public static class arglist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arglist"
    // fantastic4.g:36:1: arglist : ( | arg | arg ',' arglist );
    public final fantastic4Parser.arglist_return arglist() throws RecognitionException {
        fantastic4Parser.arglist_return retval = new fantastic4Parser.arglist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal34=null;
        fantastic4Parser.arg_return arg32 = null;

        fantastic4Parser.arg_return arg33 = null;

        fantastic4Parser.arglist_return arglist35 = null;


        CommonTree char_literal34_tree=null;

        try {
            // fantastic4.g:36:13: ( | arg | arg ',' arglist )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // fantastic4.g:37:13: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;
                case 2 :
                    // fantastic4.g:37:15: arg
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arg_in_arglist455);
                    arg32=arg();

                    state._fsp--;

                    adaptor.addChild(root_0, arg32.getTree());

                    }
                    break;
                case 3 :
                    // fantastic4.g:38:15: arg ',' arglist
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arg_in_arglist471);
                    arg33=arg();

                    state._fsp--;

                    adaptor.addChild(root_0, arg33.getTree());
                    char_literal34=(Token)match(input,14,FOLLOW_14_in_arglist473); 
                    char_literal34_tree = (CommonTree)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);

                    pushFollow(FOLLOW_arglist_in_arglist475);
                    arglist35=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arglist"

    public static class arg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg"
    // fantastic4.g:41:1: arg : ( IDF ':' typename | 'ref' IDF ':' typename );
    public final fantastic4Parser.arg_return arg() throws RecognitionException {
        fantastic4Parser.arg_return retval = new fantastic4Parser.arg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF36=null;
        Token char_literal37=null;
        Token string_literal39=null;
        Token IDF40=null;
        Token char_literal41=null;
        fantastic4Parser.typename_return typename38 = null;

        fantastic4Parser.typename_return typename42 = null;


        CommonTree IDF36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree string_literal39_tree=null;
        CommonTree IDF40_tree=null;
        CommonTree char_literal41_tree=null;

        try {
            // fantastic4.g:41:13: ( IDF ':' typename | 'ref' IDF ':' typename )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDF) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // fantastic4.g:41:15: IDF ':' typename
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF36=(Token)match(input,IDF,FOLLOW_IDF_in_arg504); 
                    IDF36_tree = (CommonTree)adaptor.create(IDF36);
                    adaptor.addChild(root_0, IDF36_tree);

                    char_literal37=(Token)match(input,12,FOLLOW_12_in_arg506); 
                    char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
                    adaptor.addChild(root_0, char_literal37_tree);

                    pushFollow(FOLLOW_typename_in_arg508);
                    typename38=typename();

                    state._fsp--;

                    adaptor.addChild(root_0, typename38.getTree());

                    }
                    break;
                case 2 :
                    // fantastic4.g:42:15: 'ref' IDF ':' typename
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal39=(Token)match(input,22,FOLLOW_22_in_arg524); 
                    string_literal39_tree = (CommonTree)adaptor.create(string_literal39);
                    adaptor.addChild(root_0, string_literal39_tree);

                    IDF40=(Token)match(input,IDF,FOLLOW_IDF_in_arg526); 
                    IDF40_tree = (CommonTree)adaptor.create(IDF40);
                    adaptor.addChild(root_0, IDF40_tree);

                    char_literal41=(Token)match(input,12,FOLLOW_12_in_arg528); 
                    char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
                    adaptor.addChild(root_0, char_literal41_tree);

                    pushFollow(FOLLOW_typename_in_arg530);
                    typename42=typename();

                    state._fsp--;

                    adaptor.addChild(root_0, typename42.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg"

    public static class instr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // fantastic4.g:45:1: instr : ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr ';' | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF ';' | 'write' writable ';' );
    public final fantastic4Parser.instr_return instr() throws RecognitionException {
        fantastic4Parser.instr_return retval = new fantastic4Parser.instr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        Token string_literal45=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Token IDF53=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token string_literal57=null;
        Token IDF59=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token string_literal66=null;
        Token IDF67=null;
        Token char_literal68=null;
        Token string_literal69=null;
        Token char_literal71=null;
        fantastic4Parser.expr_return expr44 = null;

        fantastic4Parser.instr_return instr46 = null;

        fantastic4Parser.instr_return instr48 = null;

        fantastic4Parser.expr_return expr50 = null;

        fantastic4Parser.instr_return instr52 = null;

        fantastic4Parser.expr_return expr55 = null;

        fantastic4Parser.returnable_return returnable58 = null;

        fantastic4Parser.exprlist_return exprlist61 = null;

        fantastic4Parser.sequence_return sequence64 = null;

        fantastic4Parser.writable_return writable70 = null;


        CommonTree string_literal43_tree=null;
        CommonTree string_literal45_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree IDF53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree string_literal57_tree=null;
        CommonTree IDF59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree string_literal66_tree=null;
        CommonTree IDF67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree char_literal71_tree=null;

        try {
            // fantastic4.g:45:13: ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr ';' | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF ';' | 'write' writable ';' )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // fantastic4.g:45:15: 'if' expr 'then' instr 'else' instr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal43=(Token)match(input,23,FOLLOW_23_in_instr557); 
                    string_literal43_tree = (CommonTree)adaptor.create(string_literal43);
                    adaptor.addChild(root_0, string_literal43_tree);

                    pushFollow(FOLLOW_expr_in_instr559);
                    expr44=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr44.getTree());
                    string_literal45=(Token)match(input,24,FOLLOW_24_in_instr561); 
                    string_literal45_tree = (CommonTree)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);

                    pushFollow(FOLLOW_instr_in_instr563);
                    instr46=instr();

                    state._fsp--;

                    adaptor.addChild(root_0, instr46.getTree());
                    string_literal47=(Token)match(input,25,FOLLOW_25_in_instr565); 
                    string_literal47_tree = (CommonTree)adaptor.create(string_literal47);
                    adaptor.addChild(root_0, string_literal47_tree);

                    pushFollow(FOLLOW_instr_in_instr567);
                    instr48=instr();

                    state._fsp--;

                    adaptor.addChild(root_0, instr48.getTree());

                    }
                    break;
                case 2 :
                    // fantastic4.g:46:15: 'while' expr 'do' instr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal49=(Token)match(input,26,FOLLOW_26_in_instr583); 
                    string_literal49_tree = (CommonTree)adaptor.create(string_literal49);
                    adaptor.addChild(root_0, string_literal49_tree);

                    pushFollow(FOLLOW_expr_in_instr585);
                    expr50=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr50.getTree());
                    string_literal51=(Token)match(input,27,FOLLOW_27_in_instr587); 
                    string_literal51_tree = (CommonTree)adaptor.create(string_literal51);
                    adaptor.addChild(root_0, string_literal51_tree);

                    pushFollow(FOLLOW_instr_in_instr589);
                    instr52=instr();

                    state._fsp--;

                    adaptor.addChild(root_0, instr52.getTree());

                    }
                    break;
                case 3 :
                    // fantastic4.g:47:15: IDF '=' expr ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF53=(Token)match(input,IDF,FOLLOW_IDF_in_instr605); 
                    IDF53_tree = (CommonTree)adaptor.create(IDF53);
                    adaptor.addChild(root_0, IDF53_tree);

                    char_literal54=(Token)match(input,28,FOLLOW_28_in_instr607); 
                    char_literal54_tree = (CommonTree)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);

                    pushFollow(FOLLOW_expr_in_instr609);
                    expr55=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr55.getTree());
                    char_literal56=(Token)match(input,13,FOLLOW_13_in_instr611); 
                    char_literal56_tree = (CommonTree)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);


                    }
                    break;
                case 4 :
                    // fantastic4.g:48:15: 'return' returnable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal57=(Token)match(input,29,FOLLOW_29_in_instr627); 
                    string_literal57_tree = (CommonTree)adaptor.create(string_literal57);
                    adaptor.addChild(root_0, string_literal57_tree);

                    pushFollow(FOLLOW_returnable_in_instr629);
                    returnable58=returnable();

                    state._fsp--;

                    adaptor.addChild(root_0, returnable58.getTree());

                    }
                    break;
                case 5 :
                    // fantastic4.g:49:15: IDF '(' exprlist ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF59=(Token)match(input,IDF,FOLLOW_IDF_in_instr645); 
                    IDF59_tree = (CommonTree)adaptor.create(IDF59);
                    adaptor.addChild(root_0, IDF59_tree);

                    char_literal60=(Token)match(input,20,FOLLOW_20_in_instr647); 
                    char_literal60_tree = (CommonTree)adaptor.create(char_literal60);
                    adaptor.addChild(root_0, char_literal60_tree);

                    pushFollow(FOLLOW_exprlist_in_instr649);
                    exprlist61=exprlist();

                    state._fsp--;

                    adaptor.addChild(root_0, exprlist61.getTree());
                    char_literal62=(Token)match(input,21,FOLLOW_21_in_instr651); 
                    char_literal62_tree = (CommonTree)adaptor.create(char_literal62);
                    adaptor.addChild(root_0, char_literal62_tree);


                    }
                    break;
                case 6 :
                    // fantastic4.g:50:15: '{' sequence '}'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal63=(Token)match(input,30,FOLLOW_30_in_instr667); 
                    char_literal63_tree = (CommonTree)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);

                    pushFollow(FOLLOW_sequence_in_instr669);
                    sequence64=sequence();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence64.getTree());
                    char_literal65=(Token)match(input,31,FOLLOW_31_in_instr671); 
                    char_literal65_tree = (CommonTree)adaptor.create(char_literal65);
                    adaptor.addChild(root_0, char_literal65_tree);


                    }
                    break;
                case 7 :
                    // fantastic4.g:51:15: 'read' IDF ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal66=(Token)match(input,32,FOLLOW_32_in_instr687); 
                    string_literal66_tree = (CommonTree)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    IDF67=(Token)match(input,IDF,FOLLOW_IDF_in_instr689); 
                    IDF67_tree = (CommonTree)adaptor.create(IDF67);
                    adaptor.addChild(root_0, IDF67_tree);

                    char_literal68=(Token)match(input,13,FOLLOW_13_in_instr691); 
                    char_literal68_tree = (CommonTree)adaptor.create(char_literal68);
                    adaptor.addChild(root_0, char_literal68_tree);


                    }
                    break;
                case 8 :
                    // fantastic4.g:52:15: 'write' writable ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal69=(Token)match(input,33,FOLLOW_33_in_instr707); 
                    string_literal69_tree = (CommonTree)adaptor.create(string_literal69);
                    adaptor.addChild(root_0, string_literal69_tree);

                    pushFollow(FOLLOW_writable_in_instr709);
                    writable70=writable();

                    state._fsp--;

                    adaptor.addChild(root_0, writable70.getTree());
                    char_literal71=(Token)match(input,13,FOLLOW_13_in_instr711); 
                    char_literal71_tree = (CommonTree)adaptor.create(char_literal71);
                    adaptor.addChild(root_0, char_literal71_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instr"

    public static class returnable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnable"
    // fantastic4.g:55:1: returnable : expr ';' ;
    public final fantastic4Parser.returnable_return returnable() throws RecognitionException {
        fantastic4Parser.returnable_return retval = new fantastic4Parser.returnable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal73=null;
        fantastic4Parser.expr_return expr72 = null;


        CommonTree char_literal73_tree=null;

        try {
            // fantastic4.g:55:12: ( expr ';' )
            // fantastic4.g:55:14: expr ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_returnable732);
            expr72=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr72.getTree());
            char_literal73=(Token)match(input,13,FOLLOW_13_in_returnable734); 
            char_literal73_tree = (CommonTree)adaptor.create(char_literal73);
            adaptor.addChild(root_0, char_literal73_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnable"

    public static class writable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "writable"
    // fantastic4.g:58:1: writable : ( IDF | cste );
    public final fantastic4Parser.writable_return writable() throws RecognitionException {
        fantastic4Parser.writable_return retval = new fantastic4Parser.writable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF74=null;
        fantastic4Parser.cste_return cste75 = null;


        CommonTree IDF74_tree=null;

        try {
            // fantastic4.g:58:13: ( IDF | cste )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDF) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=CSTEINT && LA11_0<=CSTESTRING)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // fantastic4.g:58:15: IDF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF74=(Token)match(input,IDF,FOLLOW_IDF_in_writable749); 
                    IDF74_tree = (CommonTree)adaptor.create(IDF74);
                    adaptor.addChild(root_0, IDF74_tree);


                    }
                    break;
                case 2 :
                    // fantastic4.g:59:15: cste
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_cste_in_writable765);
                    cste75=cste();

                    state._fsp--;

                    adaptor.addChild(root_0, cste75.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "writable"

    public static class sequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence"
    // fantastic4.g:62:1: sequence : ( | instr sequence );
    public final fantastic4Parser.sequence_return sequence() throws RecognitionException {
        fantastic4Parser.sequence_return retval = new fantastic4Parser.sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.instr_return instr76 = null;

        fantastic4Parser.sequence_return sequence77 = null;



        try {
            // fantastic4.g:62:13: ( | instr sequence )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==IDF||LA12_0==23||LA12_0==26||(LA12_0>=29 && LA12_0<=30)||(LA12_0>=32 && LA12_0<=33)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // fantastic4.g:63:13: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;
                case 2 :
                    // fantastic4.g:63:15: instr sequence
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instr_in_sequence804);
                    instr76=instr();

                    state._fsp--;

                    adaptor.addChild(root_0, instr76.getTree());
                    pushFollow(FOLLOW_sequence_in_sequence807);
                    sequence77=sequence();

                    state._fsp--;

                    adaptor.addChild(root_0, sequence77.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sequence"

    public static class exprlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprlist"
    // fantastic4.g:66:1: exprlist : expr nextexpr ;
    public final fantastic4Parser.exprlist_return exprlist() throws RecognitionException {
        fantastic4Parser.exprlist_return retval = new fantastic4Parser.exprlist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.expr_return expr78 = null;

        fantastic4Parser.nextexpr_return nextexpr79 = null;



        try {
            // fantastic4.g:66:13: ( expr nextexpr )
            // fantastic4.g:66:15: expr nextexpr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprlist843);
            expr78=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr78.getTree());
            pushFollow(FOLLOW_nextexpr_in_exprlist845);
            nextexpr79=nextexpr();

            state._fsp--;

            adaptor.addChild(root_0, nextexpr79.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprlist"

    public static class nextexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nextexpr"
    // fantastic4.g:69:1: nextexpr : ( | ',' expr );
    public final fantastic4Parser.nextexpr_return nextexpr() throws RecognitionException {
        fantastic4Parser.nextexpr_return retval = new fantastic4Parser.nextexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal80=null;
        fantastic4Parser.expr_return expr81 = null;


        CommonTree char_literal80_tree=null;

        try {
            // fantastic4.g:69:13: ( | ',' expr )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // fantastic4.g:70:13: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;
                case 2 :
                    // fantastic4.g:70:15: ',' expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal80=(Token)match(input,14,FOLLOW_14_in_nextexpr883); 
                    char_literal80_tree = (CommonTree)adaptor.create(char_literal80);
                    adaptor.addChild(root_0, char_literal80_tree);

                    pushFollow(FOLLOW_expr_in_nextexpr885);
                    expr81=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr81.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nextexpr"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // fantastic4.g:73:1: expr : add ;
    public final fantastic4Parser.expr_return expr() throws RecognitionException {
        fantastic4Parser.expr_return retval = new fantastic4Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.add_return add82 = null;



        try {
            // fantastic4.g:73:6: ( add )
            // fantastic4.g:73:8: add
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_add_in_expr906);
            add82=add();

            state._fsp--;

            adaptor.addChild(root_0, add82.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // fantastic4.g:76:1: add : mult ( addSubtractOp add )? ;
    public final fantastic4Parser.add_return add() throws RecognitionException {
        fantastic4Parser.add_return retval = new fantastic4Parser.add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.mult_return mult83 = null;

        fantastic4Parser.addSubtractOp_return addSubtractOp84 = null;

        fantastic4Parser.add_return add85 = null;



        try {
            // fantastic4.g:76:5: ( mult ( addSubtractOp add )? )
            // fantastic4.g:76:7: mult ( addSubtractOp add )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add921);
            mult83=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult83.getTree());
            // fantastic4.g:76:12: ( addSubtractOp add )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=37 && LA14_0<=38)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // fantastic4.g:76:13: addSubtractOp add
                    {
                    pushFollow(FOLLOW_addSubtractOp_in_add924);
                    addSubtractOp84=addSubtractOp();

                    state._fsp--;

                    adaptor.addChild(root_0, addSubtractOp84.getTree());
                    pushFollow(FOLLOW_add_in_add926);
                    add85=add();

                    state._fsp--;

                    adaptor.addChild(root_0, add85.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // fantastic4.g:79:1: mult : and ( multiplyDivideOp mult )? ;
    public final fantastic4Parser.mult_return mult() throws RecognitionException {
        fantastic4Parser.mult_return retval = new fantastic4Parser.mult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.and_return and86 = null;

        fantastic4Parser.multiplyDivideOp_return multiplyDivideOp87 = null;

        fantastic4Parser.mult_return mult88 = null;



        try {
            // fantastic4.g:80:2: ( and ( multiplyDivideOp mult )? )
            // fantastic4.g:80:4: and ( multiplyDivideOp mult )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_and_in_mult941);
            and86=and();

            state._fsp--;

            adaptor.addChild(root_0, and86.getTree());
            // fantastic4.g:80:8: ( multiplyDivideOp mult )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=39 && LA15_0<=40)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // fantastic4.g:80:9: multiplyDivideOp mult
                    {
                    pushFollow(FOLLOW_multiplyDivideOp_in_mult944);
                    multiplyDivideOp87=multiplyDivideOp();

                    state._fsp--;

                    adaptor.addChild(root_0, multiplyDivideOp87.getTree());
                    pushFollow(FOLLOW_mult_in_mult947);
                    mult88=mult();

                    state._fsp--;

                    adaptor.addChild(root_0, mult88.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mult"

    public static class and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and"
    // fantastic4.g:83:1: and : comp ( '&&' and )? ;
    public final fantastic4Parser.and_return and() throws RecognitionException {
        fantastic4Parser.and_return retval = new fantastic4Parser.and_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal90=null;
        fantastic4Parser.comp_return comp89 = null;

        fantastic4Parser.and_return and91 = null;


        CommonTree string_literal90_tree=null;

        try {
            // fantastic4.g:84:2: ( comp ( '&&' and )? )
            // fantastic4.g:84:4: comp ( '&&' and )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_comp_in_and961);
            comp89=comp();

            state._fsp--;

            adaptor.addChild(root_0, comp89.getTree());
            // fantastic4.g:84:9: ( '&&' and )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // fantastic4.g:84:10: '&&' and
                    {
                    string_literal90=(Token)match(input,34,FOLLOW_34_in_and964); 
                    string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
                    adaptor.addChild(root_0, string_literal90_tree);

                    pushFollow(FOLLOW_and_in_and967);
                    and91=and();

                    state._fsp--;

                    adaptor.addChild(root_0, and91.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and"

    public static class comp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp"
    // fantastic4.g:87:1: comp : or ( comparatorOp comp )? ;
    public final fantastic4Parser.comp_return comp() throws RecognitionException {
        fantastic4Parser.comp_return retval = new fantastic4Parser.comp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.or_return or92 = null;

        fantastic4Parser.comparatorOp_return comparatorOp93 = null;

        fantastic4Parser.comp_return comp94 = null;



        try {
            // fantastic4.g:88:2: ( or ( comparatorOp comp )? )
            // fantastic4.g:88:4: or ( comparatorOp comp )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_or_in_comp981);
            or92=or();

            state._fsp--;

            adaptor.addChild(root_0, or92.getTree());
            // fantastic4.g:88:7: ( comparatorOp comp )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=41 && LA17_0<=45)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // fantastic4.g:88:8: comparatorOp comp
                    {
                    pushFollow(FOLLOW_comparatorOp_in_comp984);
                    comparatorOp93=comparatorOp();

                    state._fsp--;

                    adaptor.addChild(root_0, comparatorOp93.getTree());
                    pushFollow(FOLLOW_comp_in_comp987);
                    comp94=comp();

                    state._fsp--;

                    adaptor.addChild(root_0, comp94.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comp"

    public static class or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or"
    // fantastic4.g:91:1: or : puis ( '||' or )? ;
    public final fantastic4Parser.or_return or() throws RecognitionException {
        fantastic4Parser.or_return retval = new fantastic4Parser.or_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal96=null;
        fantastic4Parser.puis_return puis95 = null;

        fantastic4Parser.or_return or97 = null;


        CommonTree string_literal96_tree=null;

        try {
            // fantastic4.g:91:5: ( puis ( '||' or )? )
            // fantastic4.g:91:7: puis ( '||' or )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_puis_in_or1003);
            puis95=puis();

            state._fsp--;

            adaptor.addChild(root_0, puis95.getTree());
            // fantastic4.g:91:12: ( '||' or )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // fantastic4.g:91:13: '||' or
                    {
                    string_literal96=(Token)match(input,35,FOLLOW_35_in_or1006); 
                    string_literal96_tree = (CommonTree)adaptor.create(string_literal96);
                    adaptor.addChild(root_0, string_literal96_tree);

                    pushFollow(FOLLOW_or_in_or1009);
                    or97=or();

                    state._fsp--;

                    adaptor.addChild(root_0, or97.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or"

    public static class puis_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "puis"
    // fantastic4.g:94:1: puis : negExpression ( '^' puis )? ;
    public final fantastic4Parser.puis_return puis() throws RecognitionException {
        fantastic4Parser.puis_return retval = new fantastic4Parser.puis_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal99=null;
        fantastic4Parser.negExpression_return negExpression98 = null;

        fantastic4Parser.puis_return puis100 = null;


        CommonTree char_literal99_tree=null;

        try {
            // fantastic4.g:95:2: ( negExpression ( '^' puis )? )
            // fantastic4.g:95:5: negExpression ( '^' puis )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_negExpression_in_puis1026);
            negExpression98=negExpression();

            state._fsp--;

            adaptor.addChild(root_0, negExpression98.getTree());
            // fantastic4.g:95:19: ( '^' puis )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // fantastic4.g:95:20: '^' puis
                    {
                    char_literal99=(Token)match(input,36,FOLLOW_36_in_puis1029); 
                    char_literal99_tree = (CommonTree)adaptor.create(char_literal99);
                    adaptor.addChild(root_0, char_literal99_tree);

                    pushFollow(FOLLOW_puis_in_puis1031);
                    puis100=puis();

                    state._fsp--;

                    adaptor.addChild(root_0, puis100.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "puis"

    public static class negExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negExpression"
    // fantastic4.g:98:1: negExpression : ( neg )? expressionAtom ;
    public final fantastic4Parser.negExpression_return negExpression() throws RecognitionException {
        fantastic4Parser.negExpression_return retval = new fantastic4Parser.negExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        fantastic4Parser.neg_return neg101 = null;

        fantastic4Parser.expressionAtom_return expressionAtom102 = null;



        try {
            // fantastic4.g:98:14: ( ( neg )? expressionAtom )
            // fantastic4.g:98:16: ( neg )? expressionAtom
            {
            root_0 = (CommonTree)adaptor.nil();

            // fantastic4.g:98:16: ( neg )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=46 && LA20_0<=47)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // fantastic4.g:98:16: neg
                    {
                    pushFollow(FOLLOW_neg_in_negExpression1043);
                    neg101=neg();

                    state._fsp--;

                    adaptor.addChild(root_0, neg101.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expressionAtom_in_negExpression1046);
            expressionAtom102=expressionAtom();

            state._fsp--;

            adaptor.addChild(root_0, expressionAtom102.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "negExpression"

    public static class expressionAtom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionAtom"
    // fantastic4.g:101:2: expressionAtom : ( | cste | IDF | ( '(' add ')' ) | IDF '(' exprlist ')' );
    public final fantastic4Parser.expressionAtom_return expressionAtom() throws RecognitionException {
        fantastic4Parser.expressionAtom_return retval = new fantastic4Parser.expressionAtom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF104=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Token IDF108=null;
        Token char_literal109=null;
        Token char_literal111=null;
        fantastic4Parser.cste_return cste103 = null;

        fantastic4Parser.add_return add106 = null;

        fantastic4Parser.exprlist_return exprlist110 = null;


        CommonTree IDF104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree IDF108_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree char_literal111_tree=null;

        try {
            // fantastic4.g:101:17: ( | cste | IDF | ( '(' add ')' ) | IDF '(' exprlist ')' )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
            case 21:
            case 24:
            case 27:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt21=1;
                }
                break;
            case CSTEINT:
            case CSTEBOOL:
            case CSTESTRING:
                {
                alt21=2;
                }
                break;
            case IDF:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==20) ) {
                    alt21=5;
                }
                else if ( ((LA21_3>=13 && LA21_3<=14)||LA21_3==21||LA21_3==24||LA21_3==27||(LA21_3>=34 && LA21_3<=45)) ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // fantastic4.g:102:5: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;
                case 2 :
                    // fantastic4.g:102:9: cste
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_cste_in_expressionAtom1067);
                    cste103=cste();

                    state._fsp--;

                    adaptor.addChild(root_0, cste103.getTree());

                    }
                    break;
                case 3 :
                    // fantastic4.g:103:9: IDF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF104=(Token)match(input,IDF,FOLLOW_IDF_in_expressionAtom1077); 
                    IDF104_tree = (CommonTree)adaptor.create(IDF104);
                    adaptor.addChild(root_0, IDF104_tree);


                    }
                    break;
                case 4 :
                    // fantastic4.g:104:8: ( '(' add ')' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // fantastic4.g:104:8: ( '(' add ')' )
                    // fantastic4.g:104:10: '(' add ')'
                    {
                    char_literal105=(Token)match(input,20,FOLLOW_20_in_expressionAtom1088); 
                    char_literal105_tree = (CommonTree)adaptor.create(char_literal105);
                    adaptor.addChild(root_0, char_literal105_tree);

                    pushFollow(FOLLOW_add_in_expressionAtom1090);
                    add106=add();

                    state._fsp--;

                    adaptor.addChild(root_0, add106.getTree());
                    char_literal107=(Token)match(input,21,FOLLOW_21_in_expressionAtom1092); 
                    char_literal107_tree = (CommonTree)adaptor.create(char_literal107);
                    adaptor.addChild(root_0, char_literal107_tree);


                    }


                    }
                    break;
                case 5 :
                    // fantastic4.g:105:7: IDF '(' exprlist ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF108=(Token)match(input,IDF,FOLLOW_IDF_in_expressionAtom1102); 
                    IDF108_tree = (CommonTree)adaptor.create(IDF108);
                    adaptor.addChild(root_0, IDF108_tree);

                    char_literal109=(Token)match(input,20,FOLLOW_20_in_expressionAtom1104); 
                    char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
                    adaptor.addChild(root_0, char_literal109_tree);

                    pushFollow(FOLLOW_exprlist_in_expressionAtom1106);
                    exprlist110=exprlist();

                    state._fsp--;

                    adaptor.addChild(root_0, exprlist110.getTree());
                    char_literal111=(Token)match(input,21,FOLLOW_21_in_expressionAtom1108); 
                    char_literal111_tree = (CommonTree)adaptor.create(char_literal111);
                    adaptor.addChild(root_0, char_literal111_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionAtom"

    public static class addSubtractOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addSubtractOp"
    // fantastic4.g:109:1: addSubtractOp : ( '+' | '-' );
    public final fantastic4Parser.addSubtractOp_return addSubtractOp() throws RecognitionException {
        fantastic4Parser.addSubtractOp_return retval = new fantastic4Parser.addSubtractOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set112=null;

        CommonTree set112_tree=null;

        try {
            // fantastic4.g:110:2: ( '+' | '-' )
            // fantastic4.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set112=(Token)input.LT(1);
            if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set112));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addSubtractOp"

    public static class multiplyDivideOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplyDivideOp"
    // fantastic4.g:114:1: multiplyDivideOp : ( '*' | '/' );
    public final fantastic4Parser.multiplyDivideOp_return multiplyDivideOp() throws RecognitionException {
        fantastic4Parser.multiplyDivideOp_return retval = new fantastic4Parser.multiplyDivideOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set113=null;

        CommonTree set113_tree=null;

        try {
            // fantastic4.g:115:2: ( '*' | '/' )
            // fantastic4.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set113=(Token)input.LT(1);
            if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set113));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplyDivideOp"

    public static class comparatorOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparatorOp"
    // fantastic4.g:119:1: comparatorOp : ( '>' | '<' | '>=' | '<=' | '!=' );
    public final fantastic4Parser.comparatorOp_return comparatorOp() throws RecognitionException {
        fantastic4Parser.comparatorOp_return retval = new fantastic4Parser.comparatorOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set114=null;

        CommonTree set114_tree=null;

        try {
            // fantastic4.g:120:2: ( '>' | '<' | '>=' | '<=' | '!=' )
            // fantastic4.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set114=(Token)input.LT(1);
            if ( (input.LA(1)>=41 && input.LA(1)<=45) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set114));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparatorOp"

    public static class cste_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cste"
    // fantastic4.g:127:1: cste : ( CSTEINT | CSTEBOOL | CSTESTRING );
    public final fantastic4Parser.cste_return cste() throws RecognitionException {
        fantastic4Parser.cste_return retval = new fantastic4Parser.cste_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set115=null;

        CommonTree set115_tree=null;

        try {
            // fantastic4.g:127:7: ( CSTEINT | CSTEBOOL | CSTESTRING )
            // fantastic4.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set115=(Token)input.LT(1);
            if ( (input.LA(1)>=CSTEINT && input.LA(1)<=CSTESTRING) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set115));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cste"

    public static class neg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "neg"
    // fantastic4.g:132:1: neg : ( 'not' | '!' );
    public final fantastic4Parser.neg_return neg() throws RecognitionException {
        fantastic4Parser.neg_return retval = new fantastic4Parser.neg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set116=null;

        CommonTree set116_tree=null;

        try {
            // fantastic4.g:132:13: ( 'not' | '!' )
            // fantastic4.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set116=(Token)input.LT(1);
            if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set116));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "neg"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\1\4\1\uffff\1\14\1\4\1\17\1\14\4\16\1\17\2\uffff\4\16";
    static final String DFA8_maxS =
        "\1\26\1\uffff\1\14\1\4\1\22\1\14\4\25\1\22\2\uffff\4\25";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\11\uffff\1\2\1\3\4\uffff";
    static final String DFA8_specialS =
        "\21\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\20\uffff\1\1\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\1\7\1\10\1\11",
            "\1\12",
            "\1\14\6\uffff\1\13",
            "\1\14\6\uffff\1\13",
            "\1\14\6\uffff\1\13",
            "\1\14\6\uffff\1\13",
            "\1\15\1\16\1\17\1\20",
            "",
            "",
            "\1\14\6\uffff\1\13",
            "\1\14\6\uffff\1\13",
            "\1\14\6\uffff\1\13",
            "\1\14\6\uffff\1\13"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "36:1: arglist : ( | arg | arg ',' arglist );";
        }
    }
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\4\2\uffff\1\24\6\uffff";
    static final String DFA10_maxS =
        "\1\41\2\uffff\1\34\6\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\6\1\7\1\10\1\3\1\5";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\22\uffff\1\1\2\uffff\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1"+
            "\7",
            "",
            "",
            "\1\11\7\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "45:1: instr : ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr ';' | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF ';' | 'write' writable ';' );";
        }
    }
 

    public static final BitSet FOLLOW_10_in_prog50 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_prog52 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_vardeclist_in_prog54 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_funcdeclist_in_prog57 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_prog60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varsuitdecl_in_vardeclist90 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_vardeclist_in_vardeclist92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_varsuitdecl127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idenlist_in_varsuitdecl129 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_varsuitdecl131 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_typename_in_varsuitdecl133 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_varsuitdecl135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_idenlist175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_idenlist200 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_idenlist202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idenlist_in_idenlist204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_typename248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_typename268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_typename288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_typename309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcdecl_in_funcdeclist346 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_funcdeclist_in_funcdeclist348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_funcdecl385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_funcdecl387 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_funcdecl389 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_arglist_in_funcdecl391 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_funcdecl393 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_funcdecl395 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_typename_in_funcdecl397 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_vardeclist_in_funcdecl399 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_funcdecl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arglist455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arglist471 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_arglist473 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_arglist_in_arglist475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_arg504 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_arg506 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_typename_in_arg508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_arg524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_arg526 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_arg528 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_typename_in_arg530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_instr557 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_expr_in_instr559 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_instr561 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr563 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instr565 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_instr583 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_expr_in_instr585 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_instr587 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr605 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_instr607 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_expr_in_instr609 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_instr611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_instr627 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_returnable_in_instr629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr645 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_instr647 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_exprlist_in_instr649 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instr651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_instr667 = new BitSet(new long[]{0x00000003E4880810L});
    public static final BitSet FOLLOW_sequence_in_instr669 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_instr671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_instr687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_instr689 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_instr691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_instr707 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_writable_in_instr709 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_instr711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_returnable732 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_returnable734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_writable749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cste_in_writable765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instr_in_sequence804 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_sequence_in_sequence807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprlist843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_nextexpr_in_exprlist845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_nextexpr883 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_expr_in_nextexpr885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_expr906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_add921 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_addSubtractOp_in_add924 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_add_in_add926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_mult941 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_multiplyDivideOp_in_mult944 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_mult_in_mult947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_in_and961 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_and964 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_and_in_and967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_comp981 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_comparatorOp_in_comp984 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_comp_in_comp987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_puis_in_or1003 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_or1006 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_or_in_or1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negExpression_in_puis1026 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_puis1029 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_puis_in_puis1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neg_in_negExpression1043 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_expressionAtom_in_negExpression1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cste_in_expressionAtom1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expressionAtom1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expressionAtom1088 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_add_in_expressionAtom1090 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expressionAtom1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expressionAtom1102 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expressionAtom1104 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_exprlist_in_expressionAtom1106 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expressionAtom1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_addSubtractOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_multiplyDivideOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparatorOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cste0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_neg0 = new BitSet(new long[]{0x0000000000000002L});

}