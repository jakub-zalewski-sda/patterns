package playground.patterns.factory_m;

public class Trip {

    private final VehicleFactory vehicleFactory;

    public Trip(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    void run(Person person) {
        //eat breakfast
        Vehicle vehicle = vehicleFactory.createVehicle(person);

        vehicle.drive();

        //see some view

        vehicle.drive();

        //end trip

    }
}
