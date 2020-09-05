package playground.patterns.factory_m.version2;

public class PaymentOperatorConnectorFactory {

    public PaymentOperatorConnector create(String paymentOperator) {

        if (paymentOperator.equals("P24")) {
            return new P24Connector();
        } else if (paymentOperator.equals("PAYU")) {
            return new PayuConnector();
        }

        throw new IllegalArgumentException();
    }
}
