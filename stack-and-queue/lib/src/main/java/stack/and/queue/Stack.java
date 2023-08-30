package stack.and.queue;

public class Stack <T> {
    private Node <T> top ;

    public Stack (){
        this.top = null;

    }

    public void push (T push){
        Node<T> newNode = new Node <> ( value);
        newNode.next = top;
        top= newNode;
    }
    public T pop(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        T value = top.value;;
        top = top.next;
        return value;
    }
    public T peek(){
        if (isEmpty()){
            throw  new IllegalStateException("Stack is Empty");
        }
        return top.value;
    }
    public boolean isEmpty(){
        return top ==null;
    }
}
