package visitor.instruction;

import java.io.Serializable;

/**
 * 指令实体类
 */
public class Instruction implements Serializable {
    InstructionEnum instruction;
    Object object;

    public Instruction(InstructionEnum instruction, Object object) {
        this.instruction = instruction;
        this.object = object;
    }

    public InstructionEnum getInstruction() {
        return instruction;
    }

    public void setInstruction(InstructionEnum instruction) {
        this.instruction = instruction;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "instruction=" + instruction +
                ", object=" + object +
                '}';
    }
}
