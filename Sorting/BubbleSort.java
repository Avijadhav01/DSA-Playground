import java.util.Arrays;

/*
 * -------------------- BUBBLE SORT INFORMATION --------------------
 *
 * Bubble Sort is a simple comparison-based sorting algorithm.
 *
 * Working:
 * 1. Adjacent elements are compared with each other.
 * 2. If they are in the wrong order, they are swapped.
 * 3. After each pass, the largest element moves to the end
 *    of the array (like a bubble rising to the top).
 * 4. This process continues until the array becomes sorted.
 *
 * Optimization Used Here:
 * - A boolean variable 'sorted' is used.
 * - If no swapping happens in a pass, it means the array
 *   is already sorted, so the algorithm stops early.
 *
 * Example:
 * [50, 20, 40, 30, 10]
 * Pass 1 -> [20, 40, 30, 10, 50]
 * Pass 2 -> [20, 30, 10, 40, 50]
 * Pass 3 -> [20, 10, 30, 40, 50]
 * Pass 4 -> [10, 20, 30, 40, 50]
 *
 * Time Complexity:
 * Best Case   : O(n)   (when array is already sorted)
 * Average Case: O(n^2)
 * Worst Case  : O(n^2)
 *
 * Space Complexity:
 * O(1) (In-place sorting)
 *
 * Note:
 * Bubble sort is easy to understand but inefficient for
 * large datasets compared to advanced sorting algorithms.
 * ------------------------------------------------------------------
 */

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 50, 20, 40, 30, 10 };
    sort(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    int n = arr.length - 1;

    // for passes
    for (int i = 0; i < n; i++) {
      boolean sorted = false;

      // for comparisons
      for (int j = 0; j < n - i; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          sorted = true;
        }
      }

      // if no swap happened, array is already sorted
      if (!sorted)
        return;
    }
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }
}
