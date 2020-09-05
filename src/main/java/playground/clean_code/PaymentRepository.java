package playground.clean_code;

public interface PaymentRepository {
    Payment findPayment(String paymentId);
}
