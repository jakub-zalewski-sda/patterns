package playground.patterns.state;

public class PaymentCreated implements PaymentState {

    private final Payment payment;

    public PaymentCreated(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void takeContribution(Contribution contribution) {
        ///super // jakies sprawdzanie czy kasa się zgadza
        payment.setState(new PaymentPaid());
    }

    @Override
    public void cancelPayment() {
        //ok
        payment.setState(new PaymentCancelled());
    }
}
