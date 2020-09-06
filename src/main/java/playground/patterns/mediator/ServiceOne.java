package playground.patterns.mediator;

public class ServiceOne implements Service {

    private final Mediator mediator;

    public ServiceOne(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doSomeStuff() {
        System.out.println("cos tam robie");
        mediator.sendNotification("serviceOne", "message from service one");
    }

    @Override
    public void notifyFromService() {
        System.out.println("i got notification");
    }
}
