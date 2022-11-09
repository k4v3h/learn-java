package designpatterns.factory.method;

public class MakeCar {
    public static void main(String[] args) {
        CarFactory carFactory = new SedanFactory();
        Car car = carFactory.makeCar();
        System.out.println(car.getType());

        carFactory = new SUVFactory();
        car = carFactory.makeCar();
        System.out.println(car.getType());
    }
}
