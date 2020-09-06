package playground.patterns.state;

public class Payment {

    private PaymentState state;

    public Payment() {
        this.state = new PaymentCreated(this);
    }

    protected void setState(PaymentState state) {
        this.state = state;
    }

    public void takeContribution(Contribution contribution) {
        state.takeContribution(contribution);
    }

    public void cancelPayment() {
        state.cancelPayment();
    }
}
