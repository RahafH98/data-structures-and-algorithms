package trees;

public class Node {
    int value;
    Node Right;
    Node Left;


    public Node (int value){
        this.Left = null;
        this.Right = null;
        this.value = value;
    }
}
