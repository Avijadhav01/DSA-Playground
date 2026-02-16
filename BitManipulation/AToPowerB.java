public class AToPowerB {

  public static void main(String[] args) {
    int base = 3; // 11
    int pow = 3; // 11

    power(base, pow);
  }

  // ------------------------------------------------------------
  // Binary Exponentiation / Fast Power
  // (Related to LeetCode 50 - Pow(x, n))
  //
  // Idea:
  // Instead of multiplying base 'pow' times,
  // we use binary representation of power.
  // If current bit of power is 1 → multiply result.
  // Each step squares the base and halves power.
  //
  // Time Complexity : O(log n)
  // Space Complexity : O(1)
  static void power(int base, int pow) {
    int result = 1;

    while (pow > 0) {

      // if current bit of power is 1
      if ((pow & 1) == 1) {
        result = result * base;
      }

      // square the base for next bit
      base *= base;

      // move to next bit of power
      pow >>= 1;
    }

    System.out.println(result);
  }
}
