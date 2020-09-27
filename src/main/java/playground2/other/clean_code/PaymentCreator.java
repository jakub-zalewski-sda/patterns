package playground2.other.clean_code;

import java.util.Optional;

public class PaymentCreator {

    private BasketRepository basketRepository;
    //private final PaymentOperatorConnector paymentOperatorConnector;
    private PaymentOperatorConnectorFactory paymentOperatorConnectorProvider;
    private PaymentRepository paymentRepository;


    public Payment create(String basketId, String paymentOperator) {

        int amount = calculateAmount(basketId);

        Payment payment = new Payment(amount);

        paymentRepository.save(payment);

        PaymentOperatorConnector paymentOperatorConnector = getPaymentOperatorConnector(paymentOperator);

        paymentOperatorConnector.send(payment);

        return payment;
    }

    public String getStatus(String paymentId, String paymentOperator) {
        return getPaymentOperatorConnector(paymentOperator).getStatus(paymentId);
    }


    private PaymentOperatorConnector getPaymentOperatorConnector(String paymentOperator) {
        PaymentOperatorConnector paymentOperatorConnector = paymentOperatorConnectorProvider
            .getPaymentOperatorConnector(paymentOperator);
        return paymentOperatorConnector;
    }

    private int calculateAmount(String basketId) {
        Optional<Basket> basket = basketRepository.getBasket(basketId);
        if (!basket.isPresent()) {
            throw new RuntimeException("basket does not exist");
        }

        int amount = basket.get().getAmount();
        return amount;
    }
}
