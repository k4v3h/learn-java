package designpatterns.factory.method;

public class SUVFactory implements CarFactory {
    public Car makeCar() {
        return new SUV();
    }
}
