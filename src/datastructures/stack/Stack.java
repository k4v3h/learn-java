package datastructures.stack;

public class Stack<T> implements IStack<T> {
    private T[] items;
    private int size;
    private int maxSize;

    public Stack(int size) {
        items = (T[]) new Object[size];
        this.size = 0;
        maxSize = size;
    }

    public void push(T value) throws StackIsFullException {
        if(isFull()) {
            throw new StackIsFullException();
        }
        items[size++] = value;
    }

    public T pop() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException();
        }
        T top = items[size-1];
        size--;
        return top;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T top() {
        return !isEmpty() ? items[size-1] : null;
    }
}
