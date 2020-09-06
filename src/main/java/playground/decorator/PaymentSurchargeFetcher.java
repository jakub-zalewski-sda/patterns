package playground.decorator;

public class PaymentSurchargeFetcher implements PaymentInfoFetcher {

    private final PaymentInfoFetcher paymentInfoFetcher;

    public PaymentSurchargeFetcher(PaymentInfoFetcher paymentInfoFetcher) {
        this.paymentInfoFetcher = paymentInfoFetcher;
    }

    @Override
    public PaymentInfo getPaymentInfo() {
        PaymentInfo paymentInfo = paymentInfoFetcher.getPaymentInfo();
        System.out.println("getting payment surcharges");


        return paymentInfo;
    }
}
