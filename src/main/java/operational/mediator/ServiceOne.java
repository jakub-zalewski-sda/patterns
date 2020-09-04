package operational.mediator;

public class ServiceOne extends ServiceWithMediator {

    public void actionOnServiceOne() {
        System.out.println("action on service one");
    }

    public void sendInfo() {
        mediator.sendInfo(this, "action1");
    }
}
