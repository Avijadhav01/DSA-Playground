import java.util.ArrayList;
import java.util.List;

public class SubSet {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 2 };
    System.out.println(subset(nums));
    System.out.println(subsetDuplicate(nums));
  }

  // One time numbers
  static List<List<Integer>> subset(int[] nums) {

    List<List<Integer>> outer = new ArrayList<>();

    // VERY IMPORTANT:
    // We always start with an empty subset []
    // Why?
    // Because every subset is formed by adding elements to an existing subset.
    //
    // If we don't start with empty list, we will have nothing to build from.
    //
    // Mathematically:
    // Total subsets of n elements = 2^n
    // Empty set is always one valid subset.
    outer.add(new ArrayList<>());

    // OUTER LOOP:
    // Runs once for each element in nums array.
    //
    for (int num : nums) {

      int size = outer.size();

      // If currently outer has k subsets, inner loop runs k times.
      // That means:
      // For every existing subset, we create a new subset by adding 'num'.
      //
      for (int i = 0; i < size; i++) {

        // Create a COPY of existing subset.
        // Very important:
        // If we don't copy, we will modify original subset.
        List<Integer> internal = new ArrayList<>(outer.get(i));

        // Add current number to copied subset.
        internal.add(num);

        // Add this new subset to outer list.
        outer.add(internal);
      }
    }

    // Finally return all subsets
    return outer;
  }

  // For duplicate numbers
  static List<List<Integer>> subsetDuplicate(int[] nums) {
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());

    int start = 0;
    int end = 0;

    for (int i = 0; i < nums.length; i++) {
      int size = outer.size();
      start = 0;

      if (i > 0 && nums[i] == nums[i - 1]) {
        start = end + 1;
      }
      end = outer.size() - 1;
      for (int j = start; j < size; j++) {
        List<Integer> internal = new ArrayList<>(outer.get(j));
        internal.add(nums[i]);
        outer.add(internal);
      }
    }
    return outer;
  }

}
