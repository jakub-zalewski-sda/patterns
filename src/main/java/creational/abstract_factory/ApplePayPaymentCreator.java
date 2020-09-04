package creational.abstract_factory;

public class ApplePayPaymentCreator implements PaymentCreator {
    @Override
    public void createPayment() {
        System.out.println("creating payment in apple pay");
    }
}
