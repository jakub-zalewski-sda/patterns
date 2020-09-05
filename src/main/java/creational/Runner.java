package creational;

import creational.static_factory_method.EmailNotifications;

public class Runner {
    public static void main(String[] args) {

        EmailNotifications emailNotifications = EmailNotifications.defaultNotifications();
        EmailNotifications emailNotifications2 = EmailNotifications.emptyNotifications();

    }
}
