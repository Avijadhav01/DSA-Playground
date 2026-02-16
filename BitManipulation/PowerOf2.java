public class PowerOf2 {
  public static void main(String[] args) {
    int n = 16;
    System.out.println(isPowerOfTwo(n));
  }

  // ------------------------------------------------------------
  // LeetCode 231 - Power of Two
  //
  // Idea:
  // A power of two has only one set bit in binary.
  //
  // Example:
  // 16 = 10000
  // 16 & 15 = 10000 & 01111 = 00000
  //
  // If n & (n - 1) == 0, then only one set bit exists.
  //
  // Time Complexity : O(1)
  // Space Complexity : O(1)
  static boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
  }
}
