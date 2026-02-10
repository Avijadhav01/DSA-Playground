public class IsArraySorted {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 8 };

    System.out.println("Your version: " + isSortedUser(array, 0));
    System.out.println("Simplified version: " + isSortedSimple(array, 0));
  }

  // ----- Your Version -----
  static boolean isSortedUser(int[] arr, int i) {

    // when last index is reached, all previous elements were in order
    if (i == arr.length - 1)
      return true;

    // check current pair
    boolean isSmall = arr[i] < arr[i + 1];

    // stop immediately if order breaks
    if (!isSmall)
      return false;

    // current pair is correct, check remaining array
    return isSmall && isSortedUser(arr, i + 1);
  }

  // ----- Simplified Version -----
  static boolean isSortedSimple(int[] arr, int i) {

    // if end reached, array is sorted
    if (i == arr.length - 1)
      return true;

    // if any adjacent pair breaks order, array is not sorted
    if (arr[i] >= arr[i + 1])
      return false;

    // continue checking rest of the array
    return isSortedSimple(arr, i + 1);
  }
}
