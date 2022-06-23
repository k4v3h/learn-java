package datastructures.stack;

import org.junit.jupiter.api.*;

public class StackTest {
    // A lazy way to write tests :)
    @Test
    public void whenStackIsEmpty_thenRelevantMethodsShouldWorkAsExpected() {
        Stack<Integer> stack = new Stack<>(5);

        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertFalse(stack.isFull());
        Assertions.assertNull(stack.top());
    }

    @Test
    public void shouldThrowException_whenPoppingFromEmptyStack() {
        Stack<Integer> stack = new Stack<>(5);

        Assertions.assertThrows(StackIsEmptyException.class, () -> stack.pop());
    }

    @Test
    public void shouldThrowError_whenStackIsFull() throws StackIsFullException {
        Stack<Integer> stack = new Stack<>(1);
        stack.push(10);

        Assertions.assertThrows(StackIsFullException.class, () -> stack.push(11));
    }

    @Test
    public void shouldReturnLastItemAsTop() throws StackIsFullException {
        Stack<Integer> stack = new Stack<>(3);
        stack.push(1);
        stack.push(2);

        Assertions.assertEquals(stack.top(), 2);
    }

    @Test
    public void shouldThrowException_whenAllItemsArePopped() throws StackIsFullException, StackIsEmptyException {
        Stack<Integer> stack = new Stack<>(2);
        stack.push(1);

        stack.pop();

        Assertions.assertThrows(StackIsEmptyException.class, () -> stack.pop());
    }
}
