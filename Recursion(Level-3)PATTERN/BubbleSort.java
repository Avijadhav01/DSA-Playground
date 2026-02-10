import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 11, 1, 5, 2, 8, 3, 0, 4 };
    bubbleSort(arr, arr.length - 1, 0);
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  static void bubbleSort(int[] arr, int row, int col) {
    if (row == 0)
      return;

    if (col < row) {
      if (arr[col] > arr[col + 1]) {
        swap(arr, col, col + 1);
      }
      bubbleSort(arr, row, col + 1);
    } else {
      bubbleSort(arr, row - 1, 0);
    }
  }
}
