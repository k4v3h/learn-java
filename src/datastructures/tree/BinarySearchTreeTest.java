package datastructures.tree;

import org.junit.jupiter.api.*;

public class BinarySearchTreeTest {
    @Test
    public void testEmptyBST() {
        BinarySearchTree bst = new BinarySearchTree();

        Assertions.assertTrue(bst.isEmpty());
        Assertions.assertNull(bst.getRoot());
    }

    @Test
    public void testGetRoot() {
        Node root = new Node(7);
        BinarySearchTree bst = new BinarySearchTree();

        bst.setRoot(root);
        bst.add(12);

        Assertions.assertEquals(bst.getRoot(), root);

        root.setData(2);

        Assertions.assertEquals(bst.getRoot().getData(), 2);
    }
}
