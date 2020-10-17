package playground2.other.patterns.operational.mediator;

public class ServiceOne {
    private ServiceTwo serviceTwo;

    public void notificationFromOtherService() {
        System.out.println("notification from other service");
    }

    public void notifyService() {
        serviceTwo.notificationFromOtherService();
    }
}
