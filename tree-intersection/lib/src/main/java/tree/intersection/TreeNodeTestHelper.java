package tree.intersection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class TreeNodeTestHelper {
    Map<Integer, Integer> valueCountMap = new HashMap<>();
    Set<Integer> result = new HashSet<>();

    public void populateValueCountMap(TreeNode node, TreeIntersection treeIntersection) {
        treeIntersection.populateValueCountMap(node, valueCountMap);
    }

    public void checkIntersection(TreeNode node, Map<Integer, Integer> valueCountMap, TreeIntersection treeIntersection) {
        treeIntersection.checkIntersection(node, valueCountMap, result);
    }
}
