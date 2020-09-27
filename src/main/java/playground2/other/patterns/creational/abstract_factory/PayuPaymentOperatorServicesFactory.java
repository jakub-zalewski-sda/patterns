package playground2.other.patterns.creational.abstract_factory;

public class PayuPaymentOperatorServicesFactory implements PaymentOperatorServicesFactory {
    @Override
    public PaymentOperatorCreator getPaymentOperatorCreator() {
        return new PayuPaymentOperatorCreator();
    }

    @Override
    public PaymentOperatorFinisher getPaymentOperatorFinisher() {
        return new PayuPaymentOperatorFinisher();
    }
}
