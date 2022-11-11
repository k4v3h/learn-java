package designpatterns.command;

public class OpenSwitchCommand implements Command {
    Switchable switchable;

    public OpenSwitchCommand(Switchable switchable) {
        this.switchable = switchable;
    }
    public void execute() {
        switchable.powerOn();
    }
}
