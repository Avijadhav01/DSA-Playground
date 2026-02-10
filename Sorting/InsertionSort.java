import java.util.Arrays;

/*

======================= INSERTION SORT =======================

Insertion Sort is a simple sorting algorithm that works the
same way as arranging playing cards in your hand.

You pick one element at a time and insert it into its
correct position in the already sorted part of the array.

---------------------------------------------------------------

WORKING IDEA:

The array is divided into two parts:

1. Sorted Part   -> Left side of the array
2. Unsorted Part -> Right side of the array

At every step:
- Take the first element from the unsorted part.
- Compare it with elements in the sorted part.
- Move it to its correct position.

---------------------------------------------------------------

EXAMPLE: Array: [50, 20, 40, 30, 10]

Pass 1:
[20, 50, 40, 30, 10]

Pass 2:
[20, 40, 50, 30, 10]

Pass 3:
[20, 30, 40, 50, 10]

Pass 4:
[10, 20, 30, 40, 50]

---------------------------------------------------------------

TIME COMPLEXITY:

Best Case    : O(N) (When array is already sorted)
Average Case : O(N^2)
Worst Case   : O(N^2) (When array is reverse sorted)

---------------------------------------------------------------
SPACE COMPLEXITY: O(1)(In-place sorting algorithm)
---------------------------------------------------------------

IMPORTANT CHARACTERISTICS:

✔ Stable Sort (maintains relative order of equal elements)
✔ Adaptive (fast for nearly sorted arrays)
✔ Simple to implement
✔ Used for small datasets

---------------------------------------------------------------

INSERTION SORT vs BUBBLE SORT:

* Bubble Sort: Repeatedly swaps adjacent elements.
* Insertion Sort: Inserts element directly into correct position in sorted portion.

---------------------------------------------------------------

NOTE ABOUT THIS IMPLEMENTATION:

This version uses SWAPPING to move elements left.
An optimized version uses SHIFTING instead of multiple swaps, which reduces assignments.

===============================================================*/

public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = { 50, 20, 40, 30, 10 };
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void sort(int[] arr) {

    // start from index 1 because first element is already considered sorted
    for (int i = 1; i < arr.length; i++) {

      // move current element towards left until it reaches correct position
      for (int j = i; j > 0; j--) {

        if (arr[j] < arr[j - 1])
          swap(arr, j, j - 1);
        else
          break; // stop when correct position found
      }
    }
  }
}
