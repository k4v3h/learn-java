package datastructures.linkedlist;

import org.junit.jupiter.api.*;

public class SinglyLinkedListTest {
    @Test
    public void testIsEmptyReturnsTrueWhenListIsEmpty() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();

        Assertions.assertTrue(singlyLinkedList.isEmpty());
    }

    @Test
    public void testInsertOnlyOneNodeShouldEqualHead() {
        int headNodeValue = 1;

        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.insert(headNodeValue);

        Assertions.assertEquals(sll.getHead().getData(), headNodeValue);
    }

    @Test
    public void testInsertSecondValuesKeepHead() {
        int headNodeValue = 1;
        int secondValue = 2;

        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.insert(headNodeValue);
        sll.insert(secondValue);

        Assertions.assertNotEquals(sll.getHead().getData(), secondValue);
        Assertions.assertEquals(sll.getHead().getData(), headNodeValue);
    }

    @Test
    public void testFind() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);

        Assertions.assertNotNull(sll.find(3));
        Assertions.assertNull(sll.find(5));
    }

    @Test
    public void testDeleteEmptyList() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.delete(1);

        Assertions.assertTrue(sll.isEmpty());
    }
    @Test
    public void testDeleteHead() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);

        sll.delete(1);

        Assertions.assertNull(sll.find(1));
        Assertions.assertEquals(sll.getHead().getData(), 2);
    }

    @Test
    public void testDelete() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);

        sll.delete(3);

        Assertions.assertNull(sll.find(3));
        Assertions.assertNotNull(sll.find(1));
        Assertions.assertNotNull(sll.find(2));
        Assertions.assertNotNull(sll.find(4));
    }
}
