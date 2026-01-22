import java.util.Arrays;

public class MoveAllZerotoEnd {

  public static void main(String[] args) {

    int[] array = { 1, 0, 0, 2, 3, 0, 6 };

    moveZeroToEnd(array);
    System.out.println("After moving : " + Arrays.toString(array));
  }

  static void moveZeroToEnd(int[] arr) {
    int j = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[j++] = arr[i];
      }
    }

    while (j < arr.length) {
      arr[j++] = 0;
    }
  }
}
