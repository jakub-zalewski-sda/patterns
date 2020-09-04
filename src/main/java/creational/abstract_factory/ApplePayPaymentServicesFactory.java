package creational.abstract_factory;

public class ApplePayPaymentServicesFactory implements PaymentServicesFactory {

    @Override
    public PaymentCreator createPaymentCreator() {
        return new ApplePayPaymentCreator();
    }

    @Override
    public PaymentFinisher createPaymentFinisher() {
        return new ApplePayPaymentFinisher();
    }
}
