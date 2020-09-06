package playground.patterns.state;

public class PaymentCancelled implements PaymentState {

    @Override
    public void takeContribution(Contribution contribution) {
        throw new IllegalStateException("cannot take contribution - payment cancelled");
    }

    @Override
    public void cancelPayment() {
        //ok
    }
}
