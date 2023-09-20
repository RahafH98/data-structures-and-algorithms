package trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BinarySearchTree extends BinaryTree{
    public BinarySearchTree(){
        super();
    }
    public void add(int value){
        root = addRecursive(root, value);
    }
    private Node addRecursive(Node current, int value){
        if (current== null){
            return new Node(value);
        }
        if (value < current.value){
            current.Left = addRecursive(current.Left, value);
        }
        else if (value > current.value){
            current.Right = addRecursive(current.Right, value);
        }
        return current;
    }
    public boolean contains (int value){
        return containRecursive(root, value);
    }
    private boolean containRecursive(Node current, int value){
        if (current == null ){
            return false;
        }
        if (value == current.value){
            return true;
        }
        if (value < current.value){
            return containRecursive(current.Left, value);
        } else {
            return  containRecursive(current.Right, value);
        }
    }
    public List<Integer> breadthFirst() {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                result.add(current.value);

                if (current.Left != null) {
                    queue.add(current.Left);
                }
                if (current.Right != null) {
                    queue.add(current.Right);
                }
            }
        }
        return result;
    }
}
