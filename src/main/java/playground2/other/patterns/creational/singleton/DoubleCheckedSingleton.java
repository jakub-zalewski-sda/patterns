package playground2.other.patterns.creational.singleton;

public class DoubleCheckedSingleton {

    private static DoubleCheckedSingleton singleton;

    private String name;

    private DoubleCheckedSingleton() {
        this.name = "i am singleton";
    }

    public static DoubleCheckedSingleton getInstance() {
        if (singleton == null) {

            synchronized (DoubleCheckedSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedSingleton();
                }
            }

        }

        return singleton;
    }

    public void sayHello() {
        System.out.println(name);
    }


}
