import java.util.Scanner;

public class RotationCount {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = { 4, 5, 6, 7, 1, 2 };

    int pivot = pivotIndex(arr);

    if (pivot != -1) {
      System.out.println(arr.length - 1 - pivot);
    }
    sc.close();
  }

  static int pivotIndex(int[] nums) {

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;

      // Case 1
      if (mid < right && nums[mid] > nums[mid + 1])
        return mid;
      // Casee 2
      else if (mid > left && nums[mid] < nums[mid - 1])
        return mid - 1;
      // Case 3
      else if (nums[mid] <= nums[left])
        right = mid - 1;
      // case 4
      else if (nums[mid] > nums[left])
        left = mid + 1;
    }

    return -1;
  }
}