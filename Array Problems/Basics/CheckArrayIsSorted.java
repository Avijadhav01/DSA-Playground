import java.util.Scanner;

public class CheckArrayIsSorted {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = { 1, 2, 2, 3, 3, 5 };

    if (isSorted(array)) {
      System.out.println("Array is sorted");
    } else {
      System.out.println("Not sorted");
    }

    sc.close();
  }

  static boolean isSorted(int[] arr) {

    boolean ascending = true;
    boolean descending = true;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        ascending = false;
      }

      if (arr[i] < arr[i + 1]) {
        descending = false;
      }
    }
    return ascending || descending;
  }
}
