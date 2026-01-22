import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = { 1, 9, 4, 7, 2, 0 };
    System.out.print("Enter number to search in array : ");
    int numToSearch = sc.nextInt();

    int index = Search(numToSearch, array);

    System.out.print("\nElement is present in array at index " + index);

    sc.close();
  }

  static int Search(int ele, int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ele) {
        return i;
      }
    }

    return -1;
  }

}
