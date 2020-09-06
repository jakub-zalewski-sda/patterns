package playground.patterns.strategy;

public class PayoutModifier implements ConcreteElementUserSettingsModifier {
    @Override
    public void doModifications(UserSettings userSettings) {
        userSettings.modifyPayoutSettings();
    }
}
