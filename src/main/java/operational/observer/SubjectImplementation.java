package operational.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImplementation implements Subject {

    private final List<Observer> observers;

    public SubjectImplementation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAboutChange() {
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public String getData() {
        return "data from subject";
    }
}
