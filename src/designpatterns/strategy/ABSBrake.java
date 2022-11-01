package designpatterns.strategy;

public class ABSBrake implements IBrakeBehaviour {
    public void brake() {
        System.out.println("ABS break is applied");
    }
}
