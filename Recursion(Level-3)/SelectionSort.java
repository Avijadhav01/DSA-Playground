import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = { 11, 1, 5, 2, 8, 3, 0, 4 };
    selectionSort(arr, 0, 1, 0);
    System.out.println(Arrays.toString(arr));

  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  static void selectionSort(int[] arr, int row, int col, int minIndex) {
    if (row == arr.length - 1)
      return;

    if (col <= arr.length - 1) {
      if (arr[minIndex] >= arr[col])
        selectionSort(arr, row, col + 1, col);
      else
        selectionSort(arr, row, col + 1, minIndex);
    } else {
      swap(arr, row, minIndex);
      selectionSort(arr, row + 1, row + 2, row + 1);
    }

  }

}
