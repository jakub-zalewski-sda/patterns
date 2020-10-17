package playground2.other.patterns.structural.adapter;

public class OldSystemPaymentAdapter implements Payment {

    private OldSystemPayment oldSystemPayment;

    public OldSystemPaymentAdapter(OldSystemPayment oldSystemPayment) {
        this.oldSystemPayment = oldSystemPayment;
    }

    @Override
    public Status getStatus() {
        switch (oldSystemPayment.getStatus()) {
            case 1:
                return Status.CREATED;
            case 2:
                return Status.PAID;
            case 3:
                return Status.CANCELLED;
            case 4:
                return Status.ERROR;
            default:
                return Status.UNKNOWN;
        }
    }

    @Override
    public String getDescription() {
        return "to jest stara płatność, nie ma opisu";
    }
}
