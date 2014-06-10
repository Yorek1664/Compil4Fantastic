// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g 2014-05-29 16:13:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ASTDemoParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Space", "'||'", "'&&'", "'true'", "'false'", "'('", "')'"
    };
    public static final int T__10=10;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int Space=4;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "orExp", "andExp", "parse", "atom"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public ASTDemoParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public ASTDemoParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public ASTDemoParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return ASTDemoParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g"; }


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parse"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:7:1: parse : orExp ;
    public final ASTDemoParser.parse_return parse() throws RecognitionException {
        ASTDemoParser.parse_return retval = new ASTDemoParser.parse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ASTDemoParser.orExp_return orExp1 = null;



        try { dbg.enterRule(getGrammarFileName(), "parse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:8:3: ( orExp )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:8:6: orExp
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(8,6);
            pushFollow(FOLLOW_orExp_in_parse27);
            orExp1=orExp();

            state._fsp--;

            adaptor.addChild(root_0, orExp1.getTree());

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
        dbg.location(9, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parse"

    public static class orExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExp"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:11:1: orExp : andExp ( '||' andExp )* ;
    public final ASTDemoParser.orExp_return orExp() throws RecognitionException {
        ASTDemoParser.orExp_return retval = new ASTDemoParser.orExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal3=null;
        ASTDemoParser.andExp_return andExp2 = null;

        ASTDemoParser.andExp_return andExp4 = null;


        Object string_literal3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "orExp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:12:3: ( andExp ( '||' andExp )* )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:12:6: andExp ( '||' andExp )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(12,6);
            pushFollow(FOLLOW_andExp_in_orExp41);
            andExp2=andExp();

            state._fsp--;

            adaptor.addChild(root_0, andExp2.getTree());
            dbg.location(12,13);
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:12:13: ( '||' andExp )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==5) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:12:14: '||' andExp
            	    {
            	    dbg.location(12,18);
            	    string_literal3=(Token)match(input,5,FOLLOW_5_in_orExp44); 
            	    string_literal3_tree = (Object)adaptor.create(string_literal3);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal3_tree, root_0);

            	    dbg.location(12,20);
            	    pushFollow(FOLLOW_andExp_in_orExp47);
            	    andExp4=andExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andExp4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


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
        dbg.location(13, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "orExp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "orExp"

    public static class andExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExp"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:15:1: andExp : atom ( '&&' atom )* ;
    public final ASTDemoParser.andExp_return andExp() throws RecognitionException {
        ASTDemoParser.andExp_return retval = new ASTDemoParser.andExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal6=null;
        ASTDemoParser.atom_return atom5 = null;

        ASTDemoParser.atom_return atom7 = null;


        Object string_literal6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "andExp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:16:3: ( atom ( '&&' atom )* )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:16:6: atom ( '&&' atom )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(16,6);
            pushFollow(FOLLOW_atom_in_andExp64);
            atom5=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom5.getTree());
            dbg.location(16,11);
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:16:11: ( '&&' atom )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==6) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:16:12: '&&' atom
            	    {
            	    dbg.location(16,16);
            	    string_literal6=(Token)match(input,6,FOLLOW_6_in_andExp67); 
            	    string_literal6_tree = (Object)adaptor.create(string_literal6);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal6_tree, root_0);

            	    dbg.location(16,18);
            	    pushFollow(FOLLOW_atom_in_andExp70);
            	    atom7=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


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
        dbg.location(17, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "andExp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "andExp"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:19:1: atom : ( 'true' | 'false' | '(' orExp ')' -> orExp );
    public final ASTDemoParser.atom_return atom() throws RecognitionException {
        ASTDemoParser.atom_return retval = new ASTDemoParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal8=null;
        Token string_literal9=null;
        Token char_literal10=null;
        Token char_literal12=null;
        ASTDemoParser.orExp_return orExp11 = null;


        Object string_literal8_tree=null;
        Object string_literal9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");
        RewriteRuleTokenStream stream_9=new RewriteRuleTokenStream(adaptor,"token 9");
        RewriteRuleSubtreeStream stream_orExp=new RewriteRuleSubtreeStream(adaptor,"rule orExp");
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:20:3: ( 'true' | 'false' | '(' orExp ')' -> orExp )
            int alt3=3;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case 7:
                {
                alt3=1;
                }
                break;
            case 8:
                {
                alt3=2;
                }
                break;
            case 9:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:20:6: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(20,6);
                    string_literal8=(Token)match(input,7,FOLLOW_7_in_atom87); 
                    string_literal8_tree = (Object)adaptor.create(string_literal8);
                    adaptor.addChild(root_0, string_literal8_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:21:6: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(21,6);
                    string_literal9=(Token)match(input,8,FOLLOW_8_in_atom94); 
                    string_literal9_tree = (Object)adaptor.create(string_literal9);
                    adaptor.addChild(root_0, string_literal9_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:22:6: '(' orExp ')'
                    {
                    dbg.location(22,6);
                    char_literal10=(Token)match(input,9,FOLLOW_9_in_atom101);  
                    stream_9.add(char_literal10);

                    dbg.location(22,10);
                    pushFollow(FOLLOW_orExp_in_atom103);
                    orExp11=orExp();

                    state._fsp--;

                    stream_orExp.add(orExp11.getTree());
                    dbg.location(22,16);
                    char_literal12=(Token)match(input,10,FOLLOW_10_in_atom105);  
                    stream_10.add(char_literal12);



                    // AST REWRITE
                    // elements: orExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 22:20: -> orExp
                    {
                        dbg.location(22,23);
                        adaptor.addChild(root_0, stream_orExp.nextTree());

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
        dbg.location(25, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_orExp_in_parse27 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExp_in_orExp41 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5_in_orExp44 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_andExp_in_orExp47 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_atom_in_andExp64 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6_in_andExp67 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_atom_in_andExp70 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7_in_atom87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_atom101 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_orExp_in_atom103 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_atom105 = new BitSet(new long[]{0x0000000000000002L});

}