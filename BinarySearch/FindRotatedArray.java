// Binary search letcode 33

import java.util.Scanner;

// Find IN Sorted Rotated Array
public class FindRotatedArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
    int target = sc.nextInt();

    int pivot = pivotIndex(arr);

    System.out.println(pivot);

    int leftSideIndex = Search(arr, target, 0, pivot);
    if (leftSideIndex != -1)
      System.out.println(leftSideIndex);

    int rightIndex = Search(arr, target, pivot + 1, arr.length - 1);
    if (rightIndex != -1)
      System.out.println(rightIndex);

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

  static int Search(int[] nums, int target, int left, int right) {

    while (left <= right) {
      int mid = left + (right - left) / 2;

      int val = nums[mid];

      if (val == target)
        return mid;
      else if (target < val)
        right = mid - 1;
      else
        left = mid + 1;

    }

    return -1;
  }

}