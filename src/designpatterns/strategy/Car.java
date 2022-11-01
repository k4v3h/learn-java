package designpatterns.strategy;

public abstract class Car {
    private IBrakeBehaviour brakeBehaviour;

    Car(IBrakeBehaviour brakeBehaviour) {
        this.brakeBehaviour = brakeBehaviour;
    }

    public void brake() {
        brakeBehaviour.brake();
    }

    public void setBrakeBehaviour(IBrakeBehaviour brakeBehaviour) {
        this.brakeBehaviour = brakeBehaviour;
    }
}
