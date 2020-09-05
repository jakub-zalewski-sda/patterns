package playground.patterns.singleton;

public class SimpleSingleton {

    private static SimpleSingleton simpleSingleton;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (simpleSingleton == null) {
            simpleSingleton = new SimpleSingleton();
        }

        return simpleSingleton;
    }

}
