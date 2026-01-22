import java.util.Arrays;

public class RemoveDuplicates {

  public static void main(String[] args) {

    int[] array = { 1, 2, 2, 3, 3, 6 };

    int[] result = removeDuplicates(array);
    System.out.println("After removing : " + Arrays.toString(result));
  }

  static int[] removeDuplicates(int[] arr) {
    // Sort first
    Arrays.sort(arr);

    int n = arr.length;
    if (n == 0 || n == 1) {
      return arr; // no duplicates
    }

    int[] temp = new int[n];
    int j = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        temp[j++] = arr[i];
      }
    }

    temp[j++] = arr[n - 1];

    int[] result = new int[j];

    for (int i = 0; i < result.length; i++) {
      result[i] = temp[i];
    }

    return result;
  }
}
