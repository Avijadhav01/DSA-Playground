import java.util.Scanner;

public class SecondLargest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = { 4, 7, 5, 5, 5, 2, 6, 1 };

    int Num = secondLargestNum(array);
    System.out.print("\nSecond largest element  " + Num);

    sc.close();
  }

  static int secondLargestNum(int[] arr) {

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }

    return secondLargest;
  }
}
