public class RightMostSetBit {

  public static void main(String[] args) {
    int n = 0b1000;
    int rsb = n & (-n);

    // Bit positions require log base 2
    int position = (int) (Math.log(rsb) / Math.log(2)) + 1;
    System.out.println(position);

    noOfDigitsInAnyBase(8, 10);
  }

  // Very Important
  static void noOfDigitsInAnyBase(int num, int base) {
    int digits = (int) (Math.log(num) / Math.log(base) + 1);
    System.out.println(digits);
  }

}
