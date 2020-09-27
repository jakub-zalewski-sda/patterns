package playground2.other.encapsulation;

public class Payment {

    enum Status {CREATED, IN_PROGRESS, PAID, UNDERPAID, OVERPAID }

    private Status status;

    private int amount;

    public Payment(int amount) {
        this.status = Status.CREATED;
        this.amount = amount;
    }

    public boolean isPaid() {
        return Status.PAID == status || Status.OVERPAID == status;
    }

    public void takeContribution(Contribution contribution) {
        if(contribution.getAmount() == amount) {
            this.status = Status.PAID;
        }
    }
}
