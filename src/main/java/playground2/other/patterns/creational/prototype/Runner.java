package playground2.other.patterns.creational.prototype;

public class Runner {
    public static void main(String[] args) {
        InstructionPrototype instructionPrototype = new InstructionPrototype();

        InstructionPrototype prototype2 = instructionPrototype.clone();

    }
}
