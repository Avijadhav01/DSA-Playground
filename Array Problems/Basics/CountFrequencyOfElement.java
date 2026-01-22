import java.util.Scanner;

public class CountFrequencyOfElement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = { 1, 9, 0, 1, 7, 2, 0 };
    System.out.print("Enter number: ");
    int numToCheck = sc.nextInt();

    int frequency = Search(numToCheck, array);
    if (frequency == 0) {
      System.out.println("Element not found in array");
    } else {
      System.out.println("Element appears " + frequency + " times");
    }
    sc.close();
  }

  static int Search(int ele, int[] arr) {

    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ele) {
        count++;
      }
    }

    return count;
  }
}
