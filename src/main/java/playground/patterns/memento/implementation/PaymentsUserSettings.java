package playground.patterns.memento.implementation;

public class PaymentsUserSettings {

    private PayoutData payoutData;
    private NotificationsData notificationsData;

    public PaymentUserSettingsMemento createMemento() {
       return new PaymentUserSettingsMemento(this);
    }

    PayoutData getPayoutData() {
        return payoutData;
    }

    NotificationsData getNotificationsData() {
        return notificationsData;
    }

    public void restoreStateFromMemento(PaymentUserSettingsMemento paymentUserSettingsMemento) {

    }
}
