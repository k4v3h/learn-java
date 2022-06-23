package datastructures.stack;

public class StackIsFullException extends Exception {
    public StackIsFullException() {
        super("Stack is full, you're dead :)");
    }
}
