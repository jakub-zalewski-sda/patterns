package operational.mediator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MediatorTest {

    private ServiceOne serviceOne = Mockito.spy(ServiceOne.class);
    private ServiceTwo serviceTwo = Mockito.spy(ServiceTwo.class);
    private ServiceThree serviceThree = Mockito.spy(ServiceThree.class);

    @Test
    public void shouldHandleActionFromServiceOne() {
        //given
        new Mediator(serviceOne, serviceTwo, serviceThree);

        //when
        serviceOne.sendInfo();

        //then
        Mockito.verify(serviceTwo).actionOnServiceTwo();
    }

    @Test
    public void shouldHandleActionFromServiceTwo() {
        //given
        new Mediator(serviceOne, serviceTwo, serviceThree);

        //when
        serviceTwo.sendInfo();

        //then
        Mockito.verify(serviceThree).actionOnServiceThree();
    }

    @Test
    public void shouldHandleActionFromServiceThree() {
        //given
        new Mediator(serviceOne, serviceTwo, serviceThree);

        //when
        serviceThree.sendInfo();

        //then
        Mockito.verify(serviceOne).actionOnServiceOne();
        Mockito.verify(serviceTwo).actionOnServiceTwo();
    }
}
