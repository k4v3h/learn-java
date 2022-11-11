package designpatterns.command;

public class Switch {
    Command openCommand;
    Command closeCommand;

    public Switch(Command openCommand, Command closeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
    }

    public void close() {
        closeCommand.execute();
    }

    public void open() {
        openCommand.execute();
    }
}
