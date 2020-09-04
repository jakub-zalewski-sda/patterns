package operational.iterator;

import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void shouldIterateOverCarsInParkingLot() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addCar(new CarImpl("123"));
        parkingLot.addCar(new CarImpl("222"));
        parkingLot.addCar(new CarImpl("333"));

        //when
        Iterator<Car> parkingLotIterator = parkingLot.getIterator();

        //then
        Assert.assertTrue(parkingLotIterator.hasNext());
        Assert.assertSame(parkingLotIterator.next().getRegistrationNumber(), "123");

        Assert.assertTrue(parkingLotIterator.hasNext());
        Assert.assertSame(parkingLotIterator.next().getRegistrationNumber(), "222");

        Assert.assertTrue(parkingLotIterator.hasNext());
        Assert.assertSame(parkingLotIterator.next().getRegistrationNumber(), "333");

        Assert.assertFalse(parkingLotIterator.hasNext());
    }

}
