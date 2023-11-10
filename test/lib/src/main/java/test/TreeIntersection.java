package test;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeIntersection {
    public static Set<Integer> treeIntersection(TreeNode tree1, TreeNode tree2) {
        Set<Integer> commonValues = new HashSet<>();

        HashMap<Integer, Boolean> valueMap = new HashMap<>();

        // Traverse the first tree and add values to the HashMap
        traverseAndAddToMap(tree1, valueMap);

        // Traverse the second tree and check if values exist in the HashMap
        findCommonValues(tree2, valueMap, commonValues);

        return commonValues;
    }

    private static void traverseAndAddToMap(TreeNode node, HashMap<Integer, Boolean> map) {
        if (node == null) {
            return;
        }

        map.put(node.val, true); // Add the value to the HashMap
        traverseAndAddToMap(node.left, map); // Recursively traverse left subtree
        traverseAndAddToMap(node.right, map); // Recursively traverse right subtree
    }

    private static void findCommonValues(TreeNode node, HashMap<Integer, Boolean> map, Set<Integer> commonValues) {
        if (node == null) {
            return;
        }

        if (map.containsKey(node.val)) {
            commonValues.add(node.val); // Value exists in both trees
        }

        findCommonValues(node.left, map, commonValues); // Recursively traverse left subtree
        findCommonValues(node.right, map, commonValues); // Recursively traverse right subtree
    }

    public static void main(String[] args) {
        // Create two sample binary trees
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        tree1.left.left = new TreeNode(4);
        tree1.left.right = new TreeNode(5);

        TreeNode tree2 = new TreeNode(3);
        tree2.left = new TreeNode(5);
        tree2.right = new TreeNode(6);
        tree2.left.left = new TreeNode(7);

        Set<Integer> commonValues = treeIntersection(tree1, tree2);
        System.out.println("Common values: " + commonValues);
    }
}

