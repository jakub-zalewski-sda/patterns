package operational.interpreter;

public enum MathOperation {
    ADD, SUBTRACT;

    public static MathOperation from(String symbol) {
        switch (symbol) {
            case "+":
                return ADD;
            case "-":
                return SUBTRACT;
            default:
                throw new IllegalArgumentException();
        }
    }
}
