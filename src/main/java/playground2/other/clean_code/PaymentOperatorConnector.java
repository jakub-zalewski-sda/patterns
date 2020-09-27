package playground2.other.clean_code;

public interface PaymentOperatorConnector {
    void send(Payment payment);
    String getStatus(String paymentId);
}
