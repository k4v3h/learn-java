package datastructures.linkedlist;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T value) {
        data = value;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> nextNode) {
        next = nextNode;
    }

    public Node<T> getNext() {
        return next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
