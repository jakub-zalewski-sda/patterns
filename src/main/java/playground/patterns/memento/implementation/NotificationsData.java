package playground.patterns.memento.implementation;

import java.util.Map;

public class NotificationsData {
    private final Map<String, Boolean> notifications;

    public NotificationsData(Map<String, Boolean> notifications) {
        this.notifications = notifications;
    }

    public Map<String, Boolean> getNotifications() {
        return notifications;
    }
}
