package operational.iterator;

public class CarImpl implements Car {

    private final String registrationNumber;

    public CarImpl(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
