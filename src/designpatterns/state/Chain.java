package designpatterns.state;

public class Chain {
    private State currentState;

    Chain() {
        currentState = new Low();
    }

    public void setState(State newState) {
        currentState = newState;
    }

    public void pull() {
        currentState.pull(this);
    }
}
