package visitor.asm;

import visitor.Global;
import visitor.GlobalType;
import visitor.YourVisitor;

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
                byte[] item = {0,0,0,0,0,0,0,0};
                int len = global.getName().getBytes().length;
                System.arraycopy(global.getName().getBytes(), 0, item, 8 - len, len);
                globalDef.value = new Array(
                        new byte[]{0, 0, 0, 1}, item
                );
            } else if (global.getType() == GlobalType.STRING) {
                globalDef.isConst = 0x01;
                byte[] item = {0,0,0,0,0,0,0,0};
                int len = global.getName().getBytes().length;
                System.arraycopy(global.getName().getBytes(), 0, item, 8 - len, len);
                globalDef.value = new Array(
                        new byte[]{0, 0, 0, 1}, item
                );
            }
            O0.globals.add(globalDef);

        }
    }
}
