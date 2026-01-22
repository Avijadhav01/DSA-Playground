import java.util.Scanner;

public class InfiniteArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = { 3, 5, 7, 9, 11, 13, 16, 18, 19, 24, 26, 27, 29, 31, 36 };
    int target = sc.nextInt();

    int result = binarySearch(array, target);
    System.out.println(result);

    sc.close();
  }

  // first find the range
  static int[] findingRange(int[] arr, int target) {
    // first starts with a box of size 2
    int start = 0;
    int end = 1;

    // condition for target to lie in the range
    while (target > arr[end]) {
      int newStart = end + 1;
      // double the box value
      // end = previous end + sizeOfBox*2
      end = end + (end - start + 1) * 2;
      start = newStart;
    }
    return new int[] { start, end };
  }

  static int binarySearch(int[] array, int target) {
    //
    int[] range = findingRange(array, target);

    int left = range[0];
    int right = range[1];

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (array[mid] == target) {
        return mid;
      } else if (target < array[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

}
