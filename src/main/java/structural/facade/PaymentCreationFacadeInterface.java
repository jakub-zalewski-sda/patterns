package structural.facade;

public interface PaymentCreationFacadeInterface {
    void createPayment(String basketId);
    void createPayment(int amount);
}
