package playground2.other.patterns.creational.static_factory_method;

public class NewUserRunner {
    public static void main(String[] args) {
        EmailNotifications emailNotifications = EmailNotifications.defaultNotifications();
    }
}
