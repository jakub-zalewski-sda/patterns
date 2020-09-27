package playground2.other.patterns.creational.prototype;

public class InstructionPrototype implements Cloneable {
    private String baseInstruction;
    private Address address;

    @Override
    protected InstructionPrototype clone() {
        try {
            return (InstructionPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }
}
