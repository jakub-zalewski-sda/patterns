package playground2.other.clean_code;

public class PaymentOperatorConnectorFactory {

    private String payuUrl;
    private String p24Url;

    PaymentOperatorConnector getPaymentOperatorConnector(String paymentOperator) {

        if (paymentOperator.equals("PAYU")) {
            return new PayuConnector();
        } else if (paymentOperator.equals("P24")) {
            return new P24Connector();
        } else if (paymentOperator.equals("GooglePay")) {
            return new GooglePayConnector();
        }

        return null;
    }
}
