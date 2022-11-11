package designpatterns.command;

public class Light implements Switchable {
    public void powerOn() {
        System.out.println("The light is on");
    }

    public void powerOff() {
        System.out.println("The light is off");
    }
}
