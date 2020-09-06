package playground.patterns.observer;

public class Runner {
    public static void main(String[] args) {
        Observer observer1 = new ObserverImpl("observer1");
        Observer observer2 = new ObserverImpl("observer2");
        Observer observer3 = new ObserverImpl("observer3");
        Observer observer4 = new ObserverImpl("observer4");

        Subject subject = new SubjectImpl("subject one");

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.attach(observer4);

        subject.notifyAllObservers();

        subject.detach(observer1);

        subject.notifyAllObservers();
    }
}
