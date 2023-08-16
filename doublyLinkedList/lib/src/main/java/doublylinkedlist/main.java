package doublylinkedlist;

public class main {
    public static void main (String[]args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(2);
        dll.append(4);
        dll.append(6);
        dll.append(8);
        dll.display();

        dll.delete(6);
        dll.display();
    }
}
