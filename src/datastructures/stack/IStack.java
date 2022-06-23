package datastructures.stack;

interface IStack<T> {
    void push(T value) throws StackIsFullException;
    T pop() throws StackIsEmptyException;
    boolean isEmpty();
    T top();
}