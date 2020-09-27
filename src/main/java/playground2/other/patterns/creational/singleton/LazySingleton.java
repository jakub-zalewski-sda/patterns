package playground2.other.patterns.creational.singleton;

public class LazySingleton {

    private static LazySingleton singleton;

    private String name;

    private LazySingleton() {
        this.name = "i am singleton";
    }

    synchronized public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }

        return singleton;
    }

    public void sayHello() {
        System.out.println(name);
    }


}
