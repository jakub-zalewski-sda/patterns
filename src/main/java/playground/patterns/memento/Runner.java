package playground.patterns.memento;

import playground.patterns.memento.implementation.PaymentUserSettingsMemento;
import playground.patterns.memento.implementation.PaymentsUserSettings;

public class Runner {

    public static void main(String[] args) {
        PaymentsUserSettings paymentsUserSettings = new PaymentsUserSettings();

        PaymentUserSettingsMemento paymentUserSettingsMemento = paymentsUserSettings.createMemento();
        //kolejne prace na PaymentsUserSettings

        paymentsUserSettings.restoreStateFromMemento(paymentUserSettingsMemento);
    }
}
