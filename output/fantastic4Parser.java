// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g 2014-05-20 16:30:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class fantastic4Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDF", "CSTEINT", "CSTEBOOL", "CSTESTRING", "COMM", "WS", "'program'", "'var'", "':'", "';'", "','", "'void'", "'bool'", "'int'", "'char'", "'function'", "'('", "')'", "'ref'", "'if'", "'then'", "'else'", "'while'", "'do'", "'='", "'return'", "'{'", "'}'", "'read'", "'write'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", "'not'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int IDF=4;
    public static final int CSTESTRING=7;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int CSTEBOOL=6;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int CSTEINT=5;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int COMM=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "instr", "nextexpr", "idenlist", "opun", "exprlist", 
        "writable", "expr2", "varsuitdecl", "sequence", "opb", "returnable", 
        "typename", "cste", "arg", "funcdecl", "arglist", "prog", "expr", 
        "vardeclist", "funcdeclist"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public fantastic4Parser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public fantastic4Parser(TokenStream input, int port, RecognizerSharedState state) {
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
    public fantastic4Parser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return fantastic4Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g"; }



    // $ANTLR start "prog"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:9:1: prog : 'program' IDF ( vardeclist )? ( funcdeclist )? instr ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:9:13: ( 'program' IDF ( vardeclist )? ( funcdeclist )? instr )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:9:15: 'program' IDF ( vardeclist )? ( funcdeclist )? instr
            {
            dbg.location(9,15);
            match(input,10,FOLLOW_10_in_prog32); 
            dbg.location(9,25);
            match(input,IDF,FOLLOW_IDF_in_prog34); 
            dbg.location(9,29);
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:9:29: ( vardeclist )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:9:29: vardeclist
                    {
                    dbg.location(9,29);
                    pushFollow(FOLLOW_vardeclist_in_prog36);
                    vardeclist();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(9,41);
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:9:41: ( funcdeclist )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:9:41: funcdeclist
                    {
                    dbg.location(9,41);
                    pushFollow(FOLLOW_funcdeclist_in_prog39);
                    funcdeclist();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(9,54);
            pushFollow(FOLLOW_instr_in_prog42);
            instr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(10, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "vardeclist"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:12:1: vardeclist : varsuitdecl ( vardeclist )? ;
    public final void vardeclist() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "vardeclist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:12:13: ( varsuitdecl ( vardeclist )? )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:12:15: varsuitdecl ( vardeclist )?
            {
            dbg.location(12,15);
            pushFollow(FOLLOW_varsuitdecl_in_vardeclist64);
            varsuitdecl();

            state._fsp--;

            dbg.location(12,27);
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:12:27: ( vardeclist )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:12:27: vardeclist
                    {
                    dbg.location(12,27);
                    pushFollow(FOLLOW_vardeclist_in_vardeclist66);
                    vardeclist();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(13, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vardeclist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vardeclist"


    // $ANTLR start "varsuitdecl"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:15:1: varsuitdecl : 'var' idenlist ':' typename ';' ;
    public final void varsuitdecl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "varsuitdecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:15:13: ( 'var' idenlist ':' typename ';' )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:15:15: 'var' idenlist ':' typename ';'
            {
            dbg.location(15,15);
            match(input,11,FOLLOW_11_in_varsuitdecl100); 
            dbg.location(15,21);
            pushFollow(FOLLOW_idenlist_in_varsuitdecl102);
            idenlist();

            state._fsp--;

            dbg.location(15,30);
            match(input,12,FOLLOW_12_in_varsuitdecl104); 
            dbg.location(15,34);
            pushFollow(FOLLOW_typename_in_varsuitdecl106);
            typename();

            state._fsp--;

            dbg.location(15,43);
            match(input,13,FOLLOW_13_in_varsuitdecl108); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(16, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varsuitdecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "varsuitdecl"


    // $ANTLR start "idenlist"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:18:1: idenlist : ( IDF | IDF ',' idenlist );
    public final void idenlist() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "idenlist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:18:13: ( IDF | IDF ',' idenlist )
            int alt4=2;
            try { dbg.enterDecision(4);

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

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:18:15: IDF
                    {
                    dbg.location(18,15);
                    match(input,IDF,FOLLOW_IDF_in_idenlist144); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:19:15: IDF ',' idenlist
                    {
                    dbg.location(19,15);
                    match(input,IDF,FOLLOW_IDF_in_idenlist160); 
                    dbg.location(19,19);
                    match(input,14,FOLLOW_14_in_idenlist162); 
                    dbg.location(19,23);
                    pushFollow(FOLLOW_idenlist_in_idenlist164);
                    idenlist();

                    state._fsp--;


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
        dbg.location(20, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "idenlist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "idenlist"


    // $ANTLR start "typename"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:22:1: typename : ( 'void' | 'bool' | 'int' | 'char' );
    public final void typename() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "typename");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:22:13: ( 'void' | 'bool' | 'int' | 'char' )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:
            {
            dbg.location(22,13);
            if ( (input.LA(1)>=15 && input.LA(1)<=18) ) {
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
        dbg.location(26, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typename");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typename"


    // $ANTLR start "funcdeclist"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:28:1: funcdeclist : funcdecl ( funcdeclist )? ;
    public final void funcdeclist() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "funcdeclist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:28:13: ( funcdecl ( funcdeclist )? )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:28:15: funcdecl ( funcdeclist )?
            {
            dbg.location(28,15);
            pushFollow(FOLLOW_funcdecl_in_funcdeclist281);
            funcdecl();

            state._fsp--;

            dbg.location(28,24);
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:28:24: ( funcdeclist )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:28:24: funcdeclist
                    {
                    dbg.location(28,24);
                    pushFollow(FOLLOW_funcdeclist_in_funcdeclist283);
                    funcdeclist();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(29, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcdeclist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "funcdeclist"


    // $ANTLR start "funcdecl"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:31:1: funcdecl : 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr ;
    public final void funcdecl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "funcdecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:31:13: ( 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:31:15: 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr
            {
            dbg.location(31,15);
            match(input,19,FOLLOW_19_in_funcdecl320); 
            dbg.location(31,26);
            match(input,IDF,FOLLOW_IDF_in_funcdecl322); 
            dbg.location(31,30);
            match(input,20,FOLLOW_20_in_funcdecl324); 
            dbg.location(31,34);
            pushFollow(FOLLOW_arglist_in_funcdecl326);
            arglist();

            state._fsp--;

            dbg.location(31,42);
            match(input,21,FOLLOW_21_in_funcdecl328); 
            dbg.location(31,46);
            match(input,12,FOLLOW_12_in_funcdecl330); 
            dbg.location(31,50);
            pushFollow(FOLLOW_typename_in_funcdecl332);
            typename();

            state._fsp--;

            dbg.location(31,59);
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:31:59: ( vardeclist )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:31:59: vardeclist
                    {
                    dbg.location(31,59);
                    pushFollow(FOLLOW_vardeclist_in_funcdecl334);
                    vardeclist();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(31,71);
            pushFollow(FOLLOW_instr_in_funcdecl337);
            instr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(32, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcdecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "funcdecl"


    // $ANTLR start "arglist"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:34:1: arglist : ( | arg | arg ',' arglist );
    public final void arglist() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arglist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:34:13: ( | arg | arg ',' arglist )
            int alt7=3;
            try { dbg.enterDecision(7);

            try {
                isCyclicDecision = true;
                alt7 = dfa7.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:35:13: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:35:15: arg
                    {
                    dbg.location(35,15);
                    pushFollow(FOLLOW_arg_in_arglist376);
                    arg();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:36:15: arg ',' arglist
                    {
                    dbg.location(36,15);
                    pushFollow(FOLLOW_arg_in_arglist392);
                    arg();

                    state._fsp--;

                    dbg.location(36,19);
                    match(input,14,FOLLOW_14_in_arglist394); 
                    dbg.location(36,23);
                    pushFollow(FOLLOW_arglist_in_arglist396);
                    arglist();

                    state._fsp--;


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
        dbg.location(37, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arglist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arglist"


    // $ANTLR start "arg"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:39:1: arg : ( IDF ':' typename | 'ref' IDF ':' typename );
    public final void arg() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:39:13: ( IDF ':' typename | 'ref' IDF ':' typename )
            int alt8=2;
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDF) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:39:15: IDF ':' typename
                    {
                    dbg.location(39,15);
                    match(input,IDF,FOLLOW_IDF_in_arg425); 
                    dbg.location(39,19);
                    match(input,12,FOLLOW_12_in_arg427); 
                    dbg.location(39,23);
                    pushFollow(FOLLOW_typename_in_arg429);
                    typename();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:40:15: 'ref' IDF ':' typename
                    {
                    dbg.location(40,15);
                    match(input,22,FOLLOW_22_in_arg445); 
                    dbg.location(40,21);
                    match(input,IDF,FOLLOW_IDF_in_arg447); 
                    dbg.location(40,25);
                    match(input,12,FOLLOW_12_in_arg449); 
                    dbg.location(40,29);
                    pushFollow(FOLLOW_typename_in_arg451);
                    typename();

                    state._fsp--;


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
        dbg.location(41, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arg"


    // $ANTLR start "instr"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:43:1: instr : ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr ';' | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF ';' | 'write' writable ';' );
    public final void instr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "instr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:43:13: ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr ';' | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF ';' | 'write' writable ';' )
            int alt9=8;
            try { dbg.enterDecision(9);

            try {
                isCyclicDecision = true;
                alt9 = dfa9.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:43:15: 'if' expr 'then' instr 'else' instr
                    {
                    dbg.location(43,15);
                    match(input,23,FOLLOW_23_in_instr478); 
                    dbg.location(43,20);
                    pushFollow(FOLLOW_expr_in_instr480);
                    expr();

                    state._fsp--;

                    dbg.location(43,25);
                    match(input,24,FOLLOW_24_in_instr482); 
                    dbg.location(43,32);
                    pushFollow(FOLLOW_instr_in_instr484);
                    instr();

                    state._fsp--;

                    dbg.location(43,38);
                    match(input,25,FOLLOW_25_in_instr486); 
                    dbg.location(43,45);
                    pushFollow(FOLLOW_instr_in_instr488);
                    instr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:44:15: 'while' expr 'do' instr
                    {
                    dbg.location(44,15);
                    match(input,26,FOLLOW_26_in_instr504); 
                    dbg.location(44,23);
                    pushFollow(FOLLOW_expr_in_instr506);
                    expr();

                    state._fsp--;

                    dbg.location(44,28);
                    match(input,27,FOLLOW_27_in_instr508); 
                    dbg.location(44,33);
                    pushFollow(FOLLOW_instr_in_instr510);
                    instr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:45:15: IDF '=' expr ';'
                    {
                    dbg.location(45,15);
                    match(input,IDF,FOLLOW_IDF_in_instr526); 
                    dbg.location(45,19);
                    match(input,28,FOLLOW_28_in_instr528); 
                    dbg.location(45,23);
                    pushFollow(FOLLOW_expr_in_instr530);
                    expr();

                    state._fsp--;

                    dbg.location(45,28);
                    match(input,13,FOLLOW_13_in_instr532); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:46:15: 'return' returnable
                    {
                    dbg.location(46,15);
                    match(input,29,FOLLOW_29_in_instr548); 
                    dbg.location(46,24);
                    pushFollow(FOLLOW_returnable_in_instr550);
                    returnable();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:47:15: IDF '(' exprlist ')'
                    {
                    dbg.location(47,15);
                    match(input,IDF,FOLLOW_IDF_in_instr566); 
                    dbg.location(47,19);
                    match(input,20,FOLLOW_20_in_instr568); 
                    dbg.location(47,23);
                    pushFollow(FOLLOW_exprlist_in_instr570);
                    exprlist();

                    state._fsp--;

                    dbg.location(47,32);
                    match(input,21,FOLLOW_21_in_instr572); 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:48:15: '{' sequence '}'
                    {
                    dbg.location(48,15);
                    match(input,30,FOLLOW_30_in_instr588); 
                    dbg.location(48,19);
                    pushFollow(FOLLOW_sequence_in_instr590);
                    sequence();

                    state._fsp--;

                    dbg.location(48,28);
                    match(input,31,FOLLOW_31_in_instr592); 

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:49:15: 'read' IDF ';'
                    {
                    dbg.location(49,15);
                    match(input,32,FOLLOW_32_in_instr608); 
                    dbg.location(49,22);
                    match(input,IDF,FOLLOW_IDF_in_instr610); 
                    dbg.location(49,26);
                    match(input,13,FOLLOW_13_in_instr612); 

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:50:15: 'write' writable ';'
                    {
                    dbg.location(50,15);
                    match(input,33,FOLLOW_33_in_instr628); 
                    dbg.location(50,23);
                    pushFollow(FOLLOW_writable_in_instr630);
                    writable();

                    state._fsp--;

                    dbg.location(50,32);
                    match(input,13,FOLLOW_13_in_instr632); 

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
        dbg.location(51, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "instr"


    // $ANTLR start "returnable"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:53:1: returnable : ( ';' | expr ';' );
    public final void returnable() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "returnable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:53:12: ( ';' | expr ';' )
            int alt10=2;
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=IDF && LA10_0<=CSTESTRING)||LA10_0==20||LA10_0==35||LA10_0==46) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:53:14: ';'
                    {
                    dbg.location(53,14);
                    match(input,13,FOLLOW_13_in_returnable653); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:54:6: expr ';'
                    {
                    dbg.location(54,6);
                    pushFollow(FOLLOW_expr_in_returnable660);
                    expr();

                    state._fsp--;

                    dbg.location(54,11);
                    match(input,13,FOLLOW_13_in_returnable662); 

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
        dbg.location(55, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "returnable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "returnable"


    // $ANTLR start "writable"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:57:1: writable : ( IDF | cste );
    public final void writable() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "writable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:57:13: ( IDF | cste )
            int alt11=2;
            try { dbg.enterDecision(11);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:57:15: IDF
                    {
                    dbg.location(57,15);
                    match(input,IDF,FOLLOW_IDF_in_writable677); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:58:15: cste
                    {
                    dbg.location(58,15);
                    pushFollow(FOLLOW_cste_in_writable693);
                    cste();

                    state._fsp--;


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
        dbg.location(59, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "writable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "writable"


    // $ANTLR start "sequence"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:61:1: sequence : ( | instr sequence );
    public final void sequence() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "sequence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:61:13: ( | instr sequence )
            int alt12=2;
            try { dbg.enterDecision(12);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:62:13: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:62:15: instr sequence
                    {
                    dbg.location(62,15);
                    pushFollow(FOLLOW_instr_in_sequence732);
                    instr();

                    state._fsp--;

                    dbg.location(62,22);
                    pushFollow(FOLLOW_sequence_in_sequence735);
                    sequence();

                    state._fsp--;


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
        dbg.location(63, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sequence");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sequence"


    // $ANTLR start "exprlist"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:65:1: exprlist : expr nextexpr ;
    public final void exprlist() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "exprlist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:65:13: ( expr nextexpr )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:65:15: expr nextexpr
            {
            dbg.location(65,15);
            pushFollow(FOLLOW_expr_in_exprlist771);
            expr();

            state._fsp--;

            dbg.location(65,20);
            pushFollow(FOLLOW_nextexpr_in_exprlist773);
            nextexpr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(66, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprlist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprlist"


    // $ANTLR start "nextexpr"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:68:1: nextexpr : ( | ',' expr );
    public final void nextexpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "nextexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:68:13: ( | ',' expr )
            int alt13=2;
            try { dbg.enterDecision(13);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:69:13: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:69:15: ',' expr
                    {
                    dbg.location(69,15);
                    match(input,14,FOLLOW_14_in_nextexpr811); 
                    dbg.location(69,19);
                    pushFollow(FOLLOW_expr_in_nextexpr813);
                    expr();

                    state._fsp--;


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
        dbg.location(70, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nextexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nextexpr"


    // $ANTLR start "expr"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:72:1: expr : ( cste expr2 | '(' expr ')' expr2 | opun expr | IDF '(' exprlist ')' expr2 | IDF '(' ')' expr2 | IDF expr2 );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:72:13: ( cste expr2 | '(' expr ')' expr2 | opun expr | IDF '(' exprlist ')' expr2 | IDF '(' ')' expr2 | IDF expr2 )
            int alt14=6;
            try { dbg.enterDecision(14);

            switch ( input.LA(1) ) {
            case CSTEINT:
            case CSTEBOOL:
            case CSTESTRING:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 35:
            case 46:
                {
                alt14=3;
                }
                break;
            case IDF:
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4==20) ) {
                    int LA14_5 = input.LA(3);

                    if ( (LA14_5==21) ) {
                        alt14=5;
                    }
                    else if ( ((LA14_5>=IDF && LA14_5<=CSTESTRING)||LA14_5==20||LA14_5==35||LA14_5==46) ) {
                        alt14=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else if ( ((LA14_4>=13 && LA14_4<=14)||LA14_4==21||LA14_4==24||LA14_4==27||(LA14_4>=34 && LA14_4<=45)) ) {
                    alt14=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:72:15: cste expr2
                    {
                    dbg.location(72,15);
                    pushFollow(FOLLOW_cste_in_expr841);
                    cste();

                    state._fsp--;

                    dbg.location(72,20);
                    pushFollow(FOLLOW_expr2_in_expr843);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:73:15: '(' expr ')' expr2
                    {
                    dbg.location(73,15);
                    match(input,20,FOLLOW_20_in_expr859); 
                    dbg.location(73,19);
                    pushFollow(FOLLOW_expr_in_expr861);
                    expr();

                    state._fsp--;

                    dbg.location(73,24);
                    match(input,21,FOLLOW_21_in_expr863); 
                    dbg.location(73,28);
                    pushFollow(FOLLOW_expr2_in_expr865);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:74:15: opun expr
                    {
                    dbg.location(74,15);
                    pushFollow(FOLLOW_opun_in_expr881);
                    opun();

                    state._fsp--;

                    dbg.location(74,20);
                    pushFollow(FOLLOW_expr_in_expr883);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:75:15: IDF '(' exprlist ')' expr2
                    {
                    dbg.location(75,15);
                    match(input,IDF,FOLLOW_IDF_in_expr899); 
                    dbg.location(75,19);
                    match(input,20,FOLLOW_20_in_expr901); 
                    dbg.location(75,23);
                    pushFollow(FOLLOW_exprlist_in_expr903);
                    exprlist();

                    state._fsp--;

                    dbg.location(75,32);
                    match(input,21,FOLLOW_21_in_expr905); 
                    dbg.location(75,36);
                    pushFollow(FOLLOW_expr2_in_expr907);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:76:15: IDF '(' ')' expr2
                    {
                    dbg.location(76,15);
                    match(input,IDF,FOLLOW_IDF_in_expr923); 
                    dbg.location(76,19);
                    match(input,20,FOLLOW_20_in_expr925); 
                    dbg.location(76,23);
                    match(input,21,FOLLOW_21_in_expr927); 
                    dbg.location(76,27);
                    pushFollow(FOLLOW_expr2_in_expr929);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:77:15: IDF expr2
                    {
                    dbg.location(77,15);
                    match(input,IDF,FOLLOW_IDF_in_expr945); 
                    dbg.location(77,19);
                    pushFollow(FOLLOW_expr2_in_expr947);
                    expr2();

                    state._fsp--;


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
        dbg.location(78, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "expr2"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:80:1: expr2 : ( opb expr | );
    public final void expr2() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:80:8: ( opb expr | )
            int alt15=2;
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=34 && LA15_0<=45)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=13 && LA15_0<=14)||LA15_0==21||LA15_0==24||LA15_0==27) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:80:10: opb expr
                    {
                    dbg.location(80,10);
                    pushFollow(FOLLOW_opb_in_expr2981);
                    opb();

                    state._fsp--;

                    dbg.location(80,14);
                    pushFollow(FOLLOW_expr_in_expr2983);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:82:4: 
                    {
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
        dbg.location(82, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr2"


    // $ANTLR start "cste"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:84:1: cste : ( CSTEINT | CSTEBOOL | CSTESTRING );
    public final void cste() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "cste");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:84:7: ( CSTEINT | CSTEBOOL | CSTESTRING )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:
            {
            dbg.location(84,7);
            if ( (input.LA(1)>=CSTEINT && input.LA(1)<=CSTESTRING) ) {
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
        dbg.location(87, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cste");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cste"


    // $ANTLR start "opb"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:89:1: opb : ( '+' | '-' | '*' | '/' | '<' | '<=' | '>' | '>=' | '==' | '!=' | 'and' | 'or' );
    public final void opb() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:89:13: ( '+' | '-' | '*' | '/' | '<' | '<=' | '>' | '>=' | '==' | '!=' | 'and' | 'or' )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:
            {
            dbg.location(89,13);
            if ( (input.LA(1)>=34 && input.LA(1)<=45) ) {
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
        dbg.location(101, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opb"


    // $ANTLR start "opun"
    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:103:1: opun : ( '-' | 'not' );
    public final void opun() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:103:13: ( '-' | 'not' )
            dbg.enterAlt(1);

            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/fantastic4.g:
            {
            dbg.location(103,13);
            if ( input.LA(1)==35||input.LA(1)==46 ) {
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
        dbg.location(105, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opun");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opun"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\4\1\uffff\1\14\1\4\1\17\1\14\1\16\1\17\2\uffff\1\16";
    static final String DFA7_maxS =
        "\1\26\1\uffff\1\14\1\4\1\22\1\14\1\25\1\22\2\uffff\1\25";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\2\1\uffff";
    static final String DFA7_specialS =
        "\13\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\20\uffff\1\1\1\3",
            "",
            "\1\4",
            "\1\5",
            "\4\6",
            "\1\7",
            "\1\10\6\uffff\1\11",
            "\4\12",
            "",
            "",
            "\1\10\6\uffff\1\11"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "34:1: arglist : ( | arg | arg ',' arglist );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\4\2\uffff\1\24\6\uffff";
    static final String DFA9_maxS =
        "\1\41\2\uffff\1\34\6\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\6\1\7\1\10\1\3\1\5";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "43:1: instr : ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr ';' | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF ';' | 'write' writable ';' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_10_in_prog32 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_prog34 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_vardeclist_in_prog36 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_funcdeclist_in_prog39 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_prog42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varsuitdecl_in_vardeclist64 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_vardeclist_in_vardeclist66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_varsuitdecl100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idenlist_in_varsuitdecl102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_varsuitdecl104 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_typename_in_varsuitdecl106 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_varsuitdecl108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_idenlist144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_idenlist160 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_idenlist162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idenlist_in_idenlist164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typename0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcdecl_in_funcdeclist281 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_funcdeclist_in_funcdeclist283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_funcdecl320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_funcdecl322 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_funcdecl324 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_arglist_in_funcdecl326 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_funcdecl328 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_funcdecl330 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_typename_in_funcdecl332 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_vardeclist_in_funcdecl334 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_funcdecl337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arglist376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arglist392 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_arglist394 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_arglist_in_arglist396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_arg425 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_arg427 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_typename_in_arg429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_arg445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_arg447 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_arg449 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_typename_in_arg451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_instr478 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_expr_in_instr480 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_instr482 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr484 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instr486 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_instr504 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_expr_in_instr506 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_instr508 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr526 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_instr528 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_expr_in_instr530 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_instr532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_instr548 = new BitSet(new long[]{0x00004008001020F0L});
    public static final BitSet FOLLOW_returnable_in_instr550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr566 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_instr568 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_exprlist_in_instr570 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instr572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_instr588 = new BitSet(new long[]{0x00000003E4880810L});
    public static final BitSet FOLLOW_sequence_in_instr590 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_instr592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_instr608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_instr610 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_instr612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_instr628 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_writable_in_instr630 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_instr632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_returnable653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_returnable660 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_returnable662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_writable677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cste_in_writable693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instr_in_sequence732 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_sequence_in_sequence735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprlist771 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_nextexpr_in_exprlist773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_nextexpr811 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_expr_in_nextexpr813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cste_in_expr841 = new BitSet(new long[]{0x00003FFC00000000L});
    public static final BitSet FOLLOW_expr2_in_expr843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expr859 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_expr_in_expr861 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expr863 = new BitSet(new long[]{0x00003FFC00000000L});
    public static final BitSet FOLLOW_expr2_in_expr865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opun_in_expr881 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_expr_in_expr883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expr899 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expr901 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_exprlist_in_expr903 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expr905 = new BitSet(new long[]{0x00003FFC00000000L});
    public static final BitSet FOLLOW_expr2_in_expr907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expr923 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expr925 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expr927 = new BitSet(new long[]{0x00003FFC00000000L});
    public static final BitSet FOLLOW_expr2_in_expr929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expr945 = new BitSet(new long[]{0x00003FFC00000000L});
    public static final BitSet FOLLOW_expr2_in_expr947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opb_in_expr2981 = new BitSet(new long[]{0x00004008001000F0L});
    public static final BitSet FOLLOW_expr_in_expr2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cste0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_opb0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_opun0 = new BitSet(new long[]{0x0000000000000002L});

}