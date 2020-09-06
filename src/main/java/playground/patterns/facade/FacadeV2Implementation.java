package playground.patterns.facade;

public class FacadeV2Implementation implements FacadeV2 {
    private final PaymentOperatorConnector paymentOperatorConnector;
    private final PaymentNotifier paymentNotifier;
    private final BasketRepository basketRepository;

    public FacadeV2Implementation(PaymentOperatorConnector paymentOperatorConnector, PaymentNotifier paymentNotifier, BasketRepository basketRepository) {
        this.paymentOperatorConnector = paymentOperatorConnector;
        this.paymentNotifier = paymentNotifier;
        this.basketRepository = basketRepository;
    }

    @Override
    public void createPayment(String basketId) {

    }

    @Override
    public void notifyAboutPayment(String paymentId) {
        paymentNotifier.notify();
    }
}
