package operational.template_method;

public class EmailNotificationsModifier extends UserSettingsModifier {
    public EmailNotificationsModifier(UserSettingsRepository userSettingsRepository) {
        super(userSettingsRepository);
    }

    @Override
    protected void modify(UserSettings userSettings) {
        userSettings.modifyEmailNotifications();
    }
}
