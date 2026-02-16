import java.util.Arrays;

public class InPlaceMerge {

  public static void main(String[] args) {
    int[] array = { 4, 6, 3, 2, 0, 9 };

    mergeSort(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  static void mergeSort(int[] arr, int s, int e) {

    // Base condition:
    // When the portion has only one element,
    // it is already sorted so no further work is needed.
    if (s >= e)
      return;

    // Divide step:
    // Find middle and split current portion into two halves.
    int mid = s + (e - s) / 2;

    // Recursively sort left half.
    // This keeps dividing until single elements remain.
    mergeSort(arr, s, mid);

    // Recursively sort right half.
    mergeSort(arr, mid + 1, e);

    // Conquer step:
    // Merge two already sorted halves into one sorted part.
    // Actual sorting happens during merging.
    merge(arr, s, mid, e);
  }

  static void merge(int[] arr, int s, int mid, int e) {

    int[] temp = new int[e - s + 1];

    // i -> current element in left sorted half
    // j -> current element in right sorted half
    // k -> position in temporary merged array
    int i = s;
    int j = mid + 1;
    int k = 0;

    // Compare elements from both halves and place the smaller one into merged
    // array.
    // This ensures final order remains sorted.
    while (i <= mid && j <= e) {
      if (arr[i] < arr[j])
        temp[k++] = arr[i++];
      else
        temp[k++] = arr[j++];
    }

    // If left half still has elements,
    // they are already sorted so copy directly.
    while (i <= mid)
      temp[k++] = arr[i++];

    // If right half still has elements,
    // copy them directly.
    while (j <= e)
      temp[k++] = arr[j++];

    // Copy merged sorted values back into original array
    // so that upper recursive calls receive sorted halves.
    for (int x = 0; x < temp.length; x++) {
      arr[s + x] = temp[x];
    }
  }
}
