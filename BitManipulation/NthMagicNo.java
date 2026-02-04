public class NthMagicNo {

  public static void main(String[] args) {
    nthMagicNo(5, 6);
  }

  static void nthMagicNo(int base, int n) {
    int sum = 0;

    while (n > 0) {
      int bit = n & 1;
      n >>= 1;
      sum = sum + (bit * base);
      base *= 5; // 25 , 125,
    }
    System.out.println(sum);
  }

}
