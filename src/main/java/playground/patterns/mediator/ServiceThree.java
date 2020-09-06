package playground.patterns.mediator;

public class ServiceThree implements Service {

    private final Mediator mediator;

    public ServiceThree(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doSomeStuff() {
        System.out.println("cos tam robie");
        mediator.sendNotification("serviceThree", "message from service three");
    }

    @Override
    public void notifyFromService() {
        System.out.println("got notification");
    }
}
