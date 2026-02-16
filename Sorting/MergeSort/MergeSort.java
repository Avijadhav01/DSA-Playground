import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] array = { 4, 6, 3, 2, 0, 9 };

    // mergeSort returns a new sorted array
    int[] result = mergeSort(array);

    System.out.println(Arrays.toString(result));
  }

  static int[] mergeSort(int[] arr) {

    // Base condition:
    // An array with one element is already sorted, so recursion stops here.
    if (arr.length == 1)
      return arr;

    // Divide step: Split array into two halves
    int mid = arr.length / 2;

    // Each recursive call keeps dividing until single element in array lefts
    // Recursively sort left half
    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));

    // Recursively sort right half
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    // Conquer step:
    // Merge two already sorted halves into one sorted array
    return merge(left, right);
  }

  static int[] merge(int[] first, int[] second) {

    // New array to store the merged sorted result
    int[] comb = new int[first.length + second.length];

    // i -> pointer for first array
    // j -> pointer for second array
    // k -> pointer for combined array
    int i = 0;
    int j = 0;
    int k = 0;

    // Compare elements from both arrays and place the smaller element into result
    // This is where actual sorting happens
    while (i < first.length && j < second.length) {
      if (first[i] < second[j])
        comb[k++] = first[i++];
      else
        comb[k++] = second[j++];
    }

    // One array may still have elements left.
    // Since remaining elements are already sorted, just copy them directly.
    while (i < first.length)
      comb[k++] = first[i++];

    while (j < second.length)
      comb[k++] = second[j++];

    // Return merged sorted array
    return comb;
  }
}
