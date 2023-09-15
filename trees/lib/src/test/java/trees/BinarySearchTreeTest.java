package trees;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class BinarySearchTreeTest {

    @Test
    public void testEmptyTreeInstantiation() {
        BinarySearchTree tree = new BinarySearchTree();
        assertNull(tree.root);
    }

    @Test
    public void testSingleRootNode() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        assertNotNull(tree.root);
        assertEquals(5, tree.root.value);
    }

    @Test
    public void testAddLeftAndRightChild() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);

        assertNotNull(tree.root);
        assertEquals(5, tree.root.value);

        assertNotNull(tree.root.Left);
        assertEquals(3, tree.root.Left.value);

        assertNotNull(tree.root.Right);
        assertEquals(7, tree.root.Right.value);
    }

    @Test
    public void testPreOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);

        List<Integer> result = tree.preOrder();
        assertEquals(List.of(5, 3, 2, 4, 7), result);
    }

    @Test
    public void testInOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);

        List<Integer> result = tree.inOrder();
        assertEquals(List.of(2, 3, 4, 5, 7), result);
    }

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);

        List<Integer> result = tree.postOrder();
        assertEquals(List.of(2, 4, 3, 7, 5), result);
    }

    @Test
    public void testContainsExistingValue() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);

        assertTrue(tree.contains(5));
        assertTrue(tree.contains(3));
        assertTrue(tree.contains(7));
    }

    @Test
    public void testContainsNonExistingValue() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);

        assertFalse(tree.contains(2));
        assertFalse(tree.contains(8));
    }
}
