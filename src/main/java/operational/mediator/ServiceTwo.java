package operational.mediator;

public class ServiceTwo extends ServiceWithMediator {

    public void actionOnServiceTwo() {
        System.out.println("action on service two");
    }

    public void sendInfo() {
        mediator.sendInfo(this, "action2");
    }
}
