package structural.adapter;

public class OldSystemPaymentAdapter implements Payment {

    private final OldSystemPayment oldSystemPayment;

    public OldSystemPaymentAdapter(OldSystemPayment oldSystemPayment) {
        this.oldSystemPayment = oldSystemPayment;
    }

    @Override
    public Status getStatus() {
        switch (oldSystemPayment.getStatus()) {
            case 0:
                return Status.CREATED;
            case 1:
                return Status.PAID;
            case 2:
                return Status.CANCELLED;
            default:
                throw new IllegalArgumentException("unknown status");
        }
    }
}
