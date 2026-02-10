import java.util.Arrays;
/*
======================== CYCLIC SORT ========================

Cyclic Sort is a special sorting algorithm used when:

    1. The array contains numbers in a fixed range.
      Example:
      - Numbers from 1 to N  OR
      - Numbers from 0 to N

    2. Each number should be placed at its correct index.

---------------------------------------------------------------

KEY IDEA:

Every number has a CORRECT INDEX.

If numbers are from 1 to N:
    correct index of value x = x - 1

If numbers are from 0 to N:
    correct index of value x = x

We repeatedly swap elements until every element
reaches its correct index.

---------------------------------------------------------------

WHY "CYCLIC" SORT?

Because an element may go through multiple swaps
in a cycle until it reaches its correct position.

---------------------------------------------------------------

TIME COMPLEXITY:
    Best Case  : O(N)
    Average     : O(N)
    Worst Case  : O(N)

Each element is swapped at most once.

SPACE COMPLEXITY:
    O(1)  (In-place sorting)

---------------------------------------------------------------

IMPORTANT CONDITIONS:

1. Elements must be in a known range.
2. Works best when numbers are continuous.
3. Mostly used in problems like:
   - Missing number
   - Find duplicate number
   - Find all missing numbers
   - First missing positive

---------------------------------------------------------------

DIFFERENCE FROM OTHER SORTS:

Bubble / Selection / Insertion Sort:
    Compare elements and move step by step.

Cyclic Sort:
    Directly places element at its correct index.

===============================================================
*/

public class CyclicSort {

  public static void main(String[] args) {

    // Example 1: Numbers from 1 to N
    int[] arr = { 3, 1, 4, 5, 2 };
    sortOneToN(arr);
    System.out.println(Arrays.toString(arr));

  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // ------------------------------------------------------------
  // CYCLIC SORT FOR NUMBERS FROM 1 TO N
  // Example: [3,1,4,5,2]
  // Correct index = value - 1
  // ------------------------------------------------------------
  static void sortOneToN(int[] array) {
    int i = 0;
    int n = array.length;

    while (i < n) {

      // correct index where current element should go
      int correctIndex = array[i] - 1;

      // if element is not at correct index, swap
      if (array[i] != array[correctIndex]) {
        swap(array, i, correctIndex);
      }
      // otherwise move to next index
      else {
        i++;
      }
    }
  }

}
