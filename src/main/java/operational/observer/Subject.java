package operational.observer;

public interface Subject {
    void addObserver(Observer observer);
    void detachObserver(Observer observer);
    void notifyAboutChange();

    String getData();
}
