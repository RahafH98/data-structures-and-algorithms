package tree.fizz.buzz;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTreeTest {

    @Test
    public void testFizzBuzzTree() {

        TreeNode root = new TreeNode("1");
        root.children.add(new TreeNode("2"));
        root.children.add(new TreeNode("3"));
        root.children.add(new TreeNode("5"));

        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();
        TreeNode result = fizzBuzzTree.fizzBuzzTree(root);


        assertEquals("1", result.value);


        assertEquals("2", result.children.get(0).value);
        assertEquals("Fizz", result.children.get(1).value);
        assertEquals("Buzz", result.children.get(2).value);
    }
}

