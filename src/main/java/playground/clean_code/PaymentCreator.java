package playground.clean_code;

public class PaymentCreator {

    private BasketRepository basketRepository;

//    private PayuConnector payuConnector;
//
//    private P24Connector p24Connector;
//
//    private PayPalConnector payPalConnector;

    private PaymentRepository paymentRepository;

    private PaymentOperatorConnector paymentOperatorConnector;

    public PaymentCreator(BasketRepository basketRepository,
                          PaymentRepository paymentRepository,
                          PaymentOperatorConnector paymentOperatorConnector) {
        this.basketRepository = basketRepository;
        this.paymentRepository = paymentRepository;
        this.paymentOperatorConnector = paymentOperatorConnector;
    }

    public void createPayment(String basketId) {

        paymentOperatorConnector.createPayment();

        //

        String d;
        Basket basket = getBasket(basketId);
        //stworz payment u operatora
        //wyslij powiadomienia
        //zwroc link do zaplaty

    }

    private Basket getBasket(String basketId) {
        Basket basket = basketRepository.getBasket(basketId);
        if (basket == null) {
            throw new RuntimeException("no basket");
        }
        return basket;
    }
}
