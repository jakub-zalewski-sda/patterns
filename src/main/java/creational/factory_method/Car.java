package creational.factory_method;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("car: start");
    }

    @Override
    public void stop() {
        System.out.println("car: stop");
    }
}
