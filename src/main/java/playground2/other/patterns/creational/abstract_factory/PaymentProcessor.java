package playground2.other.patterns.creational.abstract_factory;

public class PaymentProcessor {

    private PaymentOperatorServicesFactory paymentOperatorServicesFactory;

    public PaymentProcessor(PaymentOperatorServicesFactory paymentOperatorServicesFactory) {
        this.paymentOperatorServicesFactory = paymentOperatorServicesFactory;
    }

    public void create() {
        PaymentOperatorCreator paymentOperatorCreator = paymentOperatorServicesFactory.getPaymentOperatorCreator();
        //create payment
        //notify users
        //save payment
    }

    public void finish() {
        PaymentOperatorFinisher paymentOperatorFinisher = paymentOperatorServicesFactory.getPaymentOperatorFinisher();

        //check if ok

        paymentOperatorFinisher.confirm();

        //ifNot

        paymentOperatorFinisher.cancel();
    }
}
