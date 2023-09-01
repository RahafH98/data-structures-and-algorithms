package stackandqueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStackQueue {

    @Test
    public void testStackPushPop() {
        stackandqueue.stack<Integer> stack = new stackandqueue.stack<>();
        stack.push(1);
        assertEquals(1, stack.pop());
    }

    @Test
    public void testStackPushMultiple() {
        stackandqueue.stack<String> stack = new stackandqueue.stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        assertEquals("C", stack.pop());
        assertEquals("B", stack.pop());
        assertEquals("A", stack.pop());
    }

    @Test
    public void testStackEmptyAfterPops() {
        stackandqueue.stack<Integer> stack = new stackandqueue.stack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackPeek() {
        stackandqueue.stack<Integer> stack = new stackandqueue.stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
    }



    @Test
    public void testQueueEnqueueDequeue() {
        stackandqueue.Queue<Integer> queue = new stackandqueue.Queue<>();
        queue.enqueue(1);
        assertEquals(1, queue.dequeue());
    }

    @Test
    public void testQueueEnqueueMultiple() {
        stackandqueue.Queue<String> queue = new stackandqueue.Queue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertEquals("A", queue.dequeue());
        assertEquals("B", queue.dequeue());
        assertEquals("C", queue.dequeue());
    }

    @Test
    public void testQueueEmptyAfterDequeues() {
        stackandqueue.Queue<Integer> queue = new stackandqueue.Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testQueuePeek() {
        stackandqueue.Queue<Integer> queue = new stackandqueue.Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());
    }


}


