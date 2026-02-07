public class Examples {

  public static void main(String[] args) {

    System.out.println(countZero(10230021, 0));
  }

  // ------------------------------------------------------------
  // 1. Factorial of a number
  // Idea: n! = n * (n-1)!
  //
  // Time Complexity : O(n)
  // Space Complexity : O(n) (recursive call stack)
  static int Fact(int n) {
    if (n <= 1)
      return 1;

    return n * Fact(n - 1);
  }

  // ------------------------------------------------------------
  // 2. Sum of numbers from n to 1
  // Idea: sum(n) = n + sum(n-1)
  //
  // Time Complexity : O(n)
  // Space Complexity : O(n)
  static int sumOfNto1(int n) {
    if (n == 1)
      return 1;

    return n + sumOfNto1(n - 1);
  }

  // ------------------------------------------------------------
  // 3. Fibonacci sequence
  // Idea: fib(n) = fib(n-1) + fib(n-2)
  // Each number depends on previous two numbers.
  //
  // This creates overlapping subproblems,
  // so many calls repeat again and again.
  //
  // Time Complexity : O(2^n) (very slow for large n)
  // Space Complexity : O(n)
  static int fibo(int n) {
    if (n < 2)
      return n;

    return fibo(n - 1) + fibo(n - 2);
  }

  // ------------------------------------------------------------
  // Fibonacci using mathematical formula (Binet's Formula)
  // Idea:
  // Direct mathematical computation instead of recursion.
  // Faster but may lose precision for large n due to floating point.
  //
  static int fiboFormula(int n) {
    return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)
        + Math.pow(((1 - Math.sqrt(5)) / 2), n))
        / Math.sqrt(5));
  }

  // ------------------------------------------------------------
  // Print numbers from n to 1
  // Idea:
  // Work is done BEFORE recursive call.
  // so, current value prints first, then smaller problem executes.
  //
  // Time Complexity : O(n)
  // Space Complexity : O(n)
  static void printNTo1(int n) {
    if (n < 1)
      return;

    System.out.print(n + " ");
    printNTo1(n - 1);
  }

  // ------------------------------------------------------------
  // Print numbers from 1 to n
  // Idea:
  // Work is done AFTER recursive call.
  // Recursion first reaches smallest value,
  // then prints while returning back.
  //
  // Time Complexity : O(n)
  // Space Complexity : O(n)
  static void print1ToN(int n) {
    if (n == 0)
      return;

    print1ToN(n - 1);
    System.out.print(n + " ");
  }

  // ------------------------------------------------------------
  // Reverse a number (Method 1)
  // Idea:
  // Extract last digit and keep building reversed number.
  // reverseNum stores partial answer.
  //
  // Example:
  // 123 -> 3 -> 32 -> 321
  //
  // Time Complexity : O(d)
  // Space Complexity : O(d)
  // where d = number of digits
  static int reverseANumber(int n, int reverseNum) {
    if (n == 0)
      return reverseNum;

    return reverseANumber((n / 10), (reverseNum * 10 + n % 10));
  }

  // ------------------------------------------------------------
  // Reverse a number (Pure recursion, no extra argument)
  // Idea:
  // Last digit must move to correct position in reversed number.
  // We calculate how many digits remain and place it accordingly.
  //
  // Example:
  // 1234 =
  // 4*1000 + 3*100 + 2*10 + 1
  //
  // Each call places one digit correctly
  // and recursion handles remaining digits.
  //
  // Time Complexity : O(d)
  // Space Complexity : O(d)
  static int reverseANumber2(int n) {
    if (n < 10)
      return n;

    int digits = (int) (Math.log10(n)); // Ex: for 142 it give digits = 2
    int lastDigit = n % 10;

    return lastDigit * (int) Math.pow(10, digits)
        + reverseANumber2(n / 10);
  }

  // ------------------------------------------------------------
  // Sum of digits of a number
  // Idea:
  // Separate last digit and add it to sum of remaining digits.
  //
  // Example:
  // 154 = 4 + 5 + 1
  //
  // Time Complexity : O(d)
  // Space Complexity : O(d)
  static int sumOfDigits(int n) {
    if (n == 0)
      return 0;

    return (n % 10) + sumOfDigits(n / 10);
  }

  static boolean palin(int n) {
    return n == reverseANumber2(n);
  }

  // Count no of zeros in number
  static int countZero(int n, int counter) {

    if (n == 0)
      return counter;

    if (n % 10 == 0) {
      return countZero(n / 10, ++counter);
    }
    return countZero(n / 10, counter);

  }

  // LeetCode problem no 1342
  static int numberOfSteps(int num) {
    return helper(num, 0);
  }

  static int helper(int num, int stepsC) {
    if (num == 0)
      return stepsC;

    if (num % 2 == 0) {
      return helper(num / 2, ++stepsC);
    }
    return helper(--num, ++stepsC);

  }

}
