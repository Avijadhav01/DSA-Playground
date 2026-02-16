public class NthMagicNo {

  public static void main(String[] args) {
    nthMagicNo(5, 6);
  }

  // ------------------------------------------------------------
  // Nth Magic Number
  //
  // Idea:
  // A magic number is formed using powers of 5.
  // Instead of converting n directly into powers,
  // we use binary representation of n.
  //
  // Each bit of n tells whether a particular power
  // of 5 should be included in the sum or not.
  //
  // Example:
  // n = 6 -> binary = 110
  //
  // positions represent:
  // 5^1, 5^2, 5^3 ...
  //
  // 110 means:
  // (1 * 25) + (1 * 125) = 150
  //
  // So binary digits decide which powers of 5
  // contribute to the final number.
  //
  // This avoids computing powers separately
  // and builds answer efficiently.
  //
  // Time Complexity : O(log n)
  // because we process each bit of n once
  //
  // Space Complexity : O(1)
  static void nthMagicNo(int base, int n) {

    int sum = 0;

    while (n > 0) {

      int bit = n & 1;
      n >>= 1;
      sum = sum + (bit * base);

      // move to next power of 5
      base *= 5;
    }

    System.out.println(sum);
  }
}
