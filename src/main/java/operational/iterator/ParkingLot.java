package operational.iterator;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements Iterable {

    private final List<Car> cars;

    public ParkingLot() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    @Override
    public Iterator<Car> getIterator() {
        return new ParkingLotIterator(cars);
    }
}
