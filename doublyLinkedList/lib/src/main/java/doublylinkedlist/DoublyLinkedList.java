package doublylinkedlist;

public class DoublyLinkedList {
    Node Head;
    Node Tail;

    public DoublyLinkedList(){
        Head = null;
        Tail = null;
    }
    public void append (int value){
        Node newNode = new Node (value);
        if (Head== null){
            Head= newNode;
            Tail = newNode;
        } else {
            newNode.prev= Tail;
            Tail.Next= newNode;
            Tail = newNode;
        }

        }
    public void prepend(int value){
        Node newNode = new Node(value);
        if (Head == null){
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.Next= Head;
            Head.prev = newNode;
            Head = newNode;
        }
    }
    public void delete (int value){
        Node current = Head;
        while (current != null){
            if (current.value == value){
                if(current.prev != null){
                    current.prev.Next = current.Next;
                }else { Tail= current.prev;
            }
                return;
        }
            current= current.Next;
    }
}

public void display(){
        Node current = Head;
        while(current != null){
            System.out.print(current.value + "<->");
            current = current.Next;
        }
        System.out.println("null");
    }
}
