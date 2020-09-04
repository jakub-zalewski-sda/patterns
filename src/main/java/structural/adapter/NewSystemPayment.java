package structural.adapter;

public class NewSystemPayment implements Payment {

    private Status status;

    public NewSystemPayment(Status status) {
        this.status = status;
    }

    @Override
    public Status getStatus() {
        return status;
    }
}
