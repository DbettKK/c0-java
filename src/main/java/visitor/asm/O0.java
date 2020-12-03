package visitor.asm;

import visitor.Asm;
import visitor.Global;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class O0 {
    /// 魔数
    static byte[] magic = {0x72, 0x30, 0x3b, 0x3e};
    /// 版本号，定为 1
    static byte[] version = {0, 0, 0, 1};
    /// 全局变量表
    static List<GlobalDef> globals = new ArrayList<>();
    /// 函数列表
    static List<FunctionDef> functions = new ArrayList<>();

    static byte[] out = new byte[4 * 1024 * 1024];
    static int cnt = 0;

    public static byte[] init() {
        Asm.init();
        GlobalDef.getGlobal();
        FunctionDef.getFunc();
        System.arraycopy(magic, 0, out, 0, 4);
        System.arraycopy(version, 0, out, 4, 4);
        cnt = 8;
        System.arraycopy(ByteBuffer.allocate(4).putInt(globals.size()).array(), 0, out, cnt, 4);
        cnt += 4;
        for (GlobalDef global : globals) {
            out[cnt] = global.isConst;
            cnt++;
            System.arraycopy(global.value.count, 0, out, cnt, 4);
            cnt += 4;
            if (global.value.items.length <= 8) {
                System.arraycopy(global.value.items, 0, out, cnt, 8);
                cnt += 8;
            } else {
                System.arraycopy(global.value.items, 0, out, cnt, global.value.items.length);
                cnt += global.value.items.length;
            }

        }
        System.arraycopy(ByteBuffer.allocate(4).putInt(functions.size()).array(), 0, out, cnt, 4);
        cnt += 4;
        for (FunctionDef func : functions) {
            System.arraycopy(func.nameLocation, 0, out, cnt, 4);
            cnt+=4;
            System.arraycopy(func.returnSlots, 0, out, cnt, 4);
            cnt+=4;
            System.arraycopy(func.paramSlots, 0, out, cnt, 4);
            cnt+=4;
            System.arraycopy(func.locSlots, 0, out, cnt, 4);
            cnt+=4;
            System.arraycopy(ByteBuffer.allocate(4).putInt(func.instruction.size()).array(), 0, out, cnt, 4);
            cnt+=4;
            for (InstructionAsm ins : func.instruction) {
                out[cnt] = ins.opcode;
                cnt++;
                if (ins.paramInt != null && ins.paramDouble == null) {
                    System.arraycopy(ins.paramInt,0, out, cnt, 4);
                    cnt+=4;
                } else if (ins.paramInt == null && ins.paramDouble != null) {
                    System.arraycopy(ins.paramDouble,0, out, cnt, 8);
                    cnt+=8;
                }
            }
        }
        return out;
    }

}
