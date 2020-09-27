package playground2.other.patterns.creational.abstract_factory;

public class Runner {
    public static void main(String[] args) {

        PaymentProcessor p24paymentProcessor = new PaymentProcessor(new P24PaymentOperatorServicesFactory());

        PaymentProcessor payPaymentProcessor = new PaymentProcessor(new PayuPaymentOperatorServicesFactory());
    }
}
