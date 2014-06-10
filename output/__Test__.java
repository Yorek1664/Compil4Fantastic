import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ASTDemoLexer lex = new ASTDemoLexer(new ANTLRFileStream("/Users/baudo/Documents/TELECOM Nancy/Projet/Compilation/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ASTDemoParser g = new ASTDemoParser(tokens, 49100, null);
        try {
            g.parse();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}