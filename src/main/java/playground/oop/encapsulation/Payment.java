package playground.oop.encapsulation;

public class Payment {
    private String id;
    private int amount;
    private int paidAmount;
    private String status;

    public void takeContribution(Contribution contribution) {
        if(contribution.getAmount() == paidAmount) {
            this.status = "PAID";
        }
    }

}
