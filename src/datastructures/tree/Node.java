package datastructures.tree;

public class Node {
    private int data;
    private Node left;
    private Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }

    public void setData(int value) {
        data = value;
    }

    public int getData() {
        return data;
    }

    public void setLeft(Node l) {
        left = l;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node r) {
        right = r;
    }

    public Node getRight() {
        return right;
    }

    public boolean isLeafNode() {
        return right == null && left == null;
    }
}
