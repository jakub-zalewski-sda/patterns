package playground2.other.patterns.structural.adapter;

public interface PaymentRepository {
    Payment findPayment(String paymentId);
}
