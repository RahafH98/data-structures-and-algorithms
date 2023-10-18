package merge.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] arr = {8, 4, 23, 42, 16, 15};
        int[] sortedArr = {4, 8, 15, 16, 23, 42};
        MergeSort.mergeSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMergeSortReverseSorted() {
        int[] reverseSorted = {20, 18, 12, 8, 5, -2};
        int[] sortedArr = {-2, 5, 8, 12, 18, 20};
        MergeSort.mergeSort(reverseSorted);
        assertArrayEquals(sortedArr, reverseSorted);
    }

    @Test
    public void testMergeSortFewUniques() {
        int[] fewUniques = {5, 12, 7, 5, 5, 7};
        int[] sortedArr = {5, 5, 5, 7, 7, 12};
        MergeSort.mergeSort(fewUniques);
        assertArrayEquals(sortedArr, fewUniques);
    }

    @Test
    public void testMergeSortNearlySorted() {
        int[] nearlySorted = {2, 3, 5, 7, 13, 11};
        int[] sortedArr = {2, 3, 5, 7, 11, 13};
        MergeSort.mergeSort(nearlySorted);
        assertArrayEquals(sortedArr, nearlySorted);
    }
}
