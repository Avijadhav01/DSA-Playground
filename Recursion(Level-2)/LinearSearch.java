import java.util.ArrayList;

public class LinearSearch {

  public static void main(String[] args) {

    int[] array = { 1, 3, 2, 2, 5, 7 };

    // Finds only first occurrence of target
    System.out.println("Only first index : "
        + linearSearch(array, 2, 0));

    ArrayList<Integer> list = new ArrayList<>();

    // Finds all occurrences (same list passed)
    System.out.println("All occurrences (passing list) : "
        + linearAllSearch(array, 2, 0, list));

    // Finds all occurrences (list created inside recursion)
    System.out.println("All occurrences (new list each call) : "
        + linearAllSearch2(array, 2, 0));
  }

  // ✅ Interview Note
  // Iterative linear search is preferred in real projects
  // because recursion uses extra stack space.

  /*
   * ----------------------------------------------------------
   * FUNCTION 1 : Find first occurrence using recursion
   * ----------------------------------------------------------
   * Time Complexity : O(n)
   * Space Complexity : O(n) (recursive stack)
   */
  static int linearSearch(int[] arr, int target, int i) {

    // Base condition
    if (i >= arr.length)
      return -1;

    if (arr[i] == target)
      return i;

    // Return result from next recursive call
    return linearSearch(arr, target, i + 1);
  }

  /*
   * ----------------------------------------------------------
   * FUNCTION 2 : Find all occurrences (same list passed)
   * ----------------------------------------------------------
   * Time Complexity : O(n)
   * Space Complexity : O(n)
   * - recursive stack space
   */
  static ArrayList<Integer> linearAllSearch(int[] arr, int target, int i, ArrayList<Integer> list) {

    // Base condition
    if (i >= arr.length)
      return list;

    if (arr[i] == target)
      list.add(i);

    // Same list travels through all recursive calls
    // Final list is returned back through each call
    return linearAllSearch(arr, target, i + 1, list);
  }

  /*
   * ----------------------------------------------------------
   * FUNCTION 3 : Find all occurrences (new list each call)
   * ----------------------------------------------------------
   * Time Complexity : O(n)
   * Space Complexity : O(n)
   *
   * Important Concept:
   * Each recursive call creates its own list
   * and merges results while returning.
   */
  static ArrayList<Integer> linearAllSearch2(int[] arr, int target, int i) {
    // Each call creates a new list
    ArrayList<Integer> list = new ArrayList<>();

    // Base condition
    if (i == arr.length)
      return list;

    // This will contain amswer for that function only
    if (arr[i] == target)
      list.add(i);

    // Get answer from remaining array
    ArrayList<Integer> ansFromBelowCalls = linearAllSearch2(arr, target, i + 1);

    // Returning Part (Important)
    // Combine current result with result from below calls
    list.addAll(ansFromBelowCalls);

    // Final combined list is returned upward
    return list;
  }

  // ✅ More memory usage
  // ✅ More object creation
  // ✅ Slightly slower
  // That is why in real production code, the first approach is preferred.

  // ✅ Then Why Do We Use This Approach?

  // Because this version teaches an important recursion pattern.
  // That pattern is: Answer = My Work + Answer from Smaller Problem
}
