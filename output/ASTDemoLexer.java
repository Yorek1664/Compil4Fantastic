// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g 2014-05-29 16:13:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASTDemoLexer extends Lexer {
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

    public ASTDemoLexer() {;} 
    public ASTDemoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ASTDemoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:3:6: ( '||' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:3:8: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:4:6: ( '&&' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:4:8: '&&'
            {
            match("&&"); 


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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:5:6: ( 'true' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:5:8: 'true'
            {
            match("true"); 


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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:6:6: ( 'false' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:6:8: 'false'
            {
            match("false"); 


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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:7:6: ( '(' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:7:8: '('
            {
            match('('); 

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
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:8:7: ( ')' )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "Space"
    public final void mSpace() throws RecognitionException {
        try {
            int _type = Space;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:29:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:29:6: ( ' ' | '\\t' | '\\r' | '\\n' )
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
    // $ANTLR end "Space"

    public void mTokens() throws RecognitionException {
        // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:1:8: ( T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | Space )
        int alt1=7;
        switch ( input.LA(1) ) {
        case '|':
            {
            alt1=1;
            }
            break;
        case '&':
            {
            alt1=2;
            }
            break;
        case 't':
            {
            alt1=3;
            }
            break;
        case 'f':
            {
            alt1=4;
            }
            break;
        case '(':
            {
            alt1=5;
            }
            break;
        case ')':
            {
            alt1=6;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt1=7;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;
        }

        switch (alt1) {
            case 1 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:1:10: T__5
                {
                mT__5(); 

                }
                break;
            case 2 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:1:15: T__6
                {
                mT__6(); 

                }
                break;
            case 3 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:1:20: T__7
                {
                mT__7(); 

                }
                break;
            case 4 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:1:25: T__8
                {
                mT__8(); 

                }
                break;
            case 5 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:1:30: T__9
                {
                mT__9(); 

                }
                break;
            case 6 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:1:35: T__10
                {
                mT__10(); 

                }
                break;
            case 7 :
                // /Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/ASTDemo.g:1:41: Space
                {
                mSpace(); 

                }
                break;

        }

    }


 

}