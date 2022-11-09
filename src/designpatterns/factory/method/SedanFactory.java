package designpatterns.factory.method;

public class SedanFactory implements CarFactory {
    public Car makeCar() {
        return new Sedan();
    }
}
