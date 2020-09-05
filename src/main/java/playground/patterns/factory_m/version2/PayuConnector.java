package playground.patterns.factory_m.version2;

public class PayuConnector implements PaymentOperatorConnector {
    @Override
    public void createPayment() {
        System.out.println("creating payment in PAYU");
    }
}
