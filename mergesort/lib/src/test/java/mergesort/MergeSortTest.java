package mergesort;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = new int[0];
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[0], arr);
    }

    @Test
    public void testMergeSortSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testMergeSortReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testMergeSortRandomArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, arr);
    }
}
