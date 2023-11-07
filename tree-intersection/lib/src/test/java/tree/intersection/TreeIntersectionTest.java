package tree.intersection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TreeIntersectionTest {
    @Test
    void testPopulateValueCountMap() {
        TreeNode root1 = new TreeNode(100);
        root1.left = new TreeNode(160);
        root1.right = new TreeNode(125);

        TreeIntersection treeIntersection = new TreeIntersection();
        TreeNodeTestHelper helper = new TreeNodeTestHelper();
        helper.populateValueCountMap(root1, treeIntersection);

        assertEquals(1, helper.valueCountMap.get(100));
        assertEquals(1, helper.valueCountMap.get(160));
        assertEquals(1, helper.valueCountMap.get(125));
        assertNull(helper.valueCountMap.get(200));
    }

    @Test
    void testCheckIntersection() {
        TreeNode root2 = new TreeNode(125);
        root2.left = new TreeNode(160);
        root2.right = new TreeNode(200);

        Map<Integer, Integer> valueCountMap = new HashMap<>();
        valueCountMap.put(100, 1);
        valueCountMap.put(160, 1);
        valueCountMap.put(125, 1);

        TreeIntersection treeIntersection = new TreeIntersection();
        TreeNodeTestHelper helper = new TreeNodeTestHelper();
        helper.checkIntersection(root2, valueCountMap, treeIntersection);

        assertTrue(helper.result.contains(160));
        assertTrue(helper.result.contains(125));
        assertFalse(helper.result.contains(100));
        assertFalse(helper.result.contains(200));
    }
}
