package designpatterns.singleton;

public class LazySingleton {
    private LazySingleton instance = null;

    private LazySingleton() {}

    public LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    };
}
