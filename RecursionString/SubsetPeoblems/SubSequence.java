import java.util.ArrayList;

public class SubSequence {

  public static void main(String[] args) {

    // Method 1 → returns new ArrayList from every call
    // System.out.println(subSeqReturn2("", "abc"));

    // Method 2 → same ArrayList is passed everywhere
    ArrayList<String> list = new ArrayList<>();
    subSeqReturn1("", "ab", list);
    System.out.println(list);

    //
    subSeq("", "ab");
  }

  // -----------------------------------------------------
  // METHOD 1 : Just printing subsets (no ArrayList used)
  // -----------------------------------------------------
  static void subSeq(String p, String up) {

    // Base condition:
    // when unprocessed string becomes empty,
    // current processed string is one subset
    if (up.length() == 0) {
      System.out.printf("{%s}, ", p);
      return;
    }

    char ch = up.charAt(0);

    // Include current character
    subSeq(p + ch, up.substring(1));

    // Exclude current character
    subSeq(p, up.substring(1));
  }

  // -----------------------------------------------------
  // METHOD 2 : Using SAME ArrayList (passed as argument)
  // -----------------------------------------------------
  static ArrayList<String> subSeqReturn1(String p, String up,
      ArrayList<String> list) {

    // Base condition
    if (up.isEmpty()) {
      list.add(p); // adding element into ArrayList
      return list; // returning same list reference
    }

    char ch = up.charAt(0);

    // Include character
    // list is passed, so result directly stored in same list
    subSeqReturn1(p + ch, up.substring(1), list);

    // Exclude character
    // again same list is used
    return subSeqReturn1(p, up.substring(1), list);
  }

  // -----------------------------------------------------
  // METHOD 3 : Each call CREATES its own ArrayList
  // (Most important to understand recursion return)
  // -----------------------------------------------------
  static ArrayList<String> subSeqReturn2(String p, String up) {

    // STEP 1:
    // Create a new ArrayList for THIS function call
    ArrayList<String> list = new ArrayList<>();

    // Base condition
    if (up.isEmpty()) {
      // add current subset into list
      list.add(p);

      // Return this list to previous function call
      return list;
    }

    char ch = up.charAt(0);

    // STEP 2:
    // INCLUDE case
    // recursion returns a list containing subsets
    ArrayList<String> ansLeft = subSeqReturn2(p + ch, up.substring(1));

    // Add all elements from left answer into current list
    list.addAll(ansLeft);

    // STEP 3:
    // EXCLUDE case
    ArrayList<String> ansRight = subSeqReturn2(p, up.substring(1));

    // Add all elements from right answer into current list
    list.addAll(ansRight);

    // STEP 4:
    // return combined list to previous call
    return list;
  }
}
