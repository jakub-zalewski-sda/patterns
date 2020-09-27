package playground2.other.clean_code;

public class GooglePayConnector implements PaymentOperatorConnector {

    @Override
    public void send(Payment payment) {

    }

    @Override
    public String getStatus(String paymentId) {
        throw new RuntimeException("method not allowed");
    }
}
