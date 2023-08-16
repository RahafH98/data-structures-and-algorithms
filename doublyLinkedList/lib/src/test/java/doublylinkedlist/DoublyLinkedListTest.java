package doublylinkedlist;


    public class DoublyLinkedListTest {
        public static void main(String[] args) {
            DoublyLinkedList dll = new DoublyLinkedList();


            dll.append(2);
            dll.append(4);
            dll.append(6);


            dll.prepend(0);


            System.out.print("Doubly Linked List: ");
            dll.display();

            dll.delete(6);


            System.out.print("Doubly Linked List after deleting 6: ");
            dll.display();
        }
    }


