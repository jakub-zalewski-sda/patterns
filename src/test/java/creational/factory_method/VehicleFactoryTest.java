package creational.factory_method;

import org.junit.Assert;
import org.junit.Test;

public class VehicleFactoryTest {

    @Test
    public void shouldReturnCar() {
        //given
        VehicleFactory vehicleFactory = new VehicleFactory();

        //when
        Vehicle vehicle = vehicleFactory.createVehicle("adult");

        //then
        Assert.assertTrue(vehicle instanceof Car);
    }


    @Test
    public void shouldReturnBicycle() {
        //given
        VehicleFactory vehicleFactory = new VehicleFactory();

        //when
        Vehicle vehicle = vehicleFactory.createVehicle("child");

        //then
        Assert.assertTrue(vehicle instanceof Bicycle);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnUnknownPersonType() {
        //given
        VehicleFactory vehicleFactory = new VehicleFactory();

        //when
        vehicleFactory.createVehicle("dog");
    }
}
