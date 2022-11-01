package designpatterns.strategy;

public class Sedan extends Car {
    Sedan() {
        super(new RegularBreak());
    }
}
