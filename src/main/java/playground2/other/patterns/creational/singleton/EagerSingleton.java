package playground2.other.patterns.creational.singleton;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private String name;

    private EagerSingleton() {
        this.name = "i am singleton";
    }

    public static EagerSingleton getInstance() {
        return singleton;
    }

    public void sayHello() {
        System.out.println(name);
    }


}
