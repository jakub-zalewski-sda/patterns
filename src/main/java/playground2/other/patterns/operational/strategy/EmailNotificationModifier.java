package playground2.other.patterns.operational.strategy;

public class EmailNotificationModifier implements ConcreteModifier {

    private EmailNotifications emailNotifications;

    public EmailNotificationModifier(EmailNotifications emailNotifications) {
        this.emailNotifications = emailNotifications;
    }

    @Override
    public void modify(UserSettings userSettings) {
        System.out.println("modifying email notifications");
        userSettings.modifyEmailNotifications(emailNotifications);
    }
}
