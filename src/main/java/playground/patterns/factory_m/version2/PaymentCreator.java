package playground.patterns.factory_m.version2;


public class PaymentCreator {

    private final PaymentOperatorConnectorFactory paymentOperatorConnectorFactory;

    public PaymentCreator(PaymentOperatorConnectorFactory paymentOperatorConnectorFactory) {
        this.paymentOperatorConnectorFactory = paymentOperatorConnectorFactory;
    }

    public void create(String basketId, String paymentOperator) {
        System.out.println("get basket");
        System.out.println("create payment in our system");

        PaymentOperatorConnector paymentOperatorConnector = createPaymentOperatorConnector(paymentOperator);
        paymentOperatorConnector.createPayment();
        System.out.println("persist payment");
        System.out.println("notify seller");
        System.out.println("notify buyer");
    }

    protected PaymentOperatorConnector createPaymentOperatorConnector(String paymentOperator) {
        return paymentOperatorConnectorFactory.create(paymentOperator);
    }
}
