package structural.facade;

public class PaymentFactory {
    public Payment createPayment(String basketId) {
        System.out.println("creating payment");
        return new Payment("1234");
    }
}
