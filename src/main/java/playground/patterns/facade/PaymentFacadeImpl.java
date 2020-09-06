package playground.patterns.facade;

public class PaymentFacadeImpl implements PaymentFacade {

    private final BasketRepository basketRepository;
    private final PaymentNotifier paymentNotifier;
    private final PaymentOperatorConnector paymentOperatorConnector;
    private final PaymentCreator paymentCreator;

    public PaymentFacadeImpl(BasketRepository basketRepository, PaymentNotifier paymentNotifier, PaymentOperatorConnector paymentOperatorConnector, PaymentCreator paymentCreator) {
        this.basketRepository = basketRepository;
        this.paymentNotifier = paymentNotifier;
        this.paymentOperatorConnector = paymentOperatorConnector;
        this.paymentCreator = paymentCreator;
    }

    @Override
    public void createPayment(String basketId) {
        //basket repository
        //payment notifier
        //payment operator connector

        //payment craetor
    }
}
