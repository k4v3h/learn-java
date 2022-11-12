package designpatterns.composite;

public class Circle extends Graphic {
    public Circle(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(getName());
    }
}
