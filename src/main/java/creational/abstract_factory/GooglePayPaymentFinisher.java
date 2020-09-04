package creational.abstract_factory;

public class GooglePayPaymentFinisher implements PaymentFinisher {

    @Override
    public void finishPayment() {
        System.out.println("finishing payment in google pay");
    }
}
