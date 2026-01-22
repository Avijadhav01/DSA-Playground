public class SecondSmallest {

  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 9, 3 };

    int result = secondSmallest(arr);
    System.out.println("Second samllest is " + result);
  }

  static int secondSmallest(int[] array) {
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < smallest) {
        secondSmallest = smallest;
        smallest = array[i];
      } else if (array[i] < secondSmallest && array[i] != smallest) {
        secondSmallest = array[i];
      }
    }

    return secondSmallest;
  }
}
