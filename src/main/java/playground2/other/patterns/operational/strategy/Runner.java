package playground2.other.patterns.operational.strategy;


public class Runner {

    public static void main(String[] args) {

//        EmailNotifications emailNotifications = new EmailNotifications();
//
//        EmailNotificationModifier emailNotificationsModifier = new EmailNotificationModifier(emailNotifications);
//
//        emailNotificationsModifier.modify("123");

        UserSettingsModifier userSettingsModifier = new UserSettingsModifier(new PayoutFrequencyModifier());

        userSettingsModifier.modify("123");
        System.out.println("---");
        UserSettingsModifier userSettingsModifier2 = new UserSettingsModifier(
            new EmailNotificationModifier(new EmailNotifications())
        );

        userSettingsModifier2.modify("123");

    }
}
