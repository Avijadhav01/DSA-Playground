public class Examples {

  public static void main(String[] args) {
    // 1. factorial
    // int result = Fact(4);
    // System.out.println(result);

    // 2. sumOfDigits
    // System.out.println(sumOfDigits(6));

    // 3. fibonacci
    // System.out.println(fibo(4));

    for (int i = 1; i < 10; i++) {
    }
    System.out.println(fiboFormula(5));

    // 4
    // printNTo1(4);

    System.out.println();
    // 5
    // print1ToN(4);

  }

  static int Fact(int n) {
    if (n <= 2)
      return n;

    return Fact(n - 1) * n;
  }

  // 2 Sum of digits of a number
  static int sumOfDigits(int n) {
    // Base Condition
    if (n == 0)
      return 0;

    return n + sumOfDigits(n - 1);
  }

  // 3 fibonacci sequence
  static int fibo(int n) {
    // Base Condition
    if (n < 2)
      return n;

    return fibo(n - 1) + fibo(n - 2);
  }

  // Fibonacci formula
  static int fiboFormula(int n) {
    return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)
        + Math.pow(((1 - Math.sqrt(5)) / 2), n))
        / Math.sqrt(5));
  }

  // Print n to 1 i.e. n ... 2 1
  static void printNTo1(int n) {
    // Base condition
    if (n < 1)
      return;

    System.out.print(n + " ");
    printNTo1(n - 1);
  }

  // Print n to 1 i.e. 1 2 ...n
  static void print1ToN(int n) {
    // Base condition
    if (n == 0)
      return;

    print1ToN(n - 1);
    System.out.print(n + " ");
  }

  // Reverse A Number
  static int reverseANumber(int n, int reverseNum) {
    if (n == 0) { // correct base condition
      return reverseNum;
    }

    int lastDigit = n % 10;
    reverseNum = (reverseNum * 10) + lastDigit;

    return reverseANumber(n / 10, reverseNum);
  }

}
