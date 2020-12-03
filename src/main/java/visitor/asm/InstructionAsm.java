package visitor.asm;

public class InstructionAsm {
    byte opcode;
    byte[] paramInt;
    byte[] paramDouble;

    public InstructionAsm(byte opcode) {
        this.opcode = opcode;
        this.paramInt = null;
        this.paramDouble = null;
    }

    public InstructionAsm(byte opcode, byte[] paramInt) {
        this.opcode = opcode;
        this.paramInt = paramInt;
        this.paramDouble = null;
    }

    public InstructionAsm(byte opcode, byte[] paramDouble, boolean isDouble) {
        this.opcode = opcode;
        this.paramInt = null;
        this.paramDouble = paramDouble;
    }
}
