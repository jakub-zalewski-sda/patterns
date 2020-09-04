package creational.factory_method;

public class Bicycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("bicycle: start");
    }

    @Override
    public void stop() {
        System.out.println("bicycle: stop");
    }
}
