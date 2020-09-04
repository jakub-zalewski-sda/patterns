package operational.mediator;

public abstract class ServiceWithMediator  {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
