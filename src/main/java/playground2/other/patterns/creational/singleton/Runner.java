package playground2.other.patterns.creational.singleton;

public class Runner {
    public static void main(String[] args) {

//        EagerSingleton singleton = EagerSingleton.getInstance();
//        EagerSingleton singleton2 = EagerSingleton.getInstance();
//        EagerSingleton singleton3 = EagerSingleton.getInstance();
//        EagerSingleton singleton4 = EagerSingleton.getInstance();
//        EagerSingleton singleton5 = EagerSingleton.getInstance();
//
//        singleton.sayHello();
//        singleton2.sayHello();
//        singleton5.sayHello();

        LazySingleton lazySingleton = LazySingleton.getInstance();

        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        lazySingleton.sayHello();
        lazySingleton2.sayHello();

    }
}
