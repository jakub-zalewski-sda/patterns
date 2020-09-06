package playground.patterns.observer;

public class ObserverImpl implements Observer {

    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void notify(Subject subject) {
        System.out.println("i am: " + name + ", notified from " + subject.getName());
    }
}
