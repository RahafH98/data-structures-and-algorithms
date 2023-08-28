package linked.list.zip;

public class Solution {
    public ListNode zipLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode resultHead = new ListNode(0);
        ListNode current = resultHead;

        while (current1 != null && current2 != null) {
            current.next = current1;
            current1 = current1.next;
            current = current.next;

            current.next = current2;
            current2 = current2.next;
            current = current.next;
        }


        if (current1 != null) {
            current.next = current1;
        }
        if (current2 != null) {
            current.next = current2;
        }

        return resultHead.next;
    }
    public ListNode mergeSortedLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode mergedHead = new ListNode(0);
        ListNode current = mergedHead;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return mergedHead.next;
    }
}
