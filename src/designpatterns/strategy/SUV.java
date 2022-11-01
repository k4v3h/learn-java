package designpatterns.strategy;

public class SUV extends Car {
    SUV() {
        super(new ABSBrake());
    }
}
