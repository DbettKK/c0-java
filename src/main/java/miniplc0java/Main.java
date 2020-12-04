package miniplc0java;

import antlr.scratchLexer;
import antlr.scratchParser;
import c0.C0Lexer;
import c0.C0Parser;
import listener.MyErrorListener;
import listener.MyParserListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import visitor.InstructionQueue;
import visitor.MyVisitor;
import visitor.YourVisitor;
import visitor.asm.O0;

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
        //File file = new File(args[0]);
        FileOutputStream stream = new FileOutputStream(new File("D:\\大学\\大三上\\编译\\git仓库\\c0-java\\compile\\asm.o0"));
        File file = new File("D:\\大学\\大三上\\编译\\git仓库\\c0-java\\compile\\c.c0");
        InputStream in = new FileInputStream(file);
        //InputStream in = System.in;
        ANTLRInputStream input = new ANTLRInputStream(in);
        C0Lexer lex = new C0Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        //lex.addErrorListener(new MyErrorListener());
        C0Parser parser = new C0Parser(tokens);
        parser.addErrorListener(new MyErrorListener());
        //getData(file);
        C0Parser.ProgramContext tree = parser.program();
        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk(new MyParserListener(), tree);
        YourVisitor visitor = new YourVisitor();
        visitor.visit(tree);
        byte[] out = O0.init();
        stream.write(out);
        stream.close();
        /*for (String s : YourVisitor.funcTable.keySet()) {
            System.out.println("FUNC: " + s);
            System.out.println(YourVisitor.funcTable.get(s).getLocSlot());
            InstructionQueue instructions = YourVisitor.funcTable.get(s).getInstructions();
            int cnt = 0;
            while (!instructions.isEmpty()) {
                System.out.println(cnt++ + ": " +instructions.poll());
            }
            System.out.println("----------------------------");
        }*/
    }
}
