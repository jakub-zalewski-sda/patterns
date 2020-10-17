package operational.iterator_java;

import java.util.Iterator;
import java.util.List;

public class ParkingLotIterator implements Iterator<Car> {

    private final List<Car> cars;
    private int position = 0;

    public ParkingLotIterator(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean hasNext() {
        return cars.size() > position;
    }

    @Override
    public Car next() {
        Car car = cars.get(position);
        position++;

        return car;
    }
}
