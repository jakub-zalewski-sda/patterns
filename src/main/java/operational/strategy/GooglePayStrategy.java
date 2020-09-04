package operational.strategy;

public class GooglePayStrategy implements PaymentOperatorStrategy {

    @Override
    public void createPayment() {
        System.out.println("creating payment in google pay");
    }
}
