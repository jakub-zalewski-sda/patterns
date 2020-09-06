package playground.patterns.mediator;

public class Mediator {
    private final ServiceOne serviceOne;
    private final ServiceTwo serviceTwo;
    private final ServiceThree serviceThree;

    public Mediator(ServiceOne serviceOne, ServiceTwo serviceTwo, ServiceThree serviceThree) {
        this.serviceOne = serviceOne;
        this.serviceTwo = serviceTwo;
        this.serviceThree = serviceThree;
    }


    public void sendNotification(String originator, String notification) {
        if (originator.equals("ServiceOne")) {
            serviceTwo.notifyFromService();
            serviceThree.notifyFromService();
        } else if (originator.equals("ServiceTwo")) {
            serviceOne.notifyFromService();
        } else if (originator.equals("ServiceThree")) {
            serviceOne.notifyFromService();
        }
    }
}
