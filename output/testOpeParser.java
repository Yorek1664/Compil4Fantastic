// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g 2014-05-12 17:39:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class testOpeParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'-'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'!='"
    };
    public static final int WS=5;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int INT=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "comparatorOp", "multiplyDivideOp", "progr", "addSubtractOp", 
        "var", "expr", "neg"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public testOpeParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public testOpeParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public testOpeParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return testOpeParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g"; }



    // $ANTLR start "progr"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:9:1: progr : expr ;
    public final void progr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "progr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:9:9: ( expr )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:9:11: expr
            {
            dbg.location(9,11);
            pushFollow(FOLLOW_expr_in_progr27);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(9, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "progr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "progr"


    // $ANTLR start "expr"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:11:1: expr : var ( addSubtractOp expr )? ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:11:6: ( var ( addSubtractOp expr )? )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:11:8: var ( addSubtractOp expr )?
            {
            dbg.location(11,8);
            pushFollow(FOLLOW_var_in_expr35);
            var();

            state._fsp--;

            dbg.location(11,12);
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:11:12: ( addSubtractOp expr )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=6 && LA1_0<=7)) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:11:13: addSubtractOp expr
                    {
                    dbg.location(11,13);
                    pushFollow(FOLLOW_addSubtractOp_in_expr38);
                    addSubtractOp();

                    state._fsp--;

                    dbg.location(11,27);
                    pushFollow(FOLLOW_expr_in_expr40);
                    expr();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(11, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "var"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:13:1: var : ( neg | INT );
    public final void var() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:13:5: ( neg | INT )
            int alt2=2;
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==6) ) {
                alt2=1;
            }
            else if ( (LA2_0==INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:13:7: neg
                    {
                    dbg.location(13,7);
                    pushFollow(FOLLOW_neg_in_var50);
                    neg();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:14:4: INT
                    {
                    dbg.location(14,4);
                    match(input,INT,FOLLOW_INT_in_var55); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(15, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "var"


    // $ANTLR start "neg"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:17:1: neg : '-' var ;
    public final void neg() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:17:5: ( '-' var )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:17:7: '-' var
            {
            dbg.location(17,7);
            match(input,6,FOLLOW_6_in_neg66); 
            dbg.location(17,11);
            pushFollow(FOLLOW_var_in_neg68);
            var();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(17, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "neg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "neg"


    // $ANTLR start "addSubtractOp"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:19:1: addSubtractOp : ( '+' | '-' );
    public final void addSubtractOp() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "addSubtractOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:20:2: ( '+' | '-' )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:
            {
            dbg.location(20,2);
            if ( (input.LA(1)>=6 && input.LA(1)<=7) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(22, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "addSubtractOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "addSubtractOp"


    // $ANTLR start "multiplyDivideOp"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:24:1: multiplyDivideOp : ( '*' | '/' );
    public final void multiplyDivideOp() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "multiplyDivideOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:25:2: ( '*' | '/' )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:
            {
            dbg.location(25,2);
            if ( (input.LA(1)>=8 && input.LA(1)<=9) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(27, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multiplyDivideOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multiplyDivideOp"


    // $ANTLR start "comparatorOp"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:29:1: comparatorOp : ( '>' | '<' | '>=' | '<=' | '!=' );
    public final void comparatorOp() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "comparatorOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:30:2: ( '>' | '<' | '>=' | '<=' | '!=' )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:
            {
            dbg.location(30,2);
            if ( (input.LA(1)>=10 && input.LA(1)<=14) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(35, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comparatorOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "comparatorOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_progr27 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_expr35 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_addSubtractOp_in_expr38 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_expr_in_expr40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neg_in_var50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_var55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_neg66 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_var_in_neg68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_addSubtractOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_multiplyDivideOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparatorOp0 = new BitSet(new long[]{0x0000000000000002L});

}