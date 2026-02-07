public class SetBits {

  public static void main(String[] args) {
    noOfSetBits(5); // 101
  }

  // ------------------------------------------------------------
  // LeetCode 191 - Number of 1 Bits
  //
  // Idea:
  // n & (n - 1) removes the rightmost set bit (1)
  // from the binary representation of the number.
  //
  // Each iteration removes one set bit,
  // so the number of iterations equals
  // the number of set bits.
  //
  // Example:
  // 5 = 101
  // 101 & 100 = 100
  // 100 & 011 = 000
  // count = 2
  //
  // More efficient than checking every bit
  // because loop runs only for set bits.
  //
  // Time Complexity : O(number of set bits)
  // Space Complexity : O(1)
  static void noOfSetBits(int n) {

    int count = 0;

    while (n > 0) {
      n = n & (n - 1);
      count++;
    }

    System.out.println(count);
  }

  static void rightMostSetBit() {
    int n = 0b1000;
    int rsb = n & (-n);

    // Bit positions require log base 2
    int position = noOfDigitsInAnyBase(rsb, 2) + 1;
    System.out.println(position);
  }

  // Very Important

  // ------------------------------------------------------------
  // Number of digits of a number in any base
  //
  // Idea:
  // Logarithm tells how many times a number can be divided
  // by the base before becoming less than 1.
  //
  // Formula:
  // digits = floor(log_base(num)) + 1
  //
  // Example:
  // num = 8, base = 2
  // log2(8) = 3
  // digits = 4 (1000)
  //
  // Useful in base conversion and number representation problems.
  //
  // Time Complexity : O(1)
  // Space Complexity : O(1)
  static int noOfDigitsInAnyBase(int num, int base) {
    int digits = (int) (Math.log(num) / Math.log(base) + 1);
    return digits;
  }
}
