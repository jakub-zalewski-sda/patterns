package creational.abstract_factory;

public interface PaymentServicesFactory {
    PaymentCreator createPaymentCreator();
    PaymentFinisher createPaymentFinisher();
}
