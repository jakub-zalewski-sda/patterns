package playground.decorator;

public class PaymentRefundFetcher implements PaymentInfoFetcher {

    private final PaymentInfoFetcher paymentInfoFetcher;

    public PaymentRefundFetcher(PaymentInfoFetcher paymentInfoFetcher) {
        this.paymentInfoFetcher = paymentInfoFetcher;
    }

    @Override
    public PaymentInfo getPaymentInfo() {
        PaymentInfo paymentInfo = paymentInfoFetcher.getPaymentInfo();
        System.out.println("getting payment refunds");


        return paymentInfo;
    }
}
