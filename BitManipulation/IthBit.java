public class IthBit {

  public static void main(String[] args) {
    // setIthBit(0b1010110, 4);
    resetIthBit(0b1011001, 4);
    // findIthBit(4);
  }

  // Set the ith bit to 1
  static void setIthBit(int bits, int n) {
    // bits = 1010110
    int mask = 1 << (n - 1);

    bits = bits | mask;
    System.out.println(Integer.toBinaryString(bits)); // 101"1"110
  }

  // Reset the Ith bit to 0
  static void resetIthBit(int bits, int n) {
    int mask = ~(1 << (n - 1)); // mask = ~(1000) = 0111

    bits = bits & mask;
    System.out.println(Integer.toBinaryString(bits)); // 101"1"110
  }

  // Find the bit (0 or 1) at Ith bit
  static void findIthBit(int n) {
    int bits = 0b101011; // binary literal (recommended)

    int mask = 1 << (n - 1);
    int bit = (bits & (mask)) == 0 ? 0 : 1;

    System.out.println(bit);
  }

}