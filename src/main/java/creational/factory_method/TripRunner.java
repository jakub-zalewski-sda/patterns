package creational.factory_method;

public class TripRunner {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Trip trip = new Trip(vehicleFactory);

        trip.run("child");
    }



}
