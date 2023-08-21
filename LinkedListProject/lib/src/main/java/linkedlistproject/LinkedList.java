package linkedlistproject;

public class LinkedList {
    Node Head ;
    public LinkedList(Node Head){
        this.Head = null;
    }

    public LinkedList() {

    }

    public void insert(int value){

        Node newNode = new Node (value);

        newNode.Next=Head;

        Head = newNode;
    }
    public Boolean Have (int value) {
        Node current = Head;
        while (current != null){
            if (current.value == value ){
                return true;
            }
            current = current.Next;
        }
        return false;
    }
    public void append(int value){
        Node newNode = new Node(value);
        if (Head == null){
            Head = newNode;
            return;
        }
        Node current = Head;
        while (current.Next != null){
        current = current.Next;
        }
        current.Next = newNode;
    }
    public void insertBefore(int targetValue, int newValue){
        Node newNode = new Node(newValue);
        if (Head == null){
       throw new IllegalArgumentException("The list is empty");
        }
        if (Head.value == targetValue){
            newNode.Next = Head;
            Head = newNode;
            return;
        }
        Node current = Head;
        while ((current.Next!= null)){
            if (current.Next.value == targetValue){
                newNode.Next = current.Next;
                current.Next = newNode;
                return;
            }
            current = current.Next;

        }
        throw  new IllegalArgumentException(" the target value isn't found");
    }
    public void insertAfter(int targetValue, int newValue){
        Node newNode = new Node(newValue);
        if (Head ==  null ){
            throw new IllegalArgumentException(" the list is empty");
        }
       Node  current = Head;
        while (current !=null) {
            if (current.value == targetValue){
                newNode.Next = current.Next;
                current.Next = newNode;
                return;
            }
            current = current.Next;
        }
        throw new IllegalArgumentException("The target value wasn't found");
    }
    public void delete (int value){
        if (Head == null){
            return;
        }
      if (Head.value== value){
          Head = Head.Next;
          return;
      }
      Node current = Head;
      while (current.Next != null){
          if (current.Next.value == value ){
              current.Next = current.Next.Next;
              return;
          }
          current = current.Next;
      }
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        Node current = Head;
        while (current!= null ){
            result.append("{").append(current.value).append("} ->");
            current = current.Next;
        }
        result.append("Null");
        return result.toString();
    }
}
