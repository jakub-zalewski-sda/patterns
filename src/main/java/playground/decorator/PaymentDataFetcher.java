package playground.decorator;

public class PaymentDataFetcher implements PaymentInfoFetcher {

    @Override
    public PaymentInfo getPaymentInfo() {
        System.out.println("getting payment info");
        return null;
    }
}
