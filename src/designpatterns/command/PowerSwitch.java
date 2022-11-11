package designpatterns.command;

public class PowerSwitch {
    public static void main(String[] args) {
        Switchable lamp = new Light();

        Command switchClose = new CloseSwitchCommand(lamp);
        Command switchOpen = new OpenSwitchCommand(lamp);

        Switch _switch = new Switch(switchOpen, switchClose);
        _switch.open();
        _switch.close();
    }
}
