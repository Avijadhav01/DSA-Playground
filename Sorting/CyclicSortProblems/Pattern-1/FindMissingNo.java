
// Leetcode P.No. 268 - Missing Number
public class FindMissingNo {

  public static void main(String[] args) {
    int[] arr = { 5, 3, 2, 1, 0 }; // 4 is missing
    int result = missingNumber(arr);
    System.out.println(result);
  }

  // Swap method
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int missingNumber(int[] nums) {
    int i = 0;
    int n = nums.length;

    // First sort by cyclic sort
    while (i < n) {
      int cIndex = nums[i];

      if (cIndex != n && nums[i] != nums[cIndex]) { // if correct Index is equal to n /Size (outOfBoundIndex) so skip it
        swap(nums, i, cIndex);
      } else {
        i++; // Move to next index
      }
    }

    for (int index = 0; index < n; index++) {
      if (nums[index] == index)
        continue; // if element at index == index, Skip this iteration

      return index;
    }

    return n;
  }

}
