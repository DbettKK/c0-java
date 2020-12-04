package visitor.asm;

import visitor.Global;
import visitor.GlobalType;
import visitor.YourVisitor;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class GlobalDef {
    byte isConst;
    Array value;

    public static void getGlobal() {
        for (Global global : YourVisitor.global) {
            GlobalDef globalDef = new GlobalDef();
            if (global.getType() == GlobalType.VAR) {
                globalDef.isConst = 0x00;
                globalDef.value = new Array(
                        new byte[]{0, 0, 0, 8},
                        new byte[]{0, 0, 0, 0, 0, 0, 0, 0}
                );
            } else if (global.getType() == GlobalType.CONST) {
                globalDef.isConst = 0x01;
                globalDef.value = new Array(
                        new byte[]{0, 0, 0, 8},
                        new byte[]{0, 0, 0, 0, 0, 0, 0, 0}
                );
            } else if (global.getType() == GlobalType.FUNCTION) {
                globalDef.isConst = 0x00;

                int len = global.getName().getBytes().length;
                byte[] item = global.getName().getBytes();
                globalDef.value = new Array(
                        ByteBuffer.allocate(4).putInt(len).array(), item
                );
            } else if (global.getType() == GlobalType.STRING) {
                globalDef.isConst = 0x01;
                int len = global.getName().getBytes().length-2;
                byte[] item = global.getName().substring(1, global.getName().length()-1).getBytes();
                globalDef.value = new Array(
                        ByteBuffer.allocate(4).putInt(len).array(), item
                );
            }
            O0.globals.add(globalDef);

        }
    }
}
