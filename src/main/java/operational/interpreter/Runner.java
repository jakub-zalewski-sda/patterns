package operational.interpreter;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Interpreter interpreter = new NaturalStyleInterpreter(calculator);

        System.out.println(interpreter.interpret("5 - 2"));

        ApiRequestInterpreter apiRequestInterpreter = new ApiRequestInterpreter(calculator);

        System.out.println(apiRequestInterpreter.interpret(new Request(MathOperation.SUBTRACT, 5, 2)));
    }
}
