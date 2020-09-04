package operational.mediator;

public class ServiceThree extends ServiceWithMediator {

    public void actionOnServiceThree() {
        System.out.println("action on service three");
    }

    public void sendInfo() {
        mediator.sendInfo(this, "action3");
    }
}
