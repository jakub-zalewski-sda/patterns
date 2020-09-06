package playground.patterns.state;

public class PaymentPaid implements PaymentState {

    @Override
    public void takeContribution(Contribution contribution) {
        throw new IllegalStateException("contribution already taken");
    }

    @Override
    public void cancelPayment() {
        throw new IllegalStateException("cannot cancel paid payment");
    }
}
