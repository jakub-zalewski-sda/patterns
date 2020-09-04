package operational.interpreter;

public class NaturalStyleInterpreter implements Interpreter {

    private final MathOperationApplier mathOperationApplier;

    public NaturalStyleInterpreter(MathOperationApplier mathOperationApplier) {
        this.mathOperationApplier = mathOperationApplier;
    }

    @Override
    public double interpret(String context) {

        String[] args = context.split(" ");

        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[2]);
        MathOperation mathOperation = MathOperation.from(args[1]);

        return mathOperationApplier.apply(mathOperation, first, second);
    }
}
