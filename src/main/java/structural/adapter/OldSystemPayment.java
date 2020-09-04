package structural.adapter;

public class OldSystemPayment {

    // 0 - CREATED, 1 - PAID, 2 - CANCELLED
    private int status;

    public OldSystemPayment(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
