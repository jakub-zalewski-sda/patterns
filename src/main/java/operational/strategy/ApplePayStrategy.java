package operational.strategy;

public class ApplePayStrategy implements PaymentOperatorStrategy {
    @Override
    public void createPayment() {
        System.out.println("creating payment in apple pay");
    }
}
