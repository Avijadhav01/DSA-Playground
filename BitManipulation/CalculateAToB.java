public class CalculateAToB {

  public static void main(String[] args) {
    int base = 3;
    int pow = 5;

    power(base, pow);

    NoOfSetBits(11);
  }

  static void power(int base, int pow) {
    int result = 1;

    while (pow > 0) {
      if ((pow & 1) == 1) {
        result = result * base;
      }
      base *= base;
      pow >>= 1;
    }
    System.out.println(result);
  }

  static void NoOfSetBits(int n) {
    int count = 0;
    while (n > 0) {
      n = n & (n - 1);
      count++;
    }
    System.out.println("No of set bits " + count);
  }
}
