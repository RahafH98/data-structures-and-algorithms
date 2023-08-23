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
        String expected = "{10} -> Null";
        String actual = list.toString();
        assertEquals(expected, actual, "List after insertion should match expected");
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
        assertEquals("{10} -> {20} -> Null", list.toString(), "List after multiple insertions should match expected");
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

    @Test
    public void testAppendSingleNode() {
        LinkedList list = new LinkedList();
        list.append(5);
        assertEquals("{5} ->Null", list.toString(), "List after appending a single node should match expected");
    }

    @Test
    public void testAppendMultipleNodes() {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        assertEquals("{5} ->{10} ->{15} ->Null", list.toString(), "List after appending multiple nodes should match expected");
    }

    @Test
    public void testInsertBeforeMiddleNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(50);
        list.insertBefore(30, 20);
        assertEquals("{50} ->{20} ->{30} ->{10} ->Null", list.toString(), "List after inserting before middle node should match expected");
    }


    @Test
    public void testInsertBeforeFirstNode() {
        LinkedList list = new LinkedList();
        list.insert(20);
        list.insert(30);
        list.insertBefore(30, 10);
        assertEquals("{10} ->{30} ->{20} ->Null", list.toString(), "List after inserting before first node should match expected");
    }

    @Test
    public void testInsertAfterMiddleNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAfter(20, 25);
        assertEquals("{30} ->{20} ->{25} ->{10} ->Null", list.toString(), "List after inserting after middle node should match expected");
    }

    @Test
    public void testInsertAfterLastNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insertAfter(10, 15);
        assertEquals("{20} ->{10} ->{15} ->Null", list.toString(), "List after inserting after last node should match expected");
    }

    @Test
    public void testDeleteMiddleNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.delete(20);
        assertEquals("{30} ->{10} ->Null", list.toString(), "List after deleting middle node should match expected");
    }

    @Test
    public void testDeleteFirstNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.delete(30);
        assertEquals("{20} ->{10} ->Null", list.toString(), "List after deleting first node should match expected");
    }

    @Test
    public void testDeleteLastNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.delete(10);
        assertEquals("{30} ->{20} ->Null", list.toString(), "List after deleting last node should match expected");
    }

    @Test
    public void testDeleteNonExistingNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.delete(40);
        assertEquals("{30} ->{20} ->{10} ->Null", list.toString(), "List should remain unchanged after attempting to delete non-existing node");
    }

    @Test
    public void testKthFromEnd_GreaterThanLength() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        assertThrows(IllegalArgumentException.class, () -> list.kthFromEnd(4));
    }

    @Test
    public void testKthFromEnd_SameAsLength() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        assertThrows(IllegalArgumentException.class, () -> list.kthFromEnd(3));
    }

    @Test
    public void testKthFromEnd_NegativeK() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        assertThrows(IllegalArgumentException.class, () -> list.kthFromEnd(-1));
    }

    @Test
    public void testKthFromEnd_Size1() {
        LinkedList list = new LinkedList();
        list.append(1);

        assertEquals(1, list.kthFromEnd(0));
    }

    @Test
    public void testKthFromEnd_HappyPath() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(3, list.kthFromEnd(2));
    }

    @Test
    public void testKthFromEnd_MiddleElement() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(2, list.kthFromEnd(3));
    }


}
