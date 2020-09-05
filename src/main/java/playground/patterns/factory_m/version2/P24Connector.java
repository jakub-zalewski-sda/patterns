package playground.patterns.factory_m.version2;

public class P24Connector implements PaymentOperatorConnector {

    @Override
    public void createPayment() {
        System.out.println("creating payment in P24");
    }
}
