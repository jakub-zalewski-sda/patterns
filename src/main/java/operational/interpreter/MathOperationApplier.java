package operational.interpreter;

public class MathOperationApplier {
    public double apply(MathOperation mathOperation, double first, double second) {
        switch (mathOperation) {
            case ADD:
                return first + second;
            case SUBTRACT:
                return first - second;
            default:
                throw new IllegalArgumentException();
        }
    }
}
