package playground2.other.patterns.operational.mediator;

public class ServiceThree {

    private ServiceOne serviceOne;

    public ServiceThree(ServiceOne serviceOne) {
        this.serviceOne = serviceOne;
    }

    public void notifyService() {
        serviceOne.notificationFromOtherService();
    }

    public void notificationFromOtherService() {
        System.out.println("notification from other service");
    }
}
