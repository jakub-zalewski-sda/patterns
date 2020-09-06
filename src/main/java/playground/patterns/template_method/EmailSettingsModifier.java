package playground.patterns.template_method;

public class EmailSettingsModifier extends UserSettingsModifier {
    @Override
    protected void doModifications(UserSettings userSettings) {
        userSettings.modifyEmailSettings();
    }
}
