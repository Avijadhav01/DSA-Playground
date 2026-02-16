public class SetBits {

  public static void main(String[] args) {
    // noOfSetBits(5); // 101
    rightMostSetBit(0b1011000); // 1010

    // System.out.println(noOfDigitsInAnyBase(20, 10));
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
    int digits = (int) (Math.log(num) / Math.log(base)) + 1;
    return digits;
  }

  /*
   * n & (-n) gives the value of the rightmost set bit.
   * 
   * How it works:
   * -n is the two's complement of n (invert bits + 1)
   * Performing n & (-n) leaves only the rightmost set bit.
   * 
   * Example:
   * n = 1011000
   * -n = 0101000 (two's complement)
   * rsb = 0001000
   * 
   * To find the position of this bit:
   * - rsb contains only one set bit.
   * - Take log base 2 to get its index.
   * - Add 1 because positions start from 1.
   * 
   * Example:
   * rsb = 8 (1000)
   * log2(8) = 3 // Give index of set bit as 1000 ; 1 is at index 3
   * position = 3 + 1 = 4
   */
  static void rightMostSetBit(int n) {

    int rsb = n & (-n);

    int position = (int) (Math.log(rsb) / Math.log(2)) + 1;
    System.out.println(position);
  }

}
