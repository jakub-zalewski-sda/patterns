package playground.patterns.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);

    String getName();

    void notifyAllObservers();
}
