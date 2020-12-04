package visitor.asm;

import visitor.function.Function;
import visitor.function.FunctionParam;
import visitor.utils.Type;
import visitor.*;
import visitor.instruction.Instruction;
import visitor.instruction.InstructionQueue;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionDef {
    /// 函数名称在全局变量中的位置
    byte[] nameLocation = new byte[8];
    /// 返回值占据的 slot=8bytes 数
    byte[] returnSlots = new byte[8];
    /// 参数占据的 slot 数
    byte[] paramSlots = new byte[8];
    /// 局部变量占据的 slot 数
    byte[] locSlots = new byte[8];
    /// 函数体
    List<InstructionAsm> instruction;

    byte[] intSize;

    public static void getFunc() {
        //int label = 0;
        List<Function> tmpFuncList = new ArrayList<>();
        List<FunctionDef> tmpList = new ArrayList<>();
        for (String funcName : YourVisitor.funcTable.keySet()){
            tmpFuncList.add(YourVisitor.funcTable.get(funcName));
        }
        Collections.sort(tmpFuncList , (Function b1, Function b2) ->
                b1.getOffset() - b2.getOffset());
        System.out.println(tmpFuncList);


        for (Function function : tmpFuncList) {
            String funcName = function.getFuncName();
            int loc = YourVisitor.global.get(getIndex(funcName)).getOffset();
            System.out.println(funcName + ":" + loc);
            byte[] nameLocation = ByteBuffer.allocate(4).putInt(loc).array();
            byte[] returnSlots;
            if (function.getReturnType() == Type.VOID) {
                returnSlots = new byte[]{0,0,0,0};
            } else {
                returnSlots = new byte[]{0,0,0,1};
            }
            int paramSlot = 0;
            for (FunctionParam param : function.getParamList()) {
                if (param.getType() != Type.VOID) {
                    paramSlot++;
                }
            }
            //if (function.getReturnType() != Type.VOID) paramSlot++;
            byte[] paramSlots =ByteBuffer.allocate(4).putInt(paramSlot).array();
            int locSlot = function.getLocSlot();
            byte[] locSlots = ByteBuffer.allocate(4).putInt(locSlot).array();

            InstructionQueue instructions = function.getInstructions();
            List<InstructionAsm> instructionList = new ArrayList<>();
            System.out.println(funcName);
            int cnt=0;
            while (!instructions.isEmpty()) {
                Instruction poll = instructions.poll();
                System.out.println(cnt++ + ": " + poll);
                String ins = poll.getInstruction().toString().toLowerCase();
                if (poll.getObject() == null) {
                    instructionList.add(new InstructionAsm(Asm.getInitMap().get(ins)));
                } else {
                    if (ins.equals("loca") || ins.equals("globa") || ins.equals("arga") || ins.equals("call")
                            || ins.equals("stackalloc") || ins.equals("br") || ins.equals("brtrue")) {
                        instructionList.add(new InstructionAsm(Asm.getInitMap().get(ins),
                                ByteBuffer.allocate(4).putInt((Integer) poll.getObject()).array()));
                    }
                    else {
                        if (poll.getObject() instanceof Long) {
                            instructionList.add(new InstructionAsm(Asm.getInitMap().get(ins),
                                    ByteBuffer.allocate(8).putLong(0, (long)poll.getObject()).array(), true));
                        } else {
                            instructionList.add(new InstructionAsm(Asm.getInitMap().get(ins),
                                    fourBytesToEight(ByteBuffer.allocate(4).putInt((Integer) poll.getObject()).array()), true));
                        }

                    }
                }
            }
            byte[] insSize = ByteBuffer.allocate(4).putInt(instructionList.size()).array();
            O0.functions.add(new FunctionDef(nameLocation, returnSlots,
                    paramSlots, locSlots, instructionList, insSize));
        }
    }

    public static int getIndex(String funcName) {
        for (int i = 0; i < YourVisitor.global.size(); i++) {
            if (YourVisitor.global.get(i).getName().equals(funcName)) {
                //System.out.println(funcName + ":" + i);
                return i;
            }
        }
        throw new RuntimeException("sss");
    }

    public FunctionDef(byte[] nameLocation, byte[] returnSlots, byte[] paramSlots, byte[] locSlots, List<InstructionAsm> instruction, byte[] insSize) {
        this.nameLocation = nameLocation;
        this.returnSlots = returnSlots;
        this.paramSlots = paramSlots;
        this.locSlots = locSlots;
        this.instruction = instruction;
        this.intSize = insSize;
    }



    public static byte[] fourBytesToEight(byte[] four) {
        byte[] bytes = new byte[8];
        System.arraycopy(four, 0, bytes, 4, 4);
        return bytes;
    }
}
