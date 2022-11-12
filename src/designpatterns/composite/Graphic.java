package designpatterns.composite;

public abstract class Graphic {
    protected String name;

    String getName() {
        return name;
    }

    abstract void print();
}
