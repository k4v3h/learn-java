package designpatterns.singleton;

class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    // private constructor, so it can not be instantiated
    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}