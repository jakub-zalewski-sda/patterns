package operational.mediator;

public class Mediator {

    private final ServiceOne serviceOne;
    private final ServiceTwo serviceTwo;
    private final ServiceThree serviceThree;

    public Mediator(ServiceOne serviceOne, ServiceTwo serviceTwo, ServiceThree serviceThree) {
        serviceOne.setMediator(this);
        serviceTwo.setMediator(this);
        serviceThree.setMediator(this);

        this.serviceOne = serviceOne;
        this.serviceTwo = serviceTwo;
        this.serviceThree = serviceThree;
    }

    public void sendInfo(ServiceWithMediator originator, String context) {
        switch (context) {
            case "action1":
                serviceTwo.actionOnServiceTwo();
                break;
            case "action2":
                serviceThree.actionOnServiceThree();
                break;
            case "action3":
                serviceOne.actionOnServiceOne();
                serviceTwo.actionOnServiceTwo();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
