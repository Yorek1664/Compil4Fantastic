// $ANTLR 3.3 Nov 30, 2010 12:50:56 fantastic4.g 2014-05-29 16:00:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
        

    public String[] getTokenNames() { return fantastic4Parser.tokenNames; }
    public String getGrammarFileName() { return "fantastic4.g"; }



    // $ANTLR start "prog"
    // fantastic4.g:9:1: prog : 'program' IDF ( vardeclist )? ( funcdeclist )? instr ;
    public final void prog() throws RecognitionException {
        try {
            // fantastic4.g:9:13: ( 'program' IDF ( vardeclist )? ( funcdeclist )? instr )
            // fantastic4.g:9:15: 'program' IDF ( vardeclist )? ( funcdeclist )? instr
            {
            match(input,10,FOLLOW_10_in_prog32); 
            match(input,IDF,FOLLOW_IDF_in_prog34); 
            // fantastic4.g:9:29: ( vardeclist )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // fantastic4.g:9:29: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_prog36);
                    vardeclist();

                    state._fsp--;


                    }
                    break;

            }

            // fantastic4.g:9:41: ( funcdeclist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // fantastic4.g:9:41: funcdeclist
                    {
                    pushFollow(FOLLOW_funcdeclist_in_prog39);
                    funcdeclist();

                    state._fsp--;


                    }
                    break;

            }

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
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "vardeclist"
    // fantastic4.g:12:1: vardeclist : varsuitdecl ( vardeclist )? ;
    public final void vardeclist() throws RecognitionException {
        try {
            // fantastic4.g:12:13: ( varsuitdecl ( vardeclist )? )
            // fantastic4.g:12:15: varsuitdecl ( vardeclist )?
            {
            pushFollow(FOLLOW_varsuitdecl_in_vardeclist64);
            varsuitdecl();

            state._fsp--;

            // fantastic4.g:12:27: ( vardeclist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // fantastic4.g:12:27: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_vardeclist66);
                    vardeclist();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "vardeclist"


    // $ANTLR start "varsuitdecl"
    // fantastic4.g:15:1: varsuitdecl : 'var' idenlist ':' typename ';' ;
    public final void varsuitdecl() throws RecognitionException {
        try {
            // fantastic4.g:15:13: ( 'var' idenlist ':' typename ';' )
            // fantastic4.g:15:15: 'var' idenlist ':' typename ';'
            {
            match(input,11,FOLLOW_11_in_varsuitdecl100); 
            pushFollow(FOLLOW_idenlist_in_varsuitdecl102);
            idenlist();

            state._fsp--;

            match(input,12,FOLLOW_12_in_varsuitdecl104); 
            pushFollow(FOLLOW_typename_in_varsuitdecl106);
            typename();

            state._fsp--;

            match(input,13,FOLLOW_13_in_varsuitdecl108); 

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
    // fantastic4.g:18:1: idenlist : ( IDF | IDF ',' idenlist );
    public final void idenlist() throws RecognitionException {
        try {
            // fantastic4.g:18:13: ( IDF | IDF ',' idenlist )
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
                    // fantastic4.g:18:15: IDF
                    {
                    match(input,IDF,FOLLOW_IDF_in_idenlist144); 

                    }
                    break;
                case 2 :
                    // fantastic4.g:19:15: IDF ',' idenlist
                    {
                    match(input,IDF,FOLLOW_IDF_in_idenlist160); 
                    match(input,14,FOLLOW_14_in_idenlist162); 
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
        return ;
    }
    // $ANTLR end "idenlist"


    // $ANTLR start "typename"
    // fantastic4.g:22:1: typename : ( 'void' | 'bool' | 'int' | 'char' );
    public final void typename() throws RecognitionException {
        try {
            // fantastic4.g:22:13: ( 'void' | 'bool' | 'int' | 'char' )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=15 && input.LA(1)<=18) ) {
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
    // fantastic4.g:28:1: funcdeclist : funcdecl ( funcdeclist )? ;
    public final void funcdeclist() throws RecognitionException {
        try {
            // fantastic4.g:28:13: ( funcdecl ( funcdeclist )? )
            // fantastic4.g:28:15: funcdecl ( funcdeclist )?
            {
            pushFollow(FOLLOW_funcdecl_in_funcdeclist281);
            funcdecl();

            state._fsp--;

            // fantastic4.g:28:24: ( funcdeclist )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // fantastic4.g:28:24: funcdeclist
                    {
                    pushFollow(FOLLOW_funcdeclist_in_funcdeclist283);
                    funcdeclist();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "funcdeclist"


    // $ANTLR start "funcdecl"
    // fantastic4.g:31:1: funcdecl : 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr ;
    public final void funcdecl() throws RecognitionException {
        try {
            // fantastic4.g:31:13: ( 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr )
            // fantastic4.g:31:15: 'function' IDF '(' arglist ')' ':' typename ( vardeclist )? instr
            {
            match(input,19,FOLLOW_19_in_funcdecl320); 
            match(input,IDF,FOLLOW_IDF_in_funcdecl322); 
            match(input,20,FOLLOW_20_in_funcdecl324); 
            pushFollow(FOLLOW_arglist_in_funcdecl326);
            arglist();

            state._fsp--;

            match(input,21,FOLLOW_21_in_funcdecl328); 
            match(input,12,FOLLOW_12_in_funcdecl330); 
            pushFollow(FOLLOW_typename_in_funcdecl332);
            typename();

            state._fsp--;

            // fantastic4.g:31:59: ( vardeclist )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // fantastic4.g:31:59: vardeclist
                    {
                    pushFollow(FOLLOW_vardeclist_in_funcdecl334);
                    vardeclist();

                    state._fsp--;


                    }
                    break;

            }

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
        return ;
    }
    // $ANTLR end "funcdecl"


    // $ANTLR start "arglist"
    // fantastic4.g:34:1: arglist : ( | arg | arg ',' arglist );
    public final void arglist() throws RecognitionException {
        try {
            // fantastic4.g:34:13: ( | arg | arg ',' arglist )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // fantastic4.g:35:13: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:35:15: arg
                    {
                    pushFollow(FOLLOW_arg_in_arglist376);
                    arg();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // fantastic4.g:36:15: arg ',' arglist
                    {
                    pushFollow(FOLLOW_arg_in_arglist392);
                    arg();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_arglist394); 
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
        return ;
    }
    // $ANTLR end "arglist"


    // $ANTLR start "arg"
    // fantastic4.g:39:1: arg : ( IDF ':' typename | 'ref' IDF ':' typename );
    public final void arg() throws RecognitionException {
        try {
            // fantastic4.g:39:13: ( IDF ':' typename | 'ref' IDF ':' typename )
            int alt8=2;
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

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // fantastic4.g:39:15: IDF ':' typename
                    {
                    match(input,IDF,FOLLOW_IDF_in_arg425); 
                    match(input,12,FOLLOW_12_in_arg427); 
                    pushFollow(FOLLOW_typename_in_arg429);
                    typename();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // fantastic4.g:40:15: 'ref' IDF ':' typename
                    {
                    match(input,22,FOLLOW_22_in_arg445); 
                    match(input,IDF,FOLLOW_IDF_in_arg447); 
                    match(input,12,FOLLOW_12_in_arg449); 
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
        return ;
    }
    // $ANTLR end "arg"


    // $ANTLR start "instr"
    // fantastic4.g:43:1: instr : ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr ';' | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF ';' | 'write' writable ';' );
    public final void instr() throws RecognitionException {
        try {
            // fantastic4.g:43:13: ( 'if' expr 'then' instr 'else' instr | 'while' expr 'do' instr | IDF '=' expr ';' | 'return' returnable | IDF '(' exprlist ')' | '{' sequence '}' | 'read' IDF ';' | 'write' writable ';' )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // fantastic4.g:43:15: 'if' expr 'then' instr 'else' instr
                    {
                    match(input,23,FOLLOW_23_in_instr478); 
                    pushFollow(FOLLOW_expr_in_instr480);
                    expr();

                    state._fsp--;

                    match(input,24,FOLLOW_24_in_instr482); 
                    pushFollow(FOLLOW_instr_in_instr484);
                    instr();

                    state._fsp--;

                    match(input,25,FOLLOW_25_in_instr486); 
                    pushFollow(FOLLOW_instr_in_instr488);
                    instr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // fantastic4.g:44:15: 'while' expr 'do' instr
                    {
                    match(input,26,FOLLOW_26_in_instr504); 
                    pushFollow(FOLLOW_expr_in_instr506);
                    expr();

                    state._fsp--;

                    match(input,27,FOLLOW_27_in_instr508); 
                    pushFollow(FOLLOW_instr_in_instr510);
                    instr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // fantastic4.g:45:15: IDF '=' expr ';'
                    {
                    match(input,IDF,FOLLOW_IDF_in_instr526); 
                    match(input,28,FOLLOW_28_in_instr528); 
                    pushFollow(FOLLOW_expr_in_instr530);
                    expr();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_instr532); 

                    }
                    break;
                case 4 :
                    // fantastic4.g:46:15: 'return' returnable
                    {
                    match(input,29,FOLLOW_29_in_instr548); 
                    pushFollow(FOLLOW_returnable_in_instr550);
                    returnable();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // fantastic4.g:47:15: IDF '(' exprlist ')'
                    {
                    match(input,IDF,FOLLOW_IDF_in_instr566); 
                    match(input,20,FOLLOW_20_in_instr568); 
                    pushFollow(FOLLOW_exprlist_in_instr570);
                    exprlist();

                    state._fsp--;

                    match(input,21,FOLLOW_21_in_instr572); 

                    }
                    break;
                case 6 :
                    // fantastic4.g:48:15: '{' sequence '}'
                    {
                    match(input,30,FOLLOW_30_in_instr588); 
                    pushFollow(FOLLOW_sequence_in_instr590);
                    sequence();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_instr592); 

                    }
                    break;
                case 7 :
                    // fantastic4.g:49:15: 'read' IDF ';'
                    {
                    match(input,32,FOLLOW_32_in_instr608); 
                    match(input,IDF,FOLLOW_IDF_in_instr610); 
                    match(input,13,FOLLOW_13_in_instr612); 

                    }
                    break;
                case 8 :
                    // fantastic4.g:50:15: 'write' writable ';'
                    {
                    match(input,33,FOLLOW_33_in_instr628); 
                    pushFollow(FOLLOW_writable_in_instr630);
                    writable();

                    state._fsp--;

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
        return ;
    }
    // $ANTLR end "instr"


    // $ANTLR start "returnable"
    // fantastic4.g:53:1: returnable : expr ';' ;
    public final void returnable() throws RecognitionException {
        try {
            // fantastic4.g:53:12: ( expr ';' )
            // fantastic4.g:53:14: expr ';'
            {
            pushFollow(FOLLOW_expr_in_returnable653);
            expr();

            state._fsp--;

            match(input,13,FOLLOW_13_in_returnable655); 

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
    // fantastic4.g:56:1: writable : ( IDF | cste );
    public final void writable() throws RecognitionException {
        try {
            // fantastic4.g:56:13: ( IDF | cste )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDF) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=CSTEINT && LA10_0<=CSTESTRING)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // fantastic4.g:56:15: IDF
                    {
                    match(input,IDF,FOLLOW_IDF_in_writable670); 

                    }
                    break;
                case 2 :
                    // fantastic4.g:57:15: cste
                    {
                    pushFollow(FOLLOW_cste_in_writable686);
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
        return ;
    }
    // $ANTLR end "writable"


    // $ANTLR start "sequence"
    // fantastic4.g:60:1: sequence : ( | instr sequence );
    public final void sequence() throws RecognitionException {
        try {
            // fantastic4.g:60:13: ( | instr sequence )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDF||LA11_0==23||LA11_0==26||(LA11_0>=29 && LA11_0<=30)||(LA11_0>=32 && LA11_0<=33)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // fantastic4.g:61:13: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:61:15: instr sequence
                    {
                    pushFollow(FOLLOW_instr_in_sequence725);
                    instr();

                    state._fsp--;

                    pushFollow(FOLLOW_sequence_in_sequence728);
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
    // fantastic4.g:64:1: exprlist : expr nextexpr ;
    public final void exprlist() throws RecognitionException {
        try {
            // fantastic4.g:64:13: ( expr nextexpr )
            // fantastic4.g:64:15: expr nextexpr
            {
            pushFollow(FOLLOW_expr_in_exprlist764);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_nextexpr_in_exprlist766);
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
    // fantastic4.g:67:1: nextexpr : ( | ',' expr );
    public final void nextexpr() throws RecognitionException {
        try {
            // fantastic4.g:67:13: ( | ',' expr )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // fantastic4.g:68:13: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:68:15: ',' expr
                    {
                    match(input,14,FOLLOW_14_in_nextexpr804); 
                    pushFollow(FOLLOW_expr_in_nextexpr806);
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
    // fantastic4.g:71:1: expr : add ;
    public final void expr() throws RecognitionException {
        try {
            // fantastic4.g:71:6: ( add )
            // fantastic4.g:71:8: add
            {
            pushFollow(FOLLOW_add_in_expr827);
            add();

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
    // $ANTLR end "expr"


    // $ANTLR start "add"
    // fantastic4.g:74:1: add : mult ( addSubtractOp add )? ;
    public final void add() throws RecognitionException {
        try {
            // fantastic4.g:74:5: ( mult ( addSubtractOp add )? )
            // fantastic4.g:74:7: mult ( addSubtractOp add )?
            {
            pushFollow(FOLLOW_mult_in_add842);
            mult();

            state._fsp--;

            // fantastic4.g:74:12: ( addSubtractOp add )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=37 && LA13_0<=38)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // fantastic4.g:74:13: addSubtractOp add
                    {
                    pushFollow(FOLLOW_addSubtractOp_in_add845);
                    addSubtractOp();

                    state._fsp--;

                    pushFollow(FOLLOW_add_in_add847);
                    add();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "add"


    // $ANTLR start "mult"
    // fantastic4.g:77:1: mult : and ( multiplyDivideOp mult )? ;
    public final void mult() throws RecognitionException {
        try {
            // fantastic4.g:78:2: ( and ( multiplyDivideOp mult )? )
            // fantastic4.g:78:4: and ( multiplyDivideOp mult )?
            {
            pushFollow(FOLLOW_and_in_mult862);
            and();

            state._fsp--;

            // fantastic4.g:78:8: ( multiplyDivideOp mult )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=39 && LA14_0<=40)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // fantastic4.g:78:9: multiplyDivideOp mult
                    {
                    pushFollow(FOLLOW_multiplyDivideOp_in_mult865);
                    multiplyDivideOp();

                    state._fsp--;

                    pushFollow(FOLLOW_mult_in_mult868);
                    mult();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "mult"


    // $ANTLR start "and"
    // fantastic4.g:81:1: and : comp ( '&&' and )? ;
    public final void and() throws RecognitionException {
        try {
            // fantastic4.g:82:2: ( comp ( '&&' and )? )
            // fantastic4.g:82:4: comp ( '&&' and )?
            {
            pushFollow(FOLLOW_comp_in_and882);
            comp();

            state._fsp--;

            // fantastic4.g:82:9: ( '&&' and )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // fantastic4.g:82:10: '&&' and
                    {
                    match(input,34,FOLLOW_34_in_and885); 
                    pushFollow(FOLLOW_and_in_and888);
                    and();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "and"


    // $ANTLR start "comp"
    // fantastic4.g:85:1: comp : or ( comparatorOp comp )? ;
    public final void comp() throws RecognitionException {
        try {
            // fantastic4.g:86:2: ( or ( comparatorOp comp )? )
            // fantastic4.g:86:4: or ( comparatorOp comp )?
            {
            pushFollow(FOLLOW_or_in_comp902);
            or();

            state._fsp--;

            // fantastic4.g:86:7: ( comparatorOp comp )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=41 && LA16_0<=45)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // fantastic4.g:86:8: comparatorOp comp
                    {
                    pushFollow(FOLLOW_comparatorOp_in_comp905);
                    comparatorOp();

                    state._fsp--;

                    pushFollow(FOLLOW_comp_in_comp908);
                    comp();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "comp"


    // $ANTLR start "or"
    // fantastic4.g:89:1: or : puis ( '||' or )? ;
    public final void or() throws RecognitionException {
        try {
            // fantastic4.g:89:5: ( puis ( '||' or )? )
            // fantastic4.g:89:7: puis ( '||' or )?
            {
            pushFollow(FOLLOW_puis_in_or924);
            puis();

            state._fsp--;

            // fantastic4.g:89:12: ( '||' or )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // fantastic4.g:89:13: '||' or
                    {
                    match(input,35,FOLLOW_35_in_or927); 
                    pushFollow(FOLLOW_or_in_or930);
                    or();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "or"


    // $ANTLR start "puis"
    // fantastic4.g:92:1: puis : negExpression ( '^' puis )? ;
    public final void puis() throws RecognitionException {
        try {
            // fantastic4.g:93:2: ( negExpression ( '^' puis )? )
            // fantastic4.g:93:5: negExpression ( '^' puis )?
            {
            pushFollow(FOLLOW_negExpression_in_puis947);
            negExpression();

            state._fsp--;

            // fantastic4.g:93:19: ( '^' puis )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // fantastic4.g:93:20: '^' puis
                    {
                    match(input,36,FOLLOW_36_in_puis950); 
                    pushFollow(FOLLOW_puis_in_puis952);
                    puis();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "puis"


    // $ANTLR start "negExpression"
    // fantastic4.g:96:1: negExpression : ( neg )? expressionAtom ;
    public final void negExpression() throws RecognitionException {
        try {
            // fantastic4.g:96:14: ( ( neg )? expressionAtom )
            // fantastic4.g:96:16: ( neg )? expressionAtom
            {
            // fantastic4.g:96:16: ( neg )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=46 && LA19_0<=47)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // fantastic4.g:96:16: neg
                    {
                    pushFollow(FOLLOW_neg_in_negExpression964);
                    neg();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_expressionAtom_in_negExpression967);
            expressionAtom();

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
    // $ANTLR end "negExpression"


    // $ANTLR start "expressionAtom"
    // fantastic4.g:99:2: expressionAtom : ( | cste | IDF | ( '(' add ')' ) | IDF '(' exprlist ')' );
    public final void expressionAtom() throws RecognitionException {
        try {
            // fantastic4.g:99:17: ( | cste | IDF | ( '(' add ')' ) | IDF '(' exprlist ')' )
            int alt20=5;
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
                alt20=1;
                }
                break;
            case CSTEINT:
            case CSTEBOOL:
            case CSTESTRING:
                {
                alt20=2;
                }
                break;
            case IDF:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==20) ) {
                    alt20=5;
                }
                else if ( ((LA20_3>=13 && LA20_3<=14)||LA20_3==21||LA20_3==24||LA20_3==27||(LA20_3>=34 && LA20_3<=45)) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // fantastic4.g:100:5: 
                    {
                    }
                    break;
                case 2 :
                    // fantastic4.g:100:9: cste
                    {
                    pushFollow(FOLLOW_cste_in_expressionAtom988);
                    cste();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // fantastic4.g:101:9: IDF
                    {
                    match(input,IDF,FOLLOW_IDF_in_expressionAtom998); 

                    }
                    break;
                case 4 :
                    // fantastic4.g:102:8: ( '(' add ')' )
                    {
                    // fantastic4.g:102:8: ( '(' add ')' )
                    // fantastic4.g:102:10: '(' add ')'
                    {
                    match(input,20,FOLLOW_20_in_expressionAtom1009); 
                    pushFollow(FOLLOW_add_in_expressionAtom1011);
                    add();

                    state._fsp--;

                    match(input,21,FOLLOW_21_in_expressionAtom1013); 

                    }


                    }
                    break;
                case 5 :
                    // fantastic4.g:103:7: IDF '(' exprlist ')'
                    {
                    match(input,IDF,FOLLOW_IDF_in_expressionAtom1023); 
                    match(input,20,FOLLOW_20_in_expressionAtom1025); 
                    pushFollow(FOLLOW_exprlist_in_expressionAtom1027);
                    exprlist();

                    state._fsp--;

                    match(input,21,FOLLOW_21_in_expressionAtom1029); 

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
    // $ANTLR end "expressionAtom"


    // $ANTLR start "addSubtractOp"
    // fantastic4.g:107:1: addSubtractOp : ( '+' | '-' );
    public final void addSubtractOp() throws RecognitionException {
        try {
            // fantastic4.g:108:2: ( '+' | '-' )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
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
    // $ANTLR end "addSubtractOp"


    // $ANTLR start "multiplyDivideOp"
    // fantastic4.g:112:1: multiplyDivideOp : ( '*' | '/' );
    public final void multiplyDivideOp() throws RecognitionException {
        try {
            // fantastic4.g:113:2: ( '*' | '/' )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
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
    // $ANTLR end "multiplyDivideOp"


    // $ANTLR start "comparatorOp"
    // fantastic4.g:117:1: comparatorOp : ( '>' | '<' | '>=' | '<=' | '!=' );
    public final void comparatorOp() throws RecognitionException {
        try {
            // fantastic4.g:118:2: ( '>' | '<' | '>=' | '<=' | '!=' )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=41 && input.LA(1)<=45) ) {
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
    // $ANTLR end "comparatorOp"


    // $ANTLR start "cste"
    // fantastic4.g:125:1: cste : ( CSTEINT | CSTEBOOL | CSTESTRING );
    public final void cste() throws RecognitionException {
        try {
            // fantastic4.g:125:7: ( CSTEINT | CSTEBOOL | CSTESTRING )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=CSTEINT && input.LA(1)<=CSTESTRING) ) {
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
    // $ANTLR end "cste"


    // $ANTLR start "neg"
    // fantastic4.g:130:1: neg : ( 'not' | '!' );
    public final void neg() throws RecognitionException {
        try {
            // fantastic4.g:130:13: ( 'not' | '!' )
            // fantastic4.g:
            {
            if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
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
    // $ANTLR end "neg"

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
        "\1\uffff\1\1\6\uffff\1\2\1\3\1\uffff";
    static final String DFA7_specialS =
        "\13\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\20\uffff\1\1\1\3",
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
    public static final BitSet FOLLOW_23_in_instr478 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_expr_in_instr480 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_instr482 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr484 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instr486 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_instr504 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_expr_in_instr506 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_instr508 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_instr_in_instr510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr526 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_instr528 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_expr_in_instr530 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_instr532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_instr548 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_returnable_in_instr550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instr566 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_instr568 = new BitSet(new long[]{0x0000C000001000F0L});
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
    public static final BitSet FOLLOW_expr_in_returnable653 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_returnable655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_writable670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cste_in_writable686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instr_in_sequence725 = new BitSet(new long[]{0x0000000364880810L});
    public static final BitSet FOLLOW_sequence_in_sequence728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprlist764 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_nextexpr_in_exprlist766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_nextexpr804 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_expr_in_nextexpr806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_expr827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_add842 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_addSubtractOp_in_add845 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_add_in_add847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_mult862 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_multiplyDivideOp_in_mult865 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_mult_in_mult868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_in_and882 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_and885 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_and_in_and888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_comp902 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_comparatorOp_in_comp905 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_comp_in_comp908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_puis_in_or924 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_or927 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_or_in_or930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negExpression_in_puis947 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_puis950 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_puis_in_puis952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neg_in_negExpression964 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_expressionAtom_in_negExpression967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cste_in_expressionAtom988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expressionAtom998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expressionAtom1009 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_add_in_expressionAtom1011 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expressionAtom1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expressionAtom1023 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expressionAtom1025 = new BitSet(new long[]{0x0000C000001000F0L});
    public static final BitSet FOLLOW_exprlist_in_expressionAtom1027 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expressionAtom1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_addSubtractOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_multiplyDivideOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparatorOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cste0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_neg0 = new BitSet(new long[]{0x0000000000000002L});

}