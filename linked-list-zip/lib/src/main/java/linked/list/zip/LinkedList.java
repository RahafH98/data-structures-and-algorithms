package linked.list.zip;

public class LinkedList {
    ListNode head;
     public LinkedList(){
         this.head = null;
     }
    public void append(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = newNode;
        }
    }
}
