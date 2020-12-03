package visitor;

import java.io.Serializable;

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
