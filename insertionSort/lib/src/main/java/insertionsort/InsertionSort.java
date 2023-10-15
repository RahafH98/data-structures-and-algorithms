package insertionsort;

public class InsertionSort {
    public static int[] insertionSort(int[] input) {
        int[] sorted = new int[input.length];
        sorted[0] = input[0];

        for (int i = 1; i < input.length; i++) {
            insert(sorted, input[i], i);
        }

        return sorted;
    }

    private static void insert(int[] sorted, int value, int i) {
        while (i > 0 && value < sorted[i - 1]) {
            sorted[i] = sorted[i - 1];
            i--;
        }
        sorted[i] = value;
    }

    public static void main(String[] args) {
        int[] inputArray = {8, 4, 23, 42, 16, 15};
        int[] sortedArray = insertionSort(inputArray);

        System.out.print("Sorted Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}


// in this implementation we have  a insertionSort method to sort the input array and an insert method to insert elements into the sorted array.
