package operational.iterator_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParkingLot implements Iterable<Car> {

    private final List<Car> cars;

    public ParkingLot() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    @Override
    public Iterator<Car> iterator() {
        return new ParkingLotIterator(cars);
    }
}
