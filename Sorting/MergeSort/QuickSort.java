import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] array = { 5, 4, 3, 2, 1 };
    // sort(array, 0, array.length - 1);
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
  }

  static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  static void sort(int[] arr, int low, int hi) {
    if (low >= hi) {
      return;
    }

    int s = low;
    int e = hi;
    int pivot = arr[s + (e - s) / 2];

    while (s <= e) {

      while (arr[s] < pivot) {
        s++;
      }

      while (arr[e] > pivot) {
        e--;
      }

      if (s <= e) {
        swap(arr, s, e);
        s++;
        e--;
      }
    }

    // After ^ while loop e=mid-1 & s=mid+1 & mid=pivot which at its correct index
    sort(arr, low, e);
    sort(arr, s, hi);
  }
}