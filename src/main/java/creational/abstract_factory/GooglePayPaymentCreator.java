package creational.abstract_factory;

public class GooglePayPaymentCreator implements PaymentCreator {
    @Override
    public void createPayment() {
        System.out.println("creating payment in google pay");
    }
}
