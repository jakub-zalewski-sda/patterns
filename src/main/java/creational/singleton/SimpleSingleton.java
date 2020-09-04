package creational.singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance;

    private String someValue;

    private SimpleSingleton(String initialValue) {
        this.someValue = initialValue;
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton("initialValue");
        }

        return instance;
    }

    public String getSomeValue() {
        return someValue;
    }
}
