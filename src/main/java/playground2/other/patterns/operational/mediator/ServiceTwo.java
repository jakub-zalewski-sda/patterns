package playground2.other.patterns.operational.mediator;

public class ServiceTwo {

    private ServiceThree serviceThree;

    public ServiceTwo(ServiceThree serviceThree) {
        this.serviceThree = serviceThree;
    }

    public void notifyService() {
        serviceThree.notificationFromOtherService();
    }

    public void notificationFromOtherService() {
        System.out.println("notification from other service");
    }
}
