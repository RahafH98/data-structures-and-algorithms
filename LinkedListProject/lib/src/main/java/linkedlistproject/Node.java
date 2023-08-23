package linkedlistproject;

public class Node {

    int value ;
    Node Next;

    public Node (int value){
        this.value = value;
        this.Next=null;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }
}
