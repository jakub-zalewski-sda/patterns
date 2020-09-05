package playground.patterns.factory_m.version2;

public class Runner {

    public static void main(String[] args) {
        PaymentOperatorConnectorFactory paymentOperatorConnectorFactory = new PaymentOperatorConnectorFactory();
        PaymentCreator paymentCreator = new PaymentCreator(paymentOperatorConnectorFactory);


        String paymentOperator = "P24";
        String basketId = "123";

        //paymentCreator.create(basketId, paymentOperator);

        String paymentOperator2 = "PAYU";
        String basketId2 = "1234";
        paymentCreator.create(basketId2, paymentOperator2);


    }
}
