package miniplc0java;

import antlr.scratchLexer;
import antlr.scratchParser;
import listener.MyErrorListener;
import listener.MyParserListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class Main {
    public static void getData(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String str;
        while ( (str=reader.readLine()) != null) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) throws IOException, RecognitionException {
        File file = new File(args[0]);
        //File file = new File("D:/c.c0");
        InputStream in = new FileInputStream(file);
        //InputStream in = System.in;
        ANTLRInputStream input = new ANTLRInputStream(in);
        scratchLexer lex = new scratchLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        //lex.addErrorListener(new MyErrorListener());
        scratchParser parser = new scratchParser(tokens);
        parser.addErrorListener(new MyErrorListener());
        getData(file);
        scratchParser.ProgramContext tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyParserListener(), tree);
    }
}
