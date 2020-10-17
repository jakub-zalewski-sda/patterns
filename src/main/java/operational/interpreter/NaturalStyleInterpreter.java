package operational.interpreter;

public class NaturalStyleInterpreter implements Interpreter {

    private final Calculator calculator;

    public NaturalStyleInterpreter(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double interpret(Object contextParameter) {

        String context = (String)contextParameter;

        String[] args = context.split(" ");

        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[2]);
        MathOperation mathOperation = MathOperation.from(args[1]);

        return calculator.apply(mathOperation, first, second);
    }
}
