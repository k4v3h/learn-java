package datastructures.tree;

public interface ITree {
    void setRoot(Node root);
    Node getRoot();
    boolean add(int value);
    boolean isEmpty();
    void print();
}
