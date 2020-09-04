package creational.abstract_factory;

public class ApplePayPaymentFinisher implements PaymentFinisher {

    @Override
    public void finishPayment() {
        System.out.println("finishing payment in apple pay");
    }
}
