package operational.interpreter;

public class Request {
    private MathOperation mathOperation;
    private double first;
    private double second;

    public Request(MathOperation mathOperation, double first, double second) {
        this.mathOperation = mathOperation;
        this.first = first;
        this.second = second;
    }

    public MathOperation getMathOperation() {
        return mathOperation;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }
}
