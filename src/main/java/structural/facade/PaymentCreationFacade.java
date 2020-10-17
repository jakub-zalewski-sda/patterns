package structural.facade;

class PaymentCreationFacade {

    private final PaymentFactory paymentFactory;
    private final PaymentOperatorPaymentCreator paymentOperatorPaymentCreator;
    private final PaymentNotifier paymentNotifier;
    private final OldSystemPaymentRepository oldSystemRepository;

    public PaymentCreationFacade(
        PaymentFactory paymentFactory,
        PaymentOperatorPaymentCreator paymentOperatorPaymentCreator,
        PaymentNotifier paymentNotifier,
        OldSystemPaymentRepository oldSystemRepository
    ) {
        this.paymentFactory = paymentFactory;
        this.paymentOperatorPaymentCreator = paymentOperatorPaymentCreator;
        this.paymentNotifier = paymentNotifier;
        this.oldSystemRepository = oldSystemRepository;
    }

    public Payment createPayment(String basketId) {
        Payment payment = paymentFactory.createPayment(basketId);
        paymentOperatorPaymentCreator.create(payment);
        paymentNotifier.notifyPaymentCreated(payment);
        oldSystemRepository.save(payment);

        return payment;
    }

    public Payment createPayment(int price) {
        Payment payment = new Payment("12");
        paymentOperatorPaymentCreator.create(payment);
        paymentNotifier.notifyPaymentCreated(payment);
        oldSystemRepository.save(payment);

        return payment;
    }
}
