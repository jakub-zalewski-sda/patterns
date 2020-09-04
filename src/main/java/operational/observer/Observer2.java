package operational.observer;

public class Observer2 implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("Update in observer2, data: " + subject.getData());
    }
}
