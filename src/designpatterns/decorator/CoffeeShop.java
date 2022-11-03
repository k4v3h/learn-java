package designpatterns.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + ": $" + beverage.cost());

        Beverage mixedBeverage = new DarkRoast();
        mixedBeverage = new Milk(mixedBeverage);
        mixedBeverage = new Mocha(mixedBeverage);

        System.out.println(mixedBeverage.getDescription() + ": $" + mixedBeverage.cost());
    }
}
