package playground2.other.patterns.creational.abstract_factory;

public class P24PaymentOperatorServicesFactory implements PaymentOperatorServicesFactory {

    @Override
    public PaymentOperatorCreator getPaymentOperatorCreator() {
        return new P24PaymentOperatorCreator();
    }

    @Override
    public PaymentOperatorFinisher getPaymentOperatorFinisher() {
        return new P24PaymentOperatorFinisher();
    }
}
