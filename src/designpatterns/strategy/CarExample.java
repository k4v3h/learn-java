package designpatterns.strategy;

public class CarExample {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        Car suv = new SUV();

        sedan.brake();
        suv.brake();

        sedan.setBrakeBehaviour(new ABSBrake());
        sedan.brake();
    }
}
