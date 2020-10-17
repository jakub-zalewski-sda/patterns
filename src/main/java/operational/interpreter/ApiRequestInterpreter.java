package operational.interpreter;

public class ApiRequestInterpreter {

    private final Calculator calculator;

    public ApiRequestInterpreter(Calculator calculator) {
        this.calculator = calculator;
    }

    public double interpret(Request request) {
        return calculator.apply(request.getMathOperation(), request.getFirst(), request.getSecond());
    }
}
