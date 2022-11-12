package designpatterns.composite;

public class Triangle extends Graphic {
    public Triangle(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(getName());
    }
}
