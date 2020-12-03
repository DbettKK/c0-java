package visitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class Asm {
    public static Map<String, Integer> map = new HashMap<>();
    static {
        map.put("nop", 0x00);
        map.put("push", 0x01);
        map.put("pop", 0x02);
        map.put("popn", 0x03);
        map.put("dup", 0x04);
        map.put("loca", 0x0a);
        map.put("arga", 0x0b);
        map.put("globa", 0x0c);
        map.put("load8", 0x10);
        map.put("load16", 0x11);
        map.put("load32", 0x12);
        map.put("load64", 0x13);
        map.put("store8", 0x14);
        map.put("store16", 0x15);
        map.put("store32", 0x16);
        map.put("store64", 0x17);
        map.put("alloc", 0x18);
        map.put("free", 0x19);
        map.put("stackalloc", 0x1a);
        map.put("addi", 0x20);
        map.put("subi", 0x21);
        map.put("muli", 0x22);
        map.put("divi", 0x23);
        map.put("addf", 0x24);
        map.put("subf", 0x25);
        map.put("mulf", 0x26);
        map.put("divf", 0x27);
        map.put("divu", 0x28);
        map.put("shl", 0x29);
        map.put("shr", 0x2a);
        map.put("and", 0x2b);
        map.put("or", 0x2c);
        map.put("xor", 0x2d);
        map.put("not", 0x2e);
        map.put("cmpi", 0x30);
        map.put("cmpu", 0x31);
        map.put("cmpf", 0x32);
        map.put("negi", 0x34);
        map.put("negf", 0x35);
        map.put("itof", 0x36);
        map.put("ftoi", 0x37);
        map.put("shrl", 0x38);
        map.put("setlt", 0x39);
        map.put("setgt", 0x3a);
        map.put("br", 0x41);
        map.put("brfalse", 0x42);
        map.put("brtrue", 0x43);
        map.put("call", 0x48);
        map.put("ret", 0x49);
        map.put("callname", 0x4a);
        map.put("scani", 0x50);
        map.put("scanc", 0x51);
        map.put("scanf", 0x52);
        map.put("printi", 0x54);
        map.put("printc", 0x55);
        map.put("printf", 0x56);
        map.put("prints", 0x57);
        map.put("println", 0x58);
        map.put("panic", 0xfe);
    }
    public static Map<String, Byte> byteMap = new HashMap<>();
    public static byte[] magic = {0x72, 0x30, 0x3b, 0x3e};
    public static byte[] version = {0x00, 0x00, 0x00, 0x01};
    public static byte[] out = new byte[4 * 1024 * 1024];
    public static int cnt = 0;
    public static void init() {
        for (byte b : magic) {
            out[cnt] = b;
            cnt++;
        }
        for (byte b : version) {
            out[cnt] = b;
            cnt++;
        }
        for (String s : map.keySet()) {
            byteMap.put(s, (byte) map.get(s).intValue());
        }
    }

    public void global() {
        int size = YourVisitor.global.size();
        String hexSize = Integer.toHexString(size);

    }

    public static void main(String[] args) throws IOException {
//        FileOutputStream stream = new FileOutputStream(new File("D:/asm.o0"));
//        byte[] bytes = ByteBuffer.allocate(4).putInt(123).array();
//        Asm asm = new Asm();
//        asm.init();
//        stream.write(bytes);
//        stream.close();
        init();

    }

}
