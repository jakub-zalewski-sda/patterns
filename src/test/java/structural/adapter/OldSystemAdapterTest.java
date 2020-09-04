package structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class OldSystemAdapterTest {

    @Test
    public void shouldReturnCreatedStatus() {
        //given
        int createdStatusInOldSystem = 0;
        OldSystemPayment oldSystemPayment = new OldSystemPayment(createdStatusInOldSystem);
        OldSystemPaymentAdapter oldSystemPaymentAdapter = new OldSystemPaymentAdapter(oldSystemPayment);

        //when
        Status status = oldSystemPaymentAdapter.getStatus();

        //then
        Assert.assertSame(status, Status.CREATED);
    }

    @Test
    public void shouldReturnPaidStatus() {
        //given
        int paidStatusInOldSystem = 1;
        OldSystemPayment oldSystemPayment = new OldSystemPayment(paidStatusInOldSystem);
        OldSystemPaymentAdapter oldSystemPaymentAdapter = new OldSystemPaymentAdapter(oldSystemPayment);

        //when
        Status status = oldSystemPaymentAdapter.getStatus();

        //then
        Assert.assertSame(status, Status.PAID);
    }

    @Test
    public void shouldReturnCancelledStatus() {
        //given
        int cancelledStatusInOldSystem = 2;
        OldSystemPayment oldSystemPayment = new OldSystemPayment(cancelledStatusInOldSystem);
        OldSystemPaymentAdapter oldSystemPaymentAdapter = new OldSystemPaymentAdapter(oldSystemPayment);

        //when
        Status status = oldSystemPaymentAdapter.getStatus();

        //then
        Assert.assertSame(status, Status.CANCELLED);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException() {
        //given
        int someCrazyStatusInOldSystem = 99;
        OldSystemPayment oldSystemPayment = new OldSystemPayment(someCrazyStatusInOldSystem);
        OldSystemPaymentAdapter oldSystemPaymentAdapter = new OldSystemPaymentAdapter(oldSystemPayment);

        //when
        oldSystemPaymentAdapter.getStatus();
    }
}
