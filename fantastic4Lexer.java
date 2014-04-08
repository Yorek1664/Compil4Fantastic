// $ANTLR 3.3 Nov 30, 2010 12:50:56 fantastic4.g 2014-04-07 09:48:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class fantastic4Lexer extends Lexer {
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

    public fantastic4Lexer() {;} 
    public fantastic4Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public fantastic4Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "fantastic4.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:7:6: ( 'program' )
            // fantastic4.g:7:8: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:8:6: ( 'var' )
            // fantastic4.g:8:8: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:9:7: ( ':' )
            // fantastic4.g:9:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:10:7: ( ',' )
            // fantastic4.g:10:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:11:7: ( 'void' )
            // fantastic4.g:11:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:12:7: ( 'bool' )
            // fantastic4.g:12:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:13:7: ( 'int' )
            // fantastic4.g:13:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:14:7: ( 'char' )
            // fantastic4.g:14:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:15:7: ( 'function' )
            // fantastic4.g:15:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:16:7: ( '(' )
            // fantastic4.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:17:7: ( ')' )
            // fantastic4.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:18:7: ( 'ref' )
            // fantastic4.g:18:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:19:7: ( 'if' )
            // fantastic4.g:19:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:20:7: ( 'then' )
            // fantastic4.g:20:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:21:7: ( 'else' )
            // fantastic4.g:21:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:22:7: ( 'while' )
            // fantastic4.g:22:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:23:7: ( 'do' )
            // fantastic4.g:23:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:24:7: ( '=' )
            // fantastic4.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:25:7: ( 'return' )
            // fantastic4.g:25:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:26:7: ( '{' )
            // fantastic4.g:26:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:27:7: ( '}' )
            // fantastic4.g:27:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:28:7: ( 'read' )
            // fantastic4.g:28:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:29:7: ( 'write' )
            // fantastic4.g:29:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:30:7: ( ';' )
            // fantastic4.g:30:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:31:7: ( '+' )
            // fantastic4.g:31:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:32:7: ( '-' )
            // fantastic4.g:32:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:33:7: ( '*' )
            // fantastic4.g:33:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:34:7: ( '/' )
            // fantastic4.g:34:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:35:7: ( '<' )
            // fantastic4.g:35:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:36:7: ( '<=' )
            // fantastic4.g:36:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:37:7: ( '>' )
            // fantastic4.g:37:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:38:7: ( '>=' )
            // fantastic4.g:38:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:39:7: ( '==' )
            // fantastic4.g:39:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:40:7: ( '!=' )
            // fantastic4.g:40:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:41:7: ( 'and' )
            // fantastic4.g:41:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:42:7: ( 'or' )
            // fantastic4.g:42:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:43:7: ( 'not' )
            // fantastic4.g:43:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:104:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // fantastic4.g:104:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // fantastic4.g:104:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // fantastic4.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF"

    // $ANTLR start "CSTE"
    public final void mCSTE() throws RecognitionException {
        try {
            int _type = CSTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:105:9: ( ( 'true' | 'false' ) | ( ( '\"' )* '\"' ) | ( '0' .. '9' )+ )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 'f':
            case 't':
                {
                alt5=1;
                }
                break;
            case '\"':
                {
                alt5=2;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // fantastic4.g:105:11: ( 'true' | 'false' )
                    {
                    // fantastic4.g:105:11: ( 'true' | 'false' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='t') ) {
                        alt2=1;
                    }
                    else if ( (LA2_0=='f') ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // fantastic4.g:105:12: 'true'
                            {
                            match("true"); 


                            }
                            break;
                        case 2 :
                            // fantastic4.g:105:19: 'false'
                            {
                            match("false"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // fantastic4.g:105:28: ( ( '\"' )* '\"' )
                    {
                    // fantastic4.g:105:28: ( ( '\"' )* '\"' )
                    // fantastic4.g:105:29: ( '\"' )* '\"'
                    {
                    // fantastic4.g:105:29: ( '\"' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\"') ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1=='\"') ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // fantastic4.g:105:29: '\"'
                    	    {
                    	    match('\"'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }


                    }
                    break;
                case 3 :
                    // fantastic4.g:105:38: ( '0' .. '9' )+
                    {
                    // fantastic4.g:105:38: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // fantastic4.g:105:39: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE"

    // $ANTLR start "COMM"
    public final void mCOMM() throws RecognitionException {
        try {
            int _type = COMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:106:9: ( ( ( '/*' )* '*/' ) | ( ( '//' )* '\\n' ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case '/':
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='*') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='/') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case '*':
                {
                alt8=1;
                }
                break;
            case '\n':
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // fantastic4.g:106:11: ( ( '/*' )* '*/' )
                    {
                    // fantastic4.g:106:11: ( ( '/*' )* '*/' )
                    // fantastic4.g:106:12: ( '/*' )* '*/'
                    {
                    // fantastic4.g:106:12: ( '/*' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='/') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // fantastic4.g:106:12: '/*'
                    	    {
                    	    match("/*"); 


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match("*/"); 


                    }


                    }
                    break;
                case 2 :
                    // fantastic4.g:106:23: ( ( '//' )* '\\n' )
                    {
                    // fantastic4.g:106:23: ( ( '//' )* '\\n' )
                    // fantastic4.g:106:24: ( '//' )* '\\n'
                    {
                    // fantastic4.g:106:24: ( '//' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='/') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // fantastic4.g:106:24: '//'
                    	    {
                    	    match("//"); 


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\n'); 

                    }

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMM"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // fantastic4.g:107:9: ( ( ' ' | '\\t' | '\\n' )+ )
            // fantastic4.g:107:11: ( ' ' | '\\t' | '\\n' )+
            {
            // fantastic4.g:107:11: ( ' ' | '\\t' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // fantastic4.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // fantastic4.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | IDF | CSTE | COMM | WS )
        int alt10=41;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // fantastic4.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // fantastic4.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // fantastic4.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // fantastic4.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // fantastic4.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // fantastic4.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // fantastic4.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // fantastic4.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // fantastic4.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // fantastic4.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // fantastic4.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // fantastic4.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // fantastic4.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // fantastic4.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // fantastic4.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // fantastic4.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // fantastic4.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // fantastic4.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // fantastic4.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // fantastic4.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // fantastic4.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // fantastic4.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // fantastic4.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // fantastic4.g:1:146: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // fantastic4.g:1:152: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // fantastic4.g:1:158: T__33
                {
                mT__33(); 

                }
                break;
            case 27 :
                // fantastic4.g:1:164: T__34
                {
                mT__34(); 

                }
                break;
            case 28 :
                // fantastic4.g:1:170: T__35
                {
                mT__35(); 

                }
                break;
            case 29 :
                // fantastic4.g:1:176: T__36
                {
                mT__36(); 

                }
                break;
            case 30 :
                // fantastic4.g:1:182: T__37
                {
                mT__37(); 

                }
                break;
            case 31 :
                // fantastic4.g:1:188: T__38
                {
                mT__38(); 

                }
                break;
            case 32 :
                // fantastic4.g:1:194: T__39
                {
                mT__39(); 

                }
                break;
            case 33 :
                // fantastic4.g:1:200: T__40
                {
                mT__40(); 

                }
                break;
            case 34 :
                // fantastic4.g:1:206: T__41
                {
                mT__41(); 

                }
                break;
            case 35 :
                // fantastic4.g:1:212: T__42
                {
                mT__42(); 

                }
                break;
            case 36 :
                // fantastic4.g:1:218: T__43
                {
                mT__43(); 

                }
                break;
            case 37 :
                // fantastic4.g:1:224: T__44
                {
                mT__44(); 

                }
                break;
            case 38 :
                // fantastic4.g:1:230: IDF
                {
                mIDF(); 

                }
                break;
            case 39 :
                // fantastic4.g:1:234: CSTE
                {
                mCSTE(); 

                }
                break;
            case 40 :
                // fantastic4.g:1:239: COMM
                {
                mCOMM(); 

                }
                break;
            case 41 :
                // fantastic4.g:1:244: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\2\36\2\uffff\4\36\2\uffff\5\36\1\63\5\uffff\1\65\1\66\1"+
        "\70\1\72\1\uffff\3\36\2\uffff\1\64\1\uffff\5\36\1\103\11\36\1\117"+
        "\11\uffff\1\36\1\121\2\36\1\124\2\36\1\127\1\uffff\3\36\1\133\7"+
        "\36\1\uffff\1\143\1\uffff\1\144\1\36\1\uffff\1\146\1\147\1\uffff"+
        "\1\150\2\36\1\uffff\1\36\1\154\1\155\1\uffff\1\156\2\36\2\uffff"+
        "\1\36\3\uffff\1\36\1\uffff\1\36\3\uffff\1\164\1\165\2\36\1\170\2"+
        "\uffff\1\171\1\36\2\uffff\1\173\1\uffff";
    static final String DFA10_eofS =
        "\174\uffff";
    static final String DFA10_minS =
        "\1\11\1\162\1\141\2\uffff\1\157\1\146\1\150\1\141\2\uffff\1\145"+
        "\1\150\1\154\1\150\1\157\1\75\5\uffff\1\57\1\52\2\75\1\uffff\1\156"+
        "\1\162\1\157\2\uffff\1\11\1\uffff\1\157\1\162\1\151\1\157\1\164"+
        "\1\60\1\141\1\156\1\154\1\141\1\145\1\165\1\163\2\151\1\60\11\uffff"+
        "\1\144\1\60\1\164\1\147\1\60\1\144\1\154\1\60\1\uffff\1\162\1\143"+
        "\1\163\1\60\1\165\1\144\1\156\2\145\1\154\1\164\1\uffff\1\60\1\uffff"+
        "\1\60\1\162\1\uffff\2\60\1\uffff\1\60\1\164\1\145\1\uffff\1\162"+
        "\2\60\1\uffff\1\60\2\145\2\uffff\1\141\3\uffff\1\151\1\uffff\1\156"+
        "\3\uffff\2\60\1\155\1\157\1\60\2\uffff\1\60\1\156\2\uffff\1\60\1"+
        "\uffff";
    static final String DFA10_maxS =
        "\1\175\1\162\1\157\2\uffff\1\157\1\156\1\150\1\165\2\uffff\1\145"+
        "\1\162\1\154\1\162\1\157\1\75\5\uffff\2\57\2\75\1\uffff\1\156\1"+
        "\162\1\157\2\uffff\1\40\1\uffff\1\157\1\162\1\151\1\157\1\164\1"+
        "\172\1\141\1\156\1\154\1\164\1\145\1\165\1\163\2\151\1\172\11\uffff"+
        "\1\144\1\172\1\164\1\147\1\172\1\144\1\154\1\172\1\uffff\1\162\1"+
        "\143\1\163\1\172\1\165\1\144\1\156\2\145\1\154\1\164\1\uffff\1\172"+
        "\1\uffff\1\172\1\162\1\uffff\2\172\1\uffff\1\172\1\164\1\145\1\uffff"+
        "\1\162\2\172\1\uffff\1\172\2\145\2\uffff\1\141\3\uffff\1\151\1\uffff"+
        "\1\156\3\uffff\2\172\1\155\1\157\1\172\2\uffff\1\172\1\156\2\uffff"+
        "\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\1\4\4\uffff\1\12\1\13\6\uffff\1\24\1\25\1\30\1\31\1"+
        "\32\4\uffff\1\42\3\uffff\1\46\1\47\1\uffff\1\51\20\uffff\1\41\1"+
        "\22\1\50\1\33\1\34\1\36\1\35\1\40\1\37\10\uffff\1\15\13\uffff\1"+
        "\21\1\uffff\1\44\2\uffff\1\2\2\uffff\1\7\3\uffff\1\14\3\uffff\1"+
        "\46\3\uffff\1\43\1\45\1\uffff\1\5\1\6\1\10\1\uffff\1\46\1\uffff"+
        "\1\26\1\16\1\17\5\uffff\1\20\1\27\2\uffff\1\23\1\1\1\uffff\1\11";
    static final String DFA10_specialS =
        "\174\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\41\1\40\25\uffff\1\41\1\32\1\37\5\uffff\1\11\1\12\1\26\1"+
            "\24\1\4\1\25\1\uffff\1\27\12\37\1\3\1\23\1\30\1\20\1\31\2\uffff"+
            "\32\36\6\uffff\1\33\1\5\1\7\1\17\1\15\1\10\2\36\1\6\4\36\1\35"+
            "\1\34\1\1\1\36\1\13\1\36\1\14\1\36\1\2\1\16\3\36\1\21\1\uffff"+
            "\1\22",
            "\1\42",
            "\1\43\15\uffff\1\44",
            "",
            "",
            "\1\45",
            "\1\47\7\uffff\1\46",
            "\1\50",
            "\1\52\23\uffff\1\51",
            "",
            "",
            "\1\53",
            "\1\54\11\uffff\1\55",
            "\1\56",
            "\1\57\11\uffff\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\64\4\uffff\1\64",
            "\1\67",
            "\1\71",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\2\41\25\uffff\1\41",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\111\4\uffff\1\107\15\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\122",
            "\1\123",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\125",
            "\1\126",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\145",
            "",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\161",
            "",
            "",
            "",
            "\1\162",
            "",
            "\1\163",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\166",
            "\1\167",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\172",
            "",
            "",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
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
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | IDF | CSTE | COMM | WS );";
        }
    }
 

}