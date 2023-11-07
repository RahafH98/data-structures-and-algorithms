package tree.intersection;

import java.util.*;

public class TreeIntersection {
    public Set<Integer> tree_intersection(TreeNode root1, TreeNode root2) {
        Set<Integer> result = new HashSet<>();
        Map<Integer, Integer> valueCountMap = new HashMap<>();

        populateValueCountMap(root1, valueCountMap);
        checkIntersection(root2, valueCountMap, result);

        return result;
    }

    protected void populateValueCountMap(TreeNode node, Map<Integer, Integer> valueCountMap) {
        if (node == null) {
            return;
        }
        valueCountMap.put(node.val, valueCountMap.getOrDefault(node.val, 0) + 1);
        populateValueCountMap(node.left, valueCountMap);
        populateValueCountMap(node.right, valueCountMap);
    }

    protected void checkIntersection(TreeNode node, Map<Integer, Integer> valueCountMap, Set<Integer> result) {
        if (node == null) {
            return;
        }
        if (valueCountMap.containsKey(node.val) && valueCountMap.get(node.val) > 0) {
            result.add(node.val);
            valueCountMap.put(node.val, valueCountMap.get(node.val) - 1);
        }
        checkIntersection(node.left, valueCountMap, result);
        checkIntersection(node.right, valueCountMap, result);
    }
}
