public class NonRepeatingNo {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 2, 5, 4, 4, 3 };
    evenRepeating(arr);

    int[] arr2 = { 2, 3, 2, 2, 9, 4, 4, 3, 4, 3 };
    oddRepeating(arr2, 3); // 3 repeating count

  }

  static void evenRepeating(int[] arr) {
    int unique = 0;
    for (int i = 0; i < arr.length; i++) {
      unique ^= arr[i];
    }
    System.out.println("Non Repeating Element is " + unique);
  }

  static void oddRepeating(int[] arr, int n) {
    int result = 0;

    for (int bit = 0; bit < arr.length; bit++) {
      int count = 0;
      for (int num : arr) {
        if (((num & (1 << bit)) != 0)) {
          count++;
        }
      }

      if ((count % n) != 0) {
        result = result | (1 << bit);
      }
    }
    System.out.println(result);
  }
}
