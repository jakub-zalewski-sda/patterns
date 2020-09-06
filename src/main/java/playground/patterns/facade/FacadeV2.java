package playground.patterns.facade;

public interface FacadeV2 {
    void createPayment(String basketId);
    void notifyAboutPayment(String paymentId);
}
