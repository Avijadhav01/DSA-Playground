import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode P.No. 448 - Find All Numbers Disappeared in an Array

public class MissingRangeNos {

  public static void main(String[] args) {

    int[] nums = { 1, 1 };

    List<Integer> myList = findDisappearedNumbers(nums);
    System.out.println(myList);
  }

  // Swap method
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static List<Integer> findDisappearedNumbers(int[] nums) {
    int i = 0;
    int n = nums.length;

    // First sort by cyclic sort
    while (i < n) {
      int cIndex = nums[i] - 1;

      if (cIndex != n && nums[i] != nums[cIndex]) {
        swap(nums, i, cIndex);
      } else {
        i++; // Move to next index
      }
    }

    System.out.println(Arrays.toString(nums));

    List<Integer> list = new ArrayList<>();
    for (int index = 0; index < n; index++) {
      if (nums[index] == index + 1)
        continue; // if element at index == index, Skip this iteration

      list.add(index + 1);
    }

    return list;
  }
}
