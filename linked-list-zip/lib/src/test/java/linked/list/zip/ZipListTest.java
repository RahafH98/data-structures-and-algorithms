package linked.list.zip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZipListTest {

    @Test
    public void testZipLists() {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(2);

        LinkedList list2 = new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);

        Solution solution = new Solution();
        ListNode result = solution.zipLists(list1.head, list2.head);

        int[] expected = {1, 5, 3, 9, 2, 4};
        int index = 0;
        while (result != null) {
            assertEquals(expected[index], result.value);
            result = result.next;
            index++;
        }
        assertEquals(expected.length, index);

        LinkedList list3 = new LinkedList();
        list3.append(1);
        list3.append(3);

        LinkedList list4 = new LinkedList();
        list4.append(5);
        list4.append(9);
        list4.append(4);

        ListNode result2 = solution.zipLists(list3.head, list4.head);

        int[] expected2 = {1, 5, 3, 9, 4};
        int index2 = 0;
        while (result2 != null) {
            assertEquals(expected2[index2], result2.value);
            result2 = result2.next;
            index2++;
        }
    }
}

