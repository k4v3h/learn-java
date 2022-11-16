package designpatterns.state;

public class Low implements State {
    public void pull(Chain wrapper) {
        System.out.println("low speed");
        wrapper.setState(new Medium());
    }
}
