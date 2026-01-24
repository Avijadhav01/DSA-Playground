
// Leetcode P.No. 287 - Find the Duplicate Number
public class DuplicateNumber {

  public static void main(String[] args) {
    int[] arr = { 3, 1, 3, 4, 2 };
    int result = findDuplicate(arr);
    System.out.println(result);
  }

  // Swap method
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int findDuplicate(int[] nums) {
    int i = 0;
    int n = nums.length;

    // Cyclic sort
    while (i < n) {
      int cIndex = nums[i] - 1;
      if (nums[i] != nums[cIndex]) {
        swap(nums, i, cIndex);
      } else {
        i++;
      }
    }

    // find and return duplicate
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != j + 1)
        return nums[j];
    }

    return 0;
  }
}