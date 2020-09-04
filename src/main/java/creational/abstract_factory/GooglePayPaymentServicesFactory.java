package creational.abstract_factory;

public class GooglePayPaymentServicesFactory implements PaymentServicesFactory {

    @Override
    public PaymentCreator createPaymentCreator() {
        return new GooglePayPaymentCreator();
    }

    @Override
    public PaymentFinisher createPaymentFinisher() {
        return new GooglePayPaymentFinisher();
    }
}
