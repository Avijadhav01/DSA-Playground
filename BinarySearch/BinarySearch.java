import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter target: ");
    int target = in.nextInt();

    // Example array (ascending or descending)
    // int[] arr = { 90, 80, 60, 40, 20, 10 }; // descending
    int[] arr = { 10, 20, 40, 60, 80, 90 }; // ascending

    int result = search(target, arr);
    System.out.println(result);

    in.close();
  }

  static int search(int target, int[] array) {

    int left = 0;
    int right = array.length - 1;

    boolean isAsc = array[left] < array[right];

    while (left <= right) {
      int mid = (left + right) / 2;

      if (array[mid] == target) {
        return mid;
      }

      if (isAsc) {
        if (target < array[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (target < array[mid]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}
