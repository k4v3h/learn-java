package designpatterns.state;

public class High implements State {
    public void pull(Chain wrapper) {
        System.out.println("high speed");
        wrapper.setState(new Off());
    }
}
