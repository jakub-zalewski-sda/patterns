package playground2.other.patterns.structural.adapter;

public class OldSystemPayment {

    //1 - CREATED, 2 - PAID, 3 - CANCELLED, 4 - ERROR
    private int status;

    public OldSystemPayment(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
