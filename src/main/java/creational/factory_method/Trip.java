package creational.factory_method;

public class Trip {
    private final VehicleFactory vehicleFactory;

    public Trip(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void run(String personType) {
        System.out.println("Trip start: " + personType);

        Vehicle vehicle = vehicleFactory.createVehicle(personType);

        vehicle.drive();
        vehicle.stop();

        System.out.println("Eat somethig: " + personType );
        System.out.println("See somethig: " + personType );

        vehicle.drive();
        vehicle.stop();

        System.out.println("Trip end: " + personType);
    }
}
