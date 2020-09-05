package playground.patterns.factory_m;

public class Runner {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Trip trip = new Trip(vehicleFactory);

        Person person = new Person("adult");
        trip.run(person);

        Person child = new Person("child");
        trip.run(child);

        Person baby = new Person("baby");
        trip.run(baby);
    }
}
