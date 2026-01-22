import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = { 50, 20, 40, 30, 10 };
    Sort(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void Sort(int[] array) {

    int n = array.length;

    for (int i = 1; i < n; i++) {

      for (int j = i; j > 0; j--) {
        if (array[j] < array[j - 1]) {
          swap(array, j, j - 1);
        } else {
          break;
        }
      }

    }
  }
}
