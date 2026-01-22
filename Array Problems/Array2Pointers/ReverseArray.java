import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 7, 5, 9 };

    reverse(arr);
    System.out.println("After reverse " + Arrays.toString(arr));
  }

  static void reverse(int[] array) {

    int size = array.length;

    int front = 0;
    int last = size - 1;

    for (int i = 0; i < size / 2; i++) {
      int temp = array[front];
      array[front] = array[last];
      array[last] = temp;

      front++;
      last--;
    }
  }
}
