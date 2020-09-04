package operational.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ObserverTest {

    @Test
    public void shouldNotifyObservers() {
        //given
        Subject subject = new SubjectImplementation();
        Observer observer1 = Mockito.spy(Observer1.class);
        Observer observer2 = Mockito.spy(Observer2.class);
        Observer observer3 = Mockito.spy(Observer3.class);
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        //when
        subject.notifyAboutChange();

        //then
        Mockito.verify(observer1).update(subject);
        Mockito.verify(observer2).update(subject);
        Mockito.verify(observer3).update(subject);
    }
}

