package playground.patterns.template_method;

public class PayoutModifier extends UserSettingsModifier {
    @Override
    protected void doModifications(UserSettings userSettings) {
        userSettings.modifyPayoutSettings();
    }
}
