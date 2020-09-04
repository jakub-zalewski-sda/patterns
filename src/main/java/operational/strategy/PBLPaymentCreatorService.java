package operational.strategy;

public class PBLPaymentCreatorService {

    private  PaymentOperatorStrategy paymentOperatorStrategy;

    public void setPaymentOperatorStrategy(PaymentOperatorStrategy paymentOperatorStrategy) {
        this.paymentOperatorStrategy = paymentOperatorStrategy;
    }

    public void createPayment() {
        System.out.println("calculating basket");
        System.out.println("creating payment object");

        paymentOperatorStrategy.createPayment();

        System.out.println("updating payment");
        System.out.println("notifying about payment creation");

        System.out.println("returning link to payment");
    }

}
