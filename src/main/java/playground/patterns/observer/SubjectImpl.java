package playground.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    List<Observer> observers;

    private String name;

    public SubjectImpl(String name) {
        observers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(observer -> observer.notify(this));
    }

    @Override
    public String getName() {
        return name;
    }
}
