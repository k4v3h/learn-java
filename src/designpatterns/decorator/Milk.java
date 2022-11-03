package designpatterns.decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage b) {
        beverage = b;
    }

    @Override
    public double cost() {
        return 0.50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk ";
    }
}
