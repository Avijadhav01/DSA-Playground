import java.util.Arrays;

public class CyclicSort {

  public static void main(String[] args) {
    int[] arr = { 3, 1, 4, 5, 2 };
    Sort(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void Sort(int[] array) {
    int i = 0;
    int n = array.length;

    while (i < n) {
      int cIndex = array[i] - 1;

      if (array[i] != array[cIndex]) {
        swap(array, i, cIndex);
      } else {
        i++;
      }
    }
  }
}
