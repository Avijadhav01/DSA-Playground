import java.util.Arrays;

// Leetcode P.No. 645 - Set Mismatch
public class SetMismatch {

  public static void main(String[] args) {
    int[] arr = { 3, 1, 3, 4 };
    int[] result = findErrorNums(arr);
    System.out.println(Arrays.toString(result));
  }

  // Swap method
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int[] findErrorNums(int[] nums) {
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

    int[] ans = { -1, -1 };
    // find and return duplicate
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != j + 1) {
        ans[0] = nums[j];
        ans[1] = j + 1;
        return ans;
      }
    }
    return ans;
  }
}
