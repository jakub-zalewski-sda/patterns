package creational.abstract_factory;

public class PaymentFlowProcessor {

    private final PaymentServicesFactory paymentServicesFactory;

    public PaymentFlowProcessor(PaymentServicesFactory paymentServicesFactory) {
        this.paymentServicesFactory = paymentServicesFactory;
    }

    public void process() {
        PaymentCreator paymentCreator = paymentServicesFactory.createPaymentCreator();
        paymentCreator.createPayment();

        System.out.println("notify payment created");

        PaymentFinisher paymentFinisher = paymentServicesFactory.createPaymentFinisher();
        paymentFinisher.finishPayment();

        System.out.println("notify payment finished");

    }

}
