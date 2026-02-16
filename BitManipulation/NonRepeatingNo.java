public class NonRepeatingNo {

  public static void main(String[] args) {

    int[] arr = { 2, 3, 2, 5, 4, 4, 3 };
    evenRepeating(arr);

    int[] arr2 = { 2, 3, 2, 2, 9, 4, 4, 3, 4, 3 };
    oddRepeating(arr2, 3); // 3 repeating count
  }

  // ------------------------------------------------------------
  // LeetCode 136 - Single Number
  //
  // Idea:
  // Every number appears twice except one.
  // XOR of same numbers becomes 0.
  // XOR with 0 keeps number unchanged.
  //
  // So all repeating elements cancel each other,
  // leaving only the non-repeating element.
  //
  // Example: 2 ^ 3 ^ 2 ^ 5 ^ 4 ^ 4 ^ 3 = 5
  //
  // Time Complexity : O(n)
  // Space Complexity : O(1)
  static void evenRepeating(int[] arr) {
    int unique = 0;

    for (int i = 0; i < arr.length; i++) {
      unique ^= arr[i];
    }

    System.out.println("Non Repeating Element is " + unique);
  }

  // ------------------------------------------------------------
  // Find element when every other element repeats 'n' times
  //
  // Idea:
  // Count number of set bits at every bit position.
  // If count is not divisible by repeating frequency (n),
  // that bit belongs to the unique number.
  //
  // Works because repeating numbers contribute bits
  // in multiples of n.
  //
  // Time Complexity : O(32 * n) ≈ O(n)
  // Space Complexity : O(1)
  static void oddRepeating(int[] arr, int n) {

    int result = 0;

    // checking every bit position
    for (int bit = 0; bit < 32; bit++) {

      int count = 0;
      // count set bits at current position
      for (int num : arr) {
        if ((num & (1 << bit)) != 0) {
          count++;
        }
      }

      // if count is not multiple of n,
      // this bit belongs to unique number
      if ((count % n) != 0) {
        result = result | (1 << bit);
      }
    }

    System.out.println(result);
  }
}
