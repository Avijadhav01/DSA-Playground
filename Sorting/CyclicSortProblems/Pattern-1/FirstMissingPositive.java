
// Leetcode P.No. 41 - first Missing positive Number
public class FirstMissingPositive {

  public static void main(String[] args) {
    int[] arr = { 3, 4, -1, 1 }; // 2 is missing
    int result = firstMissingPositive(arr);
    System.out.println(result);
  }

  // Swap method
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int firstMissingPositive(int[] nums) {
    int i = 0;
    int n = nums.length;

    // First sort by cyclic sort
    while (i < n) {
      int cIndex = nums[i] - 1;

      if (cIndex < n && cIndex >= 0 && nums[i] != nums[cIndex]) {
        swap(nums, i, cIndex);
      } else {
        i++; // Move to next index
      }
    }

    for (int index = 0; index < n; index++) {
      if (nums[index] == index + 1)
        continue;

      return index + 1;
    }
    return n + 1;
  }
}
