package playground.patterns.factory_m;

public class VehicleFactory {

    Vehicle createVehicle(Person person) {

        if (person.getType().equals("adult")) {
            return new Car();
        } else if (person.getType().equals("child")) {
            return new Bike();
        } else if (person.getType().equals("baby")) {
            return new Przyczepka();
        }

        throw new IllegalArgumentException();
    }
}
