package miniplc0java;

import antlr.scratchLexer;
import antlr.scratchParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(args[0]));
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        scratchLexer lex = new scratchLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        scratchParser parser = new scratchParser(tokens);
        try {
            System.out.println(parser.program().toStringTree(parser));
        }
        catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
