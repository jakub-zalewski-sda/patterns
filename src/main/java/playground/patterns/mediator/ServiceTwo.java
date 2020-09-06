package playground.patterns.mediator;

public class ServiceTwo implements Service {
    private final Mediator mediator;

    public ServiceTwo(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doSomeStuff() {
        System.out.println("cos tam robie");
        mediator.sendNotification("serviceTwo", "message from service two");
    }

    @Override
    public void notifyFromService() {
        System.out.println("i got notified");
    }
}
