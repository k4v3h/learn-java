package designpatterns.state;

public class Off  implements State {
    public void pull(Chain wrapper) {
        System.out.println("turning off");
        wrapper.setState(new Low());
    }
}
