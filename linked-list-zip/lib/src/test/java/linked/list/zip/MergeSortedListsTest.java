package linked.list.zip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedListsTest {

    @Test
    public void testMergeSortedLists() {
        LinkedList sortedList1 = new LinkedList();
        sortedList1.append(2);
        sortedList1.append(4);
        sortedList1.append(6);

        LinkedList sortedList2 = new LinkedList();
        sortedList2.append(1);
        sortedList2.append(3);
        sortedList2.append(5);

        Solution solution = new Solution();
        ListNode mergedResult = solution.mergeSortedLists(sortedList1.head, sortedList2.head);

        int[] expectedMerged = {1, 2, 3, 4, 5, 6};
        int indexMerged = 0;
        while (mergedResult != null) {
            assertEquals(expectedMerged[indexMerged], mergedResult.value);
            mergedResult = mergedResult.next;
            indexMerged++;
        }
        assertEquals(expectedMerged.length, indexMerged);

        LinkedList sortedList3 = new LinkedList();
        sortedList3.append(2);
        sortedList3.append(4);
        sortedList3.append(6);

        LinkedList sortedList4 = new LinkedList();
        sortedList4.append(1);
        sortedList4.append(3);
        sortedList4.append(5);
        sortedList4.append(7);

        ListNode mergedResult2 = solution.mergeSortedLists(sortedList3.head, sortedList4.head);

        int[] expectedMerged2 = {1, 2, 3, 4, 5, 6, 7};
        int indexMerged2 = 0;
        while (mergedResult2 != null) {
            assertEquals(expectedMerged2[indexMerged2], mergedResult2.value);
            mergedResult2 = mergedResult2.next;
            indexMerged2++;
        }
        assertEquals(expectedMerged2.length, indexMerged2);
    }
}