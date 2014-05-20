// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g 2014-05-12 17:39:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class testOpeLexer extends Lexer {
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

    public testOpeLexer() {;} 
    public testOpeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public testOpeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:7:6: ( '-' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:7:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:8:6: ( '+' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:8:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:9:6: ( '*' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:9:8: '*'
            {
            match('*'); 

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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:10:6: ( '/' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:10:8: '/'
            {
            match('/'); 

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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:11:7: ( '>' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:11:9: '>'
            {
            match('>'); 

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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:12:7: ( '<' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:12:9: '<'
            {
            match('<'); 

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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:13:7: ( '>=' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:13:9: '>='
            {
            match(">="); 


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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:14:7: ( '<=' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:14:9: '<='
            {
            match("<="); 


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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:15:7: ( '!=' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:15:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:38:5: ( ( '0' .. '9' )+ )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:38:7: ( '0' .. '9' )+
            {
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:38:7: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:38:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:41:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:41:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

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
        // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | INT | WS )
        int alt2=11;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:10: T__6
                {
                mT__6(); 

                }
                break;
            case 2 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:15: T__7
                {
                mT__7(); 

                }
                break;
            case 3 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:20: T__8
                {
                mT__8(); 

                }
                break;
            case 4 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:25: T__9
                {
                mT__9(); 

                }
                break;
            case 5 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:30: T__10
                {
                mT__10(); 

                }
                break;
            case 6 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:36: T__11
                {
                mT__11(); 

                }
                break;
            case 7 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:42: T__12
                {
                mT__12(); 

                }
                break;
            case 8 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:48: T__13
                {
                mT__13(); 

                }
                break;
            case 9 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:54: T__14
                {
                mT__14(); 

                }
                break;
            case 10 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:60: INT
                {
                mINT(); 

                }
                break;
            case 11 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/testOpe.g:1:64: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\5\uffff\1\13\1\15\7\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\11\4\uffff\2\75\7\uffff";
    static final String DFA2_maxS =
        "\1\76\4\uffff\2\75\7\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\11\1\12\1\13\1\7\1\5\1\10\1\6";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\11\2\uffff\1\11\22\uffff\1\11\1\7\10\uffff\1\3\1\2\1\uffff"+
            "\1\1\1\uffff\1\4\12\10\2\uffff\1\6\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | INT | WS );";
        }
    }
 

}