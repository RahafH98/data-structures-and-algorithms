package stack.queue.pseudo;
import java.util.EmptyStackException;


public class CustomStack <T>  {
    private static class Node <T> {
        private T data;
        private Node <T> next;
         public Node (T data){
             this.data = data;
         }
    }
    private Node <T> top;
    public void push (T data){
        Node <T>  newNode = new Node <> (data);
        newNode.next = top;
        top = newNode;
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }
    public T peek (){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
