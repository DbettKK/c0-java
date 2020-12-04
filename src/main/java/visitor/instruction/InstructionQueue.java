package visitor.instruction;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

/**
 * 存放指令的Queue
 * 加了index方便操作
 * 实现了Deque的相关方法
 */
public class InstructionQueue implements Serializable {
    private Deque<Instruction> instructions;
    private int index = 0;

    public void add(Instruction instruction) {
        instructions.add(instruction);
        index++;
    }

    public Instruction poll() {
        index--;
        return instructions.poll();
    }

    public Instruction pollLast() {
        index--;
        return instructions.pollLast();
    }
    public Instruction peekLast() {
        return instructions.peekLast();
    }
    public boolean isEmpty() {
        return instructions.isEmpty();
    }

    public void change(int index, Instruction instruction) {
        if (index <= this.size()) {
            Stack<Instruction> tmp = new Stack<>();
            while (true) {
                int size = this.size();
                if (size == index) {
                    this.pollLast();
                    this.add(instruction);
                    break;
                } else {
                    tmp.add(this.pollLast());
                }
            }
            while (!tmp.isEmpty()) {
                this.add(tmp.pop());
            }
        }
    }
    public int size() {
        return instructions.size();
    }
    public InstructionQueue(Deque<Instruction> instructions, int index) {
        this.instructions = instructions;
        this.index = index;
    }
    public InstructionQueue() {
        this.instructions = new ArrayDeque<>();
        this.index = 0;
    }

    public Queue<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(Deque<Instruction> instructions) {
        this.instructions = instructions;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "InstructionQueue{" +
                "instructions=" + instructions +
                ", index=" + index +
                '}';
    }
}
