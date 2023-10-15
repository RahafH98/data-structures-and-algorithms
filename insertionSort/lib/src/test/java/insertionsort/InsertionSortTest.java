package insertionsort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {
    @Test
    public void testInsertionSort() {
        int[] input1 = {8, 4, 23, 42, 16, 15};
        int[] result1 = InsertionSort.insertionSort(input1);
        int[] expected1 = {4, 8, 15, 16, 23, 42};
        assertArrayEquals(expected1, result1);

        int[] input2 = {20, 18, 12, 8, 5, -2};
        int[] result2 = InsertionSort.insertionSort(input2);
        int[] expected2 = {-2, 5, 8, 12, 18, 20};
        assertArrayEquals(expected2, result2);

        int[] input3 = {5, 12, 7, 5, 5, 7};
        int[] result3 = InsertionSort.insertionSort(input3);
        int[] expected3 = {5, 5, 5, 7, 7, 12};
        assertArrayEquals(expected3, result3);

        int[] input4 = {2, 3, 5, 7, 13, 11};
        int[] result4 = InsertionSort.insertionSort(input4);
        int[] expected4 = {2, 3, 5, 7, 11, 13};
        assertArrayEquals(expected4, result4);
    }
}

