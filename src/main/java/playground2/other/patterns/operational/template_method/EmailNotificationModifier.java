package playground2.other.patterns.operational.template_method;

public class EmailNotificationModifier extends UserSettingsModifier {

    private EmailNotifications emailNotifications;

    public EmailNotificationModifier(EmailNotifications emailNotifications) {
        this.emailNotifications = emailNotifications;
    }

    @Override
    protected void modify(UserSettings userSettings) {
        System.out.println("modifying email notifications");
        userSettings.modifyEmailNotifications(emailNotifications);
    }
}
