package creational.abstract_factory;

public class PaymentFlowProcessorRunner {

    public static void main(String[] args) {
        PaymentFlowProcessor paymentFlowProcessor = new PaymentFlowProcessor(new GooglePayPaymentServicesFactory());
        paymentFlowProcessor.process();
    }
}
