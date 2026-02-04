public class NoOfSetBits {

  public static void main(String[] args) {
    noOfSetBits(5); // 101
  }

  static void noOfSetBits(int n) {
    int count = 0;

    while (n > 0) {
      n = n & (n - 1);
      count++;
    }

    System.out.println(count);
  }
}
