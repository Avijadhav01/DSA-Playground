import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 50, 20, 40, 30, 10 };
    Sort(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void Sort(int[] array) {

    int n = array.length;

    for (int i = 0; i < n - 1; i++) {

      boolean swapped = false; // To check whether the swap was happened or not

      for (int j = 0; j < n - 1 - i; j++) {
        if (array[j] > array[j + 1]) {

          // swap the elements
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;

          swapped = true; // set true
        }
      }
      if (!swapped) // if swapped = false, means array is sorted in last pass or already sorted.
        break; // stop sorting
    }
  }
}