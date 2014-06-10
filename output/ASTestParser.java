// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g 2014-05-29 15:06:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ASTestParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS"
    };
    public static final int ID=4;
    public static final int WS=6;
    public static final int EOF=-1;
    public static final int INT=5;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "r"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public ASTestParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public ASTestParser(TokenStream input, int port, RecognizerSharedState state) {
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
    public ASTestParser(TokenStream input, DebugEventListener dbg) {
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


    public String[] getTokenNames() { return ASTestParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g"; }


    public static class r_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "r"
    // C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g:5:1: r : ( ID | INT )+ -> ^( INT ) ;
    public final ASTestParser.r_return r() throws RecognitionException {
        ASTestParser.r_return retval = new ASTestParser.r_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID1=null;
        Token INT2=null;

        Object ID1_tree=null;
        Object INT2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try { dbg.enterRule(getGrammarFileName(), "r");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(5, 1);

        try {
            // C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g:5:3: ( ( ID | INT )+ -> ^( INT ) )
            dbg.enterAlt(1);

            // C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g:5:5: ( ID | INT )+
            {
            dbg.location(5,5);
            // C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g:5:5: ( ID | INT )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }
                else if ( (LA1_0==INT) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g:5:6: ID
            	    {
            	    dbg.location(5,6);
            	    ID1=(Token)match(input,ID,FOLLOW_ID_in_r19);  
            	    stream_ID.add(ID1);


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g:5:9: INT
            	    {
            	    dbg.location(5,9);
            	    INT2=(Token)match(input,INT,FOLLOW_INT_in_r21);  
            	    stream_INT.add(INT2);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}



            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 5:15: -> ^( INT )
            {
                dbg.location(5,18);
                // C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\ASTest.g:5:18: ^( INT )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(5,20);
                root_1 = (Object)adaptor.becomeRoot(stream_INT.nextNode(), root_1);

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
        dbg.location(5, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "r");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "r"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_r19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_INT_in_r21 = new BitSet(new long[]{0x0000000000000032L});

}