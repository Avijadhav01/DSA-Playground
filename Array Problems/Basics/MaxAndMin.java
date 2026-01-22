public class MaxAndMin {

  public static void main(String[] args) {
    int[] arr = { 8, 5, 4, 0, 6, 7, 1 };

    minANDmax(arr);
  }

  static int minANDmax(int[] arr) {
    if (arr.length == 0)
      return -1;

    int max = arr[0];
    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Min Value: " + min + "\nMax Value: " + max);
    return 0;
  }
}
