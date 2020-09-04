package operational.observer;

public class Observer1 implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("Update in observer1, data: " + subject.getData());
    }
}
