package playground2.other.patterns.creational.abstract_factory;

public interface PaymentOperatorServicesFactory {
    PaymentOperatorCreator getPaymentOperatorCreator();
    PaymentOperatorFinisher getPaymentOperatorFinisher();
}
