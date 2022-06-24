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

    @Test
    public void whenSearchingNonExistingValue_thenSearchResultShouldBeNull() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(7);
        bst.add(3);

        Assertions.assertNull(bst.search(1));
    }

    @Test
    public void shouldReturnNode_whenSearchExistingValue() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(6);
        bst.add(2);
        bst.add(9);
        bst.add(7);

        Assertions.assertEquals(bst.search(7).getData(), 7);
    }

    @Test
    public void shouldNoRemoveAnything_whenGivenValueIsNotInTheTree() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.setRoot(new Node(7));
        bst.add(3);
        bst.add(9);

        bst.delete(8);

        Assertions.assertEquals(bst.getRoot().getData(), 7);
        Assertions.assertEquals(bst.getRoot().getLeft().getData(), 3);
        Assertions.assertEquals(bst.getRoot().getRight().getData(), 9);
    }

    @Test
    public void shouldRemoveLeftChild_whenGivenValueIsLeftChild() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.setRoot(new Node(7));
        bst.add(3);
        bst.add(9);

        bst.delete(3);

        Assertions.assertEquals(bst.getRoot().getData(), 7);
        Assertions.assertNull(bst.getRoot().getLeft());
        Assertions.assertEquals(bst.getRoot().getRight().getData(), 9);
    }

    // TODO: test other branches of delete method
}
