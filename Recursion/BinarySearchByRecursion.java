public class BinarySearchByRecursion {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 8, 9 };

    int target = 10;
    int result = BinarySearch(arr, target, 0, arr.length - 1);
    System.out.println(result);
  }

  /**
   * Recursive Binary Search Function
   * 
   * @param arr    - The sorted array to search in
   * @param target - The element to search for
   * @param s      - Start index of current search interval
   * @param e      - End index of current search interval
   * @return Index of target if found, else -1
   */

  static int BinarySearch(int[] arr, int target, int s, int e) {

    // Base case: start index crosses end index → element not found
    if (s > e)
      return -1;

    // Calculate middle index to divide the array
    int mid = s + (e - s) / 2;

    // If middle element is the target, return its index
    if (arr[mid] == target) {
      return mid;
    }

    // If middle element is greater than target, search in left half of the array
    if (arr[mid] > target) {
      // Important: always return the recursive call result
      return BinarySearch(arr, target, s, mid - 1);
    }

    // If middle element is smaller than target, search in right half of the array
    return BinarySearch(arr, target, mid + 1, e);
  }
}
