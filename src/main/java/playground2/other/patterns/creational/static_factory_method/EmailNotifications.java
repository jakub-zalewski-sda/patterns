package playground2.other.patterns.creational.static_factory_method;

public class EmailNotifications {
    private boolean incomingPayment;
    private boolean payout;
    private boolean monthlyReport;
    private boolean refund;

    private EmailNotifications(boolean incomingPayment, boolean payout, boolean monthlyReport, boolean refund) {
        this.incomingPayment = incomingPayment;
        this.payout = payout;
        this.monthlyReport = monthlyReport;
        this.refund = refund;
    }

    public static EmailNotifications defaultNotifications() {
        return new EmailNotifications(true, false, false, true);
    }

    public static EmailNotifications emptyNotifications() {
        return new EmailNotifications(false, false, false, false);
    }

    public static EmailNotifications allNotifications() {
        return new EmailNotifications(true, true, true, true);
    }
}


