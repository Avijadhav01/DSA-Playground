import java.util.Arrays;

/*
 * -------------------- SELECTION SORT INFORMATION --------------------
 *
 * Selection Sort is a simple comparison-based sorting algorithm.
 *
 * Working:
 * 1. The array is divided into two parts:
 *    - Sorted part (left side)
 *    - Unsorted part (right side)
 *
 * 2. In each pass, the smallest element from the unsorted
 *    part is selected.
 *
 * 3. That smallest element is swapped with the first element
 *    of the unsorted part.
 *
 * 4. After every pass, one element is placed at its correct position.
 *
 * Example:
 * [50, 0, -20, 40, 30, 10]
 * Pass 1 -> [-20, 0, 50, 40, 30, 10]
 * Pass 2 -> [-20, 0, 50, 40, 30, 10]
 * Pass 3 -> [-20, 0, 10, 40, 30, 50]
 *
 * Time Complexity:
 * Best Case   : O(n^2)
 * Average Case: O(n^2)
 * Worst Case  : O(n^2)
 *
 * Space Complexity:
 * O(1) (In-place sorting)
 *
 * Note:
 * Selection sort performs fewer swaps than bubble sort,
 * but it does not stop early even if the array is already sorted.
 * ---------------------------------------------------------------------
 */

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = { 50, 0, -20, 40, 30, 10 };
    sort(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  static void sort(int[] arr) {

    int n = arr.length;
    // This is for passes
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;

      // This is for comparison
      for (int j = i + 1; j < n; j++) {
        if (arr[minIndex] > arr[j])
          minIndex = j;
      }

      // Swap smallest element with current index
      swap(arr, minIndex, i);
    }
  }
}
