package linkedlistproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void testEmptyLinkedList() {
        LinkedList list = new LinkedList();
        assertEquals("Null", list.toString(), "Empty list should return 'Null'");
    }

    @Test
    public void testInsertIntoLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(10);
        assertEquals("{10} ->Null", list.toString(), "List after insertion should match expected");
    }

    @Test
    public void testHeadPointsToFirstNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        assertEquals(20, list.Head.value, "Head should point to the first node");
    }

    @Test
    public void testInsertMultipleNodes() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        assertEquals("{20} ->{10} ->Null", list.toString(), "List after multiple insertions should match expected");
    }

    @Test
    public void testContainsExistingValue() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        assertTrue(list.Have(10), "Value 10 should exist in the list");
    }

    @Test
    public void testContainsNonExistingValue() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        assertFalse(list.Have(30), "Value 30 should not exist in the list");
    }
}
