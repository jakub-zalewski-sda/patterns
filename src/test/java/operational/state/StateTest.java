package operational.state;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StateTest {

    @Test
    public void shouldSetPaidState() {
        //given
        ParkingTicketVendingMachine parkingTicketVendingMachine = new ParkingTicketVendingMachine();
        parkingTicketVendingMachine.setState(new Ready(parkingTicketVendingMachine));

        //when
        parkingTicketVendingMachine.collectCash();

        //then
        Assert.assertTrue(parkingTicketVendingMachine.getState() instanceof Paid);
    }

    @Test
    public void shouldSetReadyStateAfterCancel() {
        //given
        ParkingTicketVendingMachine parkingTicketVendingMachine = new ParkingTicketVendingMachine();
        parkingTicketVendingMachine.setState(new Paid(parkingTicketVendingMachine));

        //when
        parkingTicketVendingMachine.cancelTransaction();

        //then
        Assert.assertTrue(parkingTicketVendingMachine.getState() instanceof Ready);
    }

    @Test
    public void shouldSetReadyStateAfterBuying() {
        //given
        ParkingTicketVendingMachine parkingTicketVendingMachine = new ParkingTicketVendingMachine();
        parkingTicketVendingMachine.setState(new Paid(parkingTicketVendingMachine));

        //when
        parkingTicketVendingMachine.buyTicket();

        //then
        Assert.assertTrue(parkingTicketVendingMachine.getState() instanceof Ready);
    }
}
