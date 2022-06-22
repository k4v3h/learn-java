package datastructures.linkedlist;

public class SinglyLinkedList<T> {
    private Node<T> head;

    public SinglyLinkedList() {
        head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.hasNext()) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public Node<T> find(T data) {
        if (isEmpty()) {
            return null;
        }

        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }

        return null;
    }

    public void delete(T data) {
        if (isEmpty()) {
            return;
        }
        if (head.getData() == data) {
            head = head.getNext();
            return;
        }

        Node<T> prevNode = head;
        Node<T> currentNode = head.getNext();
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                prevNode.setNext(currentNode.getNext());
            }

            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }
}
