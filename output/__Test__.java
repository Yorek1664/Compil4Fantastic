import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        fantastic4Lexer lex = new fantastic4Lexer(new ANTLRFileStream("C:\\Users\\Hugo\\Desktop\\Cours\\Compil4Fantastic\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        fantastic4Parser g = new fantastic4Parser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}