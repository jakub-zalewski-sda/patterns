package creational.static_factory_method;

public class EmailNotifications {

    private final Boolean paymentFinished;
    private final Boolean paymentRejected;
    private final Boolean paymentNotFinished;
    private final Boolean paymentStarted;

    private EmailNotifications(Boolean paymentFinished, Boolean paymentRejected, Boolean paymentNotFinished, Boolean paymentStarted) {
        this.paymentFinished = paymentFinished;
        this.paymentRejected = paymentRejected;
        this.paymentNotFinished = paymentNotFinished;
        this.paymentStarted = paymentStarted;
    }

    public static EmailNotifications defaultNotifications() {
        return new EmailNotifications(true, true, true, false);
    }

    public static EmailNotifications emptyNotifications() {
        return new EmailNotifications(null, null, null, null);
    }

    public Boolean paymentFinished() {
        return paymentFinished;
    }

    public Boolean paymentRejected() {
        return paymentRejected;
    }

    public Boolean paymentNotFinished() {
        return paymentNotFinished;
    }

    public Boolean paymentStarted() {
        return paymentStarted;
    }
}
