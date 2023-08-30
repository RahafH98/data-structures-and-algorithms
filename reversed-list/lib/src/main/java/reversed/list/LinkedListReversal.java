package reversed.list;

public class LinkedListReversal {
    public static ListNode reverseLinkedList (ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null ;

        while (current != null ){
            next = current.next;
            current.next= prev;

            prev = current;
            current = next;
        }
        return prev;
    }
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
