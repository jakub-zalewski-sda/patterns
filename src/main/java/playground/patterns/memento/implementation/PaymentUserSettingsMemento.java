package playground.patterns.memento.implementation;

public class PaymentUserSettingsMemento {
    private final PaymentsUserSettings paymentsUserSettings;

    public PaymentUserSettingsMemento(PaymentsUserSettings paymentsUserSettings) {
        this.paymentsUserSettings = paymentsUserSettings;
    }

    public String getAddress(String paymentOperator) {
        return paymentsUserSettings.getPayoutData().getAddress(paymentOperator);
    }
}
