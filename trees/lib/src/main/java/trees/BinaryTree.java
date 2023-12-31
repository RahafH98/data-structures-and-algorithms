package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public List<Integer> preOrder() {
        List<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }

    private void preOrderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.value);
            preOrderTraversal(node.Left, result);
            preOrderTraversal(node.Right, result);
        }
    }

    public List<Integer> inOrder() {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    private void inOrderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            inOrderTraversal(node.Left, result);
            result.add(node.value);
            inOrderTraversal(node.Right, result);
        }
    }

    public List<Integer> postOrder() {
        List<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }

    private void postOrderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            postOrderTraversal(node.Left, result);
            postOrderTraversal(node.Right, result);
            result.add(node.value);
        }
    }
    public int findMaximumValue() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMaximumValue(root);
    }

    private int findMaximumValue(Node node) {
        int maxValue = node.value;

        if (node.Left != null) {
            int leftMax = findMaximumValue(node.Left);
            maxValue = Math.max(maxValue, leftMax);
        }

        if (node.Right != null) {
            int rightMax = findMaximumValue(node.Right);
            maxValue = Math.max(maxValue, rightMax);
        }

        return maxValue;
    }

}

