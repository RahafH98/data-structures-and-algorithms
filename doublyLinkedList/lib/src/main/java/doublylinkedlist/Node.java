package doublylinkedlist;

public class Node {
    int value;
    Node prev;
    Node Next;

    public Node (int value){
        this.value = value;
        this.prev = null;
        this.Next= null;
    }
}
