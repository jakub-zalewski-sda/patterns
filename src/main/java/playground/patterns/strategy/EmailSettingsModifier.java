package playground.patterns.strategy;

public class EmailSettingsModifier implements ConcreteElementUserSettingsModifier {

    @Override
    public void doModifications(UserSettings userSettings) {
        userSettings.modifyEmailSettings();
    }
}
