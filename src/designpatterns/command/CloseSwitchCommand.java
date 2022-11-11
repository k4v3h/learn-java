package designpatterns.command;

public class CloseSwitchCommand implements Command {
    Switchable switchable;

    public CloseSwitchCommand(Switchable switchable) {
        this.switchable = switchable;
    }

    public void execute() {
        switchable.powerOff();
    }
}
