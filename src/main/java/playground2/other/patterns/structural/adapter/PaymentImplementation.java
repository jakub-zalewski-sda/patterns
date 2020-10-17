package playground2.other.patterns.structural.adapter;

public class PaymentImplementation implements Payment {

    private Status status;
    private String description;

    public PaymentImplementation(Status status, String description) {
        this.status = status;
        this.description = description;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
