import java.util.ArrayList;
import java.util.List;

// Leetcode P.No. 442 - Find All Duplicate Number
public class AllDuplicateNumbers {

  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    List<Integer> myList = findDuplicates(arr);
    System.out.println(myList);
  }

  // Swap method
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static List<Integer> findDuplicates(int[] nums) {

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

    List<Integer> list = new ArrayList<>();

    // collect the duplicates from array
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != j + 1)
        list.add(nums[j]);
    }

    // return duplicate element list
    return list;
  }
}
