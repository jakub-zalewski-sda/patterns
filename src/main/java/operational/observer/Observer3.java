package operational.observer;

public class Observer3 implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("Update in observer3, data: " + subject.getData());
    }
}
