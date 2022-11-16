package designpatterns.state;

public class Medium implements State {
    public void pull(Chain wrapper) {
        System.out.println("medium speed");
        wrapper.setState(new High());
    }
}
