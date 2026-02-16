public class IthBit {

  public static void main(String[] args) {
    // setIthBit(0b1010110, 4);
    // setIthBit(20, 1); // (20)_10 = 10100 ; Ans = 10101

    // resetIthBit(0b1011001, 4);
    // resetIthBit(20, 3); // (20)_10 = 10100 ; Ans = 10000

    // findIthBit(4);
  }

  // ------------------------------------------------------------
  // Set the ith bit to 1
  //
  // Idea:
  // Create a mask where only ith bit is 1.
  // OR operation forces that bit to become 1
  // without affecting other bits.
  //
  // Time Complexity : O(1)
  // Space Complexity : O(1)
  static void setIthBit(int bits, int n) {

    int mask = 1 << (n - 1);
    bits = bits | mask;

    System.out.println(Integer.toBinaryString(bits));
  }

  // ------------------------------------------------------------
  // Reset the ith bit to 0
  //
  // Idea:
  // Create mask with ith bit = 1 and invert it.
  // AND operation forces ith bit to 0
  // while keeping all other bits unchanged.
  //
  // Time Complexity : O(1)
  // Space Complexity : O(1)
  static void resetIthBit(int bits, int n) {

    int mask = ~(1 << (n - 1));
    bits = bits & mask;

    System.out.println(Integer.toBinaryString(bits));
  }

  // ------------------------------------------------------------
  // Find value at ith bit (0 or 1)
  //
  // Idea:
  // AND with mask keeps only ith bit.
  // If result is zero → bit was 0
  // otherwise → bit was 1
  //
  // Time Complexity : O(1)
  // Space Complexity : O(1)
  static void findIthBit(int n) {

    int bits = 0b101011;

    int mask = 1 << (n - 1);
    int bit = (bits & mask) == 0 ? 0 : 1;

    System.out.println(bit);
  }
}
