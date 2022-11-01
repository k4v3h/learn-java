package designpatterns.strategy;

public class RegularBreak implements IBrakeBehaviour {
    public void brake() {
        System.out.println("Regular break is applied");
    }
}
