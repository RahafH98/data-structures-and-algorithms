package tree.fizz.buzz;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    String value;
    List<TreeNode> children;

    public TreeNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
}

public class FizzBuzzTree {
    public TreeNode fizzBuzzTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode newNode = new TreeNode(fizzBuzz(root.value));

        for (TreeNode child : root.children) {
            newNode.children.add(fizzBuzzTree(child));
        }

        return newNode;
    }

    private String fizzBuzz(String value) {
        int num = Integer.parseInt(value);

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return value;
        }
    }
}
