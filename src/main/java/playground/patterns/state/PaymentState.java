package playground.patterns.state;

public interface PaymentState {
    void takeContribution(Contribution contribution);
    void cancelPayment();
}
