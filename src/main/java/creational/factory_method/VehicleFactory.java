package creational.factory_method;

public class VehicleFactory {

    public Vehicle createVehicle(String personType) {
        switch (personType) {
            case "adult":
                return new Car();
            case "child":
                return new Bicycle();
            default:
                throw new IllegalArgumentException("unknown driver type: " + personType);
        }
    }
}
