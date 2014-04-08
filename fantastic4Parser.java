// $ANTLR 3.3 Nov 30, 2010 12:50:56 fantastic4.g 2014-04-07 09:48:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class fantastic4Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDF", "CSTE", "COMM", "WS", "'program'", "'var'", "':'", "','", "'void'", "'bool'", "'int'", "'char'", "'function'", "'('", "')'", "'ref'", "'if'", "'then'", "'else'", "'while'", "'do'", "'='", "'return'", "'{'", "'}'", "'read'", "'write'", "';'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", "'not'"
    };
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
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
    public static final int IDF=4;
    public static final int CSTE=5;
    public static final int COMM=6;
    public static final int WS=7;

    // delegates
    // delegators


        public fantastic4Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public fantastic4Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return fantastic4Parser.tokenNames; }
    public String getGrammarFileName() { return "fantastic4.g"; }



    // $ANTLR start "prog"
    // fantastic4.g:9:1: prog : 'program' IDF vardeclist ( funcdeclist )? instr ;
    public final void prog() throws RecognitionException {
        try {
            // fantastic4.g:9:13: ( 'program' IDF vardeclist ( funcdeclist )? instr )
            // fantastic4.g:9:15: 'program' IDF vardeclist ( funcdeclist )? instr
            {
            match(input,8,FOLLOW_8_in_prog32); 
            match(input,IDF,FOLLOW_IDF_in_prog34); 
            pushFollow(FOLLOW_vardeclist_in_prog36);
            vardeclist();

            state._fsp--;

            // fantastic4.g:9:40: ( funcdeclist )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // fantastic4.g:9:40: funcdeclist
                    {
                    pushFollow(FOLLOW_funcdeclist_in_prog38);
                    funcdeclist();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_instr_in_prog41);
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
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "vardeclist"
    // fantastic4.g:12:1: vardeclist : ( | varsuitdecl vardeclist );
    public final void vardeclist() throws RecognitionException {
        try {
            // fantastic4.g:12:13: ( | varsuitdecl vardeclist )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDF||LA2_0==16||LA2_0==20||LA2_0==23||(LA2_0>=26 && LA2_0<=27)||(LA2_0>=29 && LA2_0<=30)) ) {
                alt2=1;
            }
            else if ( (LA2_0==9) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // fantastic4.g:13:13: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:13:15: varsuitdecl vardeclist
                    {
                    pushFollow(FOLLOW_varsuitdecl_in_vardeclist77);
                    varsuitdecl();

                    state._fsp--;

                    pushFollow(FOLLOW_vardeclist_in_vardeclist79);
                    vardeclist();

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
        return ;
    }
    // $ANTLR end "vardeclist"


    // $ANTLR start "varsuitdecl"
    // fantastic4.g:16:1: varsuitdecl : 'var' idenlist ':' typename ;
    public final void varsuitdecl() throws RecognitionException {
        try {
            // fantastic4.g:16:13: ( 'var' idenlist ':' typename )
            // fantastic4.g:16:15: 'var' idenlist ':' typename
            {
            match(input,9,FOLLOW_9_in_varsuitdecl112); 
            pushFollow(FOLLOW_idenlist_in_varsuitdecl114);
            idenlist();

            state._fsp--;

            match(input,10,FOLLOW_10_in_varsuitdecl116); 
            pushFollow(FOLLOW_typename_in_varsuitdecl118);
            typename();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varsuitdecl"


    // $ANTLR start "idenlist"
    // fantastic4.g:19:1: idenlist : ( IDF | IDF ',' idenlist );
    public final void idenlist() throws RecognitionException {
        try {
            // fantastic4.g:19:13: ( IDF | IDF ',' idenlist )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDF) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==11) ) {
                    alt3=2;
                }
                else if ( (LA3_1==10) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // fantastic4.g:19:15: IDF
                    {
                    match(input,IDF,FOLLOW_IDF_in_idenlist154); 

                    }
                    break;
                case 2 :
                    // fantastic4.g:20:15: IDF ',' idenlist
                    {
                    match(input,IDF,FOLLOW_IDF_in_idenlist170); 
                    match(input,11,FOLLOW_11_in_idenlist172); 
                    pushFollow(FOLLOW_idenlist_in_idenlist174);
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
        return ;
    }
    // $ANTLR end "idenlist"


    // $ANTLR start "typename"
    // fantastic4.g:23:1: typename : ( 'void' | 'bool' | 'int' | 'char' );
    public final void typename() throws RecognitionException {
        try {
            // fantastic4.g:23:13: ( 'void' | 'bool' | 'int' | 'char' )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=12 && input.LA(1)<=15) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "typename"


    // $ANTLR start "funcdeclist"
    // fantastic4.g:29:1: funcdeclist : funcdecl funcdeclist ;
    public final void funcdeclist() throws RecognitionException {
        try {
            // fantastic4.g:29:13: ( funcdecl funcdeclist )
            // fantastic4.g:29:15: funcdecl funcdeclist
            {
            pushFollow(FOLLOW_funcdecl_in_funcdeclist291);
            funcdecl();

            state._fsp--;

            pushFollow(FOLLOW_funcdeclist_in_funcdeclist293);
            funcdeclist();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "funcdeclist"


    // $ANTLR start "funcdecl"
    // fantastic4.g:32:1: funcdecl : 'function' IDF '(' arglist ')' ':' typename vardeclist instr ;
    public final void funcdecl() throws RecognitionException {
        try {
            // fantastic4.g:32:13: ( 'function' IDF '(' arglist ')' ':' typename vardeclist instr )
            // fantastic4.g:32:15: 'function' IDF '(' arglist ')' ':' typename vardeclist instr
            {
            match(input,16,FOLLOW_16_in_funcdecl329); 
            match(input,IDF,FOLLOW_IDF_in_funcdecl331); 
            match(input,17,FOLLOW_17_in_funcdecl333); 
            pushFollow(FOLLOW_arglist_in_funcdecl335);
            arglist();

            state._fsp--;

            match(input,18,FOLLOW_18_in_funcdecl337); 
            match(input,10,FOLLOW_10_in_funcdecl339); 
            pushFollow(FOLLOW_typename_in_funcdecl341);
            typename();

            state._fsp--;

            pushFollow(FOLLOW_vardeclist_in_funcdecl343);
            vardeclist();

            state._fsp--;

            pushFollow(FOLLOW_instr_in_funcdecl345);
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
        return ;
    }
    // $ANTLR end "funcdecl"


    // $ANTLR start "arglist"
    // fantastic4.g:35:1: arglist : ( | arg | arg ',' arglist );
    public final void arglist() throws RecognitionException {
        try {
            // fantastic4.g:35:13: ( | arg | arg ',' arglist )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // fantastic4.g:36:13: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:36:15: arg
                    {
                    pushFollow(FOLLOW_arg_in_arglist384);
                    arg();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // fantastic4.g:37:15: arg ',' arglist
                    {
                    pushFollow(FOLLOW_arg_in_arglist400);
                    arg();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_arglist402); 
                    pushFollow(FOLLOW_arglist_in_arglist404);
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
        return ;
    }
    // $ANTLR end "arglist"


    // $ANTLR start "arg"
    // fantastic4.g:40:1: arg : ( IDF ':' typename | 'ref' IDF ':' typename );
    public final void arg() throws RecognitionException {
        try {
            // fantastic4.g:40:13: ( IDF ':' typename | 'ref' IDF ':' typename )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDF) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // fantastic4.g:40:15: IDF ':' typename
                    {
                    match(input,IDF,FOLLOW_IDF_in_arg433); 
                    match(input,10,FOLLOW_10_in_arg435); 
                    pushFollow(FOLLOW_typename_in_arg437);
                    typename();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // fantastic4.g:41:15: 'ref' IDF ':' typename
                    {
                    match(input,19,FOLLOW_19_in_arg453); 
                    match(input,IDF,FOLLOW_IDF_in_arg455); 
                    match(input,10,FOLLOW_10_in_arg457); 
                    pushFollow(FOLLOW_typename_in_arg459);
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
        return ;
    }
    // $ANTLR end "arg"


    // $ANTLR start "instr"
    // fantastic4.g:44:1: instr : ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF | 'write' writable );
    public final void instr() throws RecognitionException {
        try {
            // fantastic4.g:44:13: ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF | 'write' writable )
            int alt6=8;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // fantastic4.g:44:15: 'if' expr 'then' instr 'else' instr
                    {
                    match(input,20,FOLLOW_20_in_instr486); 
                    pushFollow(FOLLOW_expr_in_instr488);
                    expr();

                    state._fsp--;

                    match(input,21,FOLLOW_21_in_instr490); 
                    pushFollow(FOLLOW_instr_in_instr492);
                    instr();

                    state._fsp--;

                    match(input,22,FOLLOW_22_in_instr494); 
                    pushFollow(FOLLOW_instr_in_instr496);
                    instr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // fantastic4.g:45:15: 'while' expr 'do' instr
                    {
                    match(input,23,FOLLOW_23_in_instr512); 
                    pushFollow(FOLLOW_expr_in_instr514);
                    expr();

                    state._fsp--;

                    match(input,24,FOLLOW_24_in_instr516); 
                    pushFollow(FOLLOW_instr_in_instr518);
                    instr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // fantastic4.g:46:15: IDF '=' expr
                    {
                    match(input,IDF,FOLLOW_IDF_in_instr534); 
                    match(input,25,FOLLOW_25_in_instr536); 
                    pushFollow(FOLLOW_expr_in_instr538);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // fantastic4.g:47:15: 'return' returnable
                    {
                    match(input,26,FOLLOW_26_in_instr554); 
                    pushFollow(FOLLOW_returnable_in_instr556);
                    returnable();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // fantastic4.g:48:15: IDF '(' exprlist ')'
                    {
                    match(input,IDF,FOLLOW_IDF_in_instr572); 
                    match(input,17,FOLLOW_17_in_instr574); 
                    pushFollow(FOLLOW_exprlist_in_instr576);
                    exprlist();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_instr578); 

                    }
                    break;
                case 6 :
                    // fantastic4.g:49:15: '{' sequence '}'
                    {
                    match(input,27,FOLLOW_27_in_instr594); 
                    pushFollow(FOLLOW_sequence_in_instr596);
                    sequence();

                    state._fsp--;

                    match(input,28,FOLLOW_28_in_instr598); 

                    }
                    break;
                case 7 :
                    // fantastic4.g:50:15: 'read' IDF
                    {
                    match(input,29,FOLLOW_29_in_instr614); 
                    match(input,IDF,FOLLOW_IDF_in_instr616); 

                    }
                    break;
                case 8 :
                    // fantastic4.g:51:15: 'write' writable
                    {
                    match(input,30,FOLLOW_30_in_instr632); 
                    pushFollow(FOLLOW_writable_in_instr634);
                    writable();

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
        return ;
    }
    // $ANTLR end "instr"


    // $ANTLR start "returnable"
    // fantastic4.g:54:1: returnable : ( | expr );
    public final void returnable() throws RecognitionException {
        try {
            // fantastic4.g:54:12: ( | expr )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||LA7_0==16||LA7_0==22||LA7_0==31) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=IDF && LA7_0<=CSTE)||LA7_0==17||LA7_0==33||LA7_0==44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // fantastic4.g:55:4: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:55:6: expr
                    {
                    pushFollow(FOLLOW_expr_in_returnable660);
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
        return ;
    }
    // $ANTLR end "returnable"


    // $ANTLR start "writable"
    // fantastic4.g:58:1: writable : ( IDF | CSTE );
    public final void writable() throws RecognitionException {
        try {
            // fantastic4.g:58:13: ( IDF | CSTE )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=IDF && input.LA(1)<=CSTE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "writable"


    // $ANTLR start "sequence"
    // fantastic4.g:62:1: sequence : ( | instr ';' sequence );
    public final void sequence() throws RecognitionException {
        try {
            // fantastic4.g:62:13: ( | instr ';' sequence )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==IDF||LA8_0==20||LA8_0==23||(LA8_0>=26 && LA8_0<=27)||(LA8_0>=29 && LA8_0<=30)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // fantastic4.g:63:13: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:63:15: instr ';' sequence
                    {
                    pushFollow(FOLLOW_instr_in_sequence730);
                    instr();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_sequence732); 
                    pushFollow(FOLLOW_sequence_in_sequence734);
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
        return ;
    }
    // $ANTLR end "sequence"


    // $ANTLR start "exprlist"
    // fantastic4.g:66:1: exprlist : expr nextexpr ;
    public final void exprlist() throws RecognitionException {
        try {
            // fantastic4.g:66:13: ( expr nextexpr )
            // fantastic4.g:66:15: expr nextexpr
            {
            pushFollow(FOLLOW_expr_in_exprlist770);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_nextexpr_in_exprlist772);
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
        return ;
    }
    // $ANTLR end "exprlist"


    // $ANTLR start "nextexpr"
    // fantastic4.g:69:1: nextexpr : ( | ',' expr );
    public final void nextexpr() throws RecognitionException {
        try {
            // fantastic4.g:69:13: ( | ',' expr )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==11) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // fantastic4.g:70:13: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:70:15: ',' expr
                    {
                    match(input,11,FOLLOW_11_in_nextexpr810); 
                    pushFollow(FOLLOW_expr_in_nextexpr812);
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
        return ;
    }
    // $ANTLR end "nextexpr"


    // $ANTLR start "expr"
    // fantastic4.g:73:1: expr : ( CSTE expr2 | '(' expr ')' expr2 | opun expr | IDF '(' exprlist ')' expr2 | IDF '(' ')' expr2 | IDF expr2 );
    public final void expr() throws RecognitionException {
        try {
            // fantastic4.g:73:13: ( CSTE expr2 | '(' expr ')' expr2 | opun expr | IDF '(' exprlist ')' expr2 | IDF '(' ')' expr2 | IDF expr2 )
            int alt10=6;
            switch ( input.LA(1) ) {
            case CSTE:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 33:
            case 44:
                {
                alt10=3;
                }
                break;
            case IDF:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==17) ) {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==18) ) {
                        alt10=5;
                    }
                    else if ( ((LA10_5>=IDF && LA10_5<=CSTE)||LA10_5==17||LA10_5==33||LA10_5==44) ) {
                        alt10=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA10_4==EOF||LA10_4==11||LA10_4==16||LA10_4==18||(LA10_4>=21 && LA10_4<=22)||LA10_4==24||(LA10_4>=31 && LA10_4<=43)) ) {
                    alt10=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // fantastic4.g:73:15: CSTE expr2
                    {
                    match(input,CSTE,FOLLOW_CSTE_in_expr840); 
                    pushFollow(FOLLOW_expr2_in_expr842);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // fantastic4.g:74:15: '(' expr ')' expr2
                    {
                    match(input,17,FOLLOW_17_in_expr858); 
                    pushFollow(FOLLOW_expr_in_expr860);
                    expr();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_expr862); 
                    pushFollow(FOLLOW_expr2_in_expr864);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // fantastic4.g:75:15: opun expr
                    {
                    pushFollow(FOLLOW_opun_in_expr880);
                    opun();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr882);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // fantastic4.g:76:15: IDF '(' exprlist ')' expr2
                    {
                    match(input,IDF,FOLLOW_IDF_in_expr898); 
                    match(input,17,FOLLOW_17_in_expr900); 
                    pushFollow(FOLLOW_exprlist_in_expr902);
                    exprlist();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_expr904); 
                    pushFollow(FOLLOW_expr2_in_expr906);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // fantastic4.g:77:15: IDF '(' ')' expr2
                    {
                    match(input,IDF,FOLLOW_IDF_in_expr922); 
                    match(input,17,FOLLOW_17_in_expr924); 
                    match(input,18,FOLLOW_18_in_expr926); 
                    pushFollow(FOLLOW_expr2_in_expr928);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // fantastic4.g:78:15: IDF expr2
                    {
                    match(input,IDF,FOLLOW_IDF_in_expr944); 
                    pushFollow(FOLLOW_expr2_in_expr946);
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
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "expr2"
    // fantastic4.g:81:1: expr2 : ( opb expr | );
    public final void expr2() throws RecognitionException {
        try {
            // fantastic4.g:81:8: ( opb expr | )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=32 && LA11_0<=43)) ) {
                alt11=1;
            }
            else if ( (LA11_0==EOF||LA11_0==11||LA11_0==16||LA11_0==18||(LA11_0>=21 && LA11_0<=22)||LA11_0==24||LA11_0==31) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // fantastic4.g:81:10: opb expr
                    {
                    pushFollow(FOLLOW_opb_in_expr2980);
                    opb();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr2982);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // fantastic4.g:83:4: 
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
        return ;
    }
    // $ANTLR end "expr2"


    // $ANTLR start "opb"
    // fantastic4.g:85:1: opb : ( '+' | '-' | '*' | '/' | '<' | '<=' | '>' | '>=' | '==' | '!=' | 'and' | 'or' );
    public final void opb() throws RecognitionException {
        try {
            // fantastic4.g:85:13: ( '+' | '-' | '*' | '/' | '<' | '<=' | '>' | '>=' | '==' | '!=' | 'and' | 'or' )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=32 && input.LA(1)<=43) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "opb"


    // $ANTLR start "opun"
    // fantastic4.g:99:1: opun : ( '-' | 'not' );
    public final void opun() throws RecognitionException {
        try {
            // fantastic4.g:99:13: ( '-' | 'not' )
            // fantastic4.g:
            {
            if ( input.LA(1)==33||input.LA(1)==44 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "opun"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\4\1\uffff\1\12\1\4\1\14\1\12\1\13\1\14\2\uffff\1\13";
    static final String DFA4_maxS =
        "\1\23\1\uffff\1\12\1\4\1\17\1\12\1\22\1\17\2\uffff\1\22";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\1\3\1\uffff";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\15\uffff\1\1\1\3",
            "",
            "\1\4",
            "\1\5",
            "\4\6",
            "\1\7",
            "\1\11\6\uffff\1\10",
            "\4\12",
            "",
            "",
            "\1\11\6\uffff\1\10"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "35:1: arglist : ( | arg | arg ',' arglist );";
        }
    }
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\4\2\uffff\1\21\6\uffff";
    static final String DFA6_maxS =
        "\1\36\2\uffff\1\31\6\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\6\1\7\1\10\1\3\1\5";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\3\17\uffff\1\1\2\uffff\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1"+
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "44:1: instr : ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF | 'write' writable );";
        }
    }
 

    public static final BitSet FOLLOW_8_in_prog32 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_prog34 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_vardeclist_in_prog36 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_funcdeclist_in_prog38 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_instr_in_prog41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varsuitdecl_in_vardeclist77 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_vardeclist_in_vardeclist79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_varsuitdecl112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idenlist_in_varsuitdecl114 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_varsuitdecl116 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_typename_in_varsuitdecl118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_idenlist154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_idenlist170 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_idenlist172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idenlist_in_idenlist174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typename0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcdecl_in_funcdeclist291 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_funcdeclist_in_funcdeclist293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_funcdecl329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_funcdecl331 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_funcdecl333 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_arglist_in_funcdecl335 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_funcdecl337 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_funcdecl339 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_typename_in_funcdecl341 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_vardeclist_in_funcdecl343 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_instr_in_funcdecl345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arglist384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arglist400 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_arglist402 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_arglist_in_arglist404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_arg433 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arg435 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_typename_in_arg437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_arg453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_arg455 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arg457 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_typename_in_arg459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_instr486 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_expr_in_instr488 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instr490 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_instr_in_instr492 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_instr494 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_instr_in_instr496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_instr512 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_expr_in_instr514 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_instr516 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_instr_in_instr518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr534 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instr536 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_expr_in_instr538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_instr554 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_returnable_in_instr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr572 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_instr574 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_exprlist_in_instr576 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_instr578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_instr594 = new BitSet(new long[]{0x000000007C910210L});
    public static final BitSet FOLLOW_sequence_in_instr596 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_instr598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_instr614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_in_instr616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_instr632 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_writable_in_instr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_returnable660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_writable0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instr_in_sequence730 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_sequence732 = new BitSet(new long[]{0x000000006C910210L});
    public static final BitSet FOLLOW_sequence_in_sequence734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprlist770 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_nextexpr_in_exprlist772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_nextexpr810 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_expr_in_nextexpr812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_in_expr840 = new BitSet(new long[]{0x00000FFF00000000L});
    public static final BitSet FOLLOW_expr2_in_expr842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expr858 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_expr_in_expr860 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expr862 = new BitSet(new long[]{0x00000FFF00000000L});
    public static final BitSet FOLLOW_expr2_in_expr864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opun_in_expr880 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_expr_in_expr882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expr898 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_expr900 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_exprlist_in_expr902 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expr904 = new BitSet(new long[]{0x00000FFF00000000L});
    public static final BitSet FOLLOW_expr2_in_expr906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expr922 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_expr924 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expr926 = new BitSet(new long[]{0x00000FFF00000000L});
    public static final BitSet FOLLOW_expr2_in_expr928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expr944 = new BitSet(new long[]{0x00000FFF00000000L});
    public static final BitSet FOLLOW_expr2_in_expr946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opb_in_expr2980 = new BitSet(new long[]{0x0000100200020030L});
    public static final BitSet FOLLOW_expr_in_expr2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_opb0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_opun0 = new BitSet(new long[]{0x0000000000000002L});

}