package datastructures.tree;

public class BinarySearchTree implements ITree {
    private Node root;

    BinarySearchTree () {}

    BinarySearchTree(Node root) {
        this.root = root;
    }

    @Override
    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public Node getRoot() {
        return root;
    }

    @Override
    public boolean add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            setRoot(newNode);
            return true;
        }

        Node currentNode = root;
        while (currentNode != null) {
            if (value < currentNode.getData()) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(newNode);
                    return true;
                } else {
                    currentNode = currentNode.getLeft();
                }
            } else {
                if(currentNode.getRight() == null) {
                    currentNode.setRight(newNode);
                    return true;
                } else {
                    currentNode = currentNode.getRight();
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public Node search(int value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getData() == value) {
                return currentNode;
            } else if (value < currentNode.getData()) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        return null;
    }

    @Override
    public void print() {
        recursivePrint(root);
    }

    private void recursivePrint(Node node) {
        if (node == null)
            return;
        System.out.print(node.getData() + ", ");
        recursivePrint(node.getLeft());
        recursivePrint(node.getRight());
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.setRoot(new Node(7));
        bst.add(4);
        bst.add(9);
        bst.add(1);

        bst.print();
    }
}
