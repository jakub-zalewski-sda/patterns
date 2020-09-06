package playground.patterns.adapter;

public class OldSystemPayment {
    //1 - CREATED, 2 - PAID, 3 - CANCELLED
    private int status;

    public OldSystemPayment(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
