package playground2.other.patterns.operational.template_method;


public class Runner {

    public static void main(String[] args) {

//        EmailNotifications emailNotifications = new EmailNotifications();
//
//        EmailNotificationModifier emailNotificationsModifier = new EmailNotificationModifier(emailNotifications);
//
//        emailNotificationsModifier.modify("123");


        PayoutFrequencyModifier payoutFrequencyModifier = new PayoutFrequencyModifier();

        payoutFrequencyModifier.modify("123");
    }
}
