## Merge Sort 

## Explanation 
Merge Sort is a widely-used sorting algorithm that employs a divide-and-conquer strategy to sort an array or list. In this article, we will first walk through the provided pseudocode, visually tracing the algorithm's execution with a sample array. After that, we'll implement the Merge Sort algorithm in Java and provide a set of working tests.


## Pseudocode Explanation 
- Merge Sort (Mergesort)
The Merge Sort algorithm begins by dividing the array into two halves until we reach individual elements. Then, it merges and sorts these smaller parts back together.

1. First, it checks if the array's length n is greater than 1. If n > 1, we proceed; otherwise, the array is already sorted.
2. We find the middle index mid of the array.
3. We split the array into two subarrays, left and right, from the beginning to mid and from mid to the end, respectively.
4. Recursively call Mergesort on the left and right subarrays.
5. Finally, we merge the sorted left and right subarrays back into the original array arr using the Merge function.

- Merge
The Merge function is responsible for combining two sorted subarrays into a single sorted array.

1. Initialize three pointers, i, j, and k, to 0. These will be used to traverse the left, right, and arr arrays, respectively.
2. While both i and j are within their respective array bounds, compare the elements at left[i] and right[j.
If left[i] is less than or equal to right[j], place left[i] into arr[k] and increment i.
Otherwise, place right[j] into arr[k] and increment j.
3. Increment k after each placement.
4. After exiting the loop, if there are remaining elements in either left or right, copy them into the arr.


## Visual Step Through with Sample Array

Let's walk through the Merge Sort algorithm using the input array [8, 4, 23, 42, 16, 15].

- Initial State
Input array: [8, 4, 23, 42, 16, 15]

1. Mergesort is called with the entire array.

2. It divides the array into left and right subarrays.

left subarray: [8, 4, 23]
right subarray: [42, 16, 15]

- Recursive Steps
We now recursively apply Mergesort on both left and right subarrays.

Sorting left subarray
Input array: [8, 4, 23]

1. Mergesort is called with the left subarray.

2. It further divides it into left and right subarrays.

left subarray: [8]
right subarray: [4, 23]

3. Recursively sort the left and right subarrays. The left subarray is already sorted, and the right subarray is further divided.

left subarray: [4]
right subarray: [23]

4. Recursively sort the left and right subarrays. Both are single elements and are already sorted.

left subarray: [4]
right subarray: [23]

5. Merge the sorted left and right subarrays back into [4, 23].

- Sorting right subarray
Input array: [42, 16, 15]

The steps are similar to the ones applied to the left subarray.

- Merge the sorted left and right subarrays back into [15, 16, 42].
Merging left and right into arr
Input arrays:
left: [4, 23]
right: [15, 16, 42]

Merge the sorted left and right subarrays back into the original array arr.
Resulting sorted array: [4, 15, 16, 23, 42]


