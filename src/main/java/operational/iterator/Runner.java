package operational.iterator;

public class Runner {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addCar(new CarImpl("123"));
        parkingLot.addCar(new CarImpl("222"));
        parkingLot.addCar(new CarImpl("333"));

        Iterator<Car> iterator = parkingLot.getIterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next().getRegistrationNumber());
        System.out.println("---");
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next().getRegistrationNumber());
        System.out.println("---");
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next().getRegistrationNumber());
        System.out.println("---");
        System.out.println(iterator.hasNext());
    }
}
