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
  //
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
  //
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
  // Time Complexity : O(2^n)
  // Space Complexity : O(n)
  //
  // LeetCode Problem:
  // 509. Fibonacci Number
  static int fibo(int n) {
    if (n < 2)
      return n;

    return fibo(n - 1) + fibo(n - 2);
  }

  // ------------------------------------------------------------
  // Fibonacci using mathematical formula (Binet's Formula)
  // Idea:
  // Direct mathematical computation instead of recursion.
  // Faster but may lose precision for large n.
  //
  // LeetCode Reference:
  // 509. Fibonacci Number (alternative approach)
  static int fiboFormula(int n) {
    return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)
        + Math.pow(((1 - Math.sqrt(5)) / 2), n))
        / Math.sqrt(5));
  }

  // ------------------------------------------------------------
  // Print numbers from n to 1
  // Idea:
  // Work is done BEFORE recursive call.
  //
  // Time Complexity : O(n)
  // Space Complexity : O(n)
  //
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
  //
  // Time Complexity : O(n)
  // Space Complexity : O(n)
  //
  static void print1ToN(int n) {
    if (n == 0)
      return;

    print1ToN(n - 1);
    System.out.print(n + " ");
  }

  // ------------------------------------------------------------
  // Reverse a number (Method 1)
  // Idea:
  // Extract last digit and build reversed number.
  //
  // Time Complexity : O(d)
  // Space Complexity : O(d)
  // where d = number of digits
  //
  // LeetCode Problem:
  // 7. Reverse Integer
  static int reverseANumber(int n, int reverseNum) {
    if (n == 0)
      return reverseNum;

    return reverseANumber((n / 10), (reverseNum * 10 + n % 10));
  }

  // ------------------------------------------------------------
  // Reverse a number (Pure recursion)
  // Idea:
  // Place last digit at correct position using powers of 10.
  //
  // Time Complexity : O(d)
  // Space Complexity : O(d)
  //
  // LeetCode Problem:
  // 7. Reverse Integer
  static int reverseANumber2(int n) {
    if (n < 10)
      return n;

    int digits = (int) (Math.log10(n));
    int lastDigit = n % 10;

    return lastDigit * (int) Math.pow(10, digits)
        + reverseANumber2(n / 10);
  }

  // ------------------------------------------------------------
  // Sum of digits of a number
  // Idea:
  // Add last digit with sum of remaining digits.
  //
  // Time Complexity : O(d)
  // Space Complexity : O(d)
  //
  // LeetCode Reference:
  // Similar concept used in
  // 258. Add Digits (optimized mathematical solution exists).
  static int sumOfDigits(int n) {
    if (n == 0)
      return 0;

    return (n % 10) + sumOfDigits(n / 10);
  }

  // ------------------------------------------------------------
  // Palindrome number check
  // Idea:
  // Number is palindrome if it equals its reverse.
  //
  // LeetCode Problem:
  // 9. Palindrome Number
  static boolean palin(int n) {
    return n == reverseANumber2(n);
  }

  // ------------------------------------------------------------
  // Count number of zeros in a number
  //
  // Time Complexity : O(d)
  // Space Complexity : O(d)
  //
  static int countZero(int n, int counter) {

    if (n == 0)
      return counter;

    if (n % 10 == 0) {
      return countZero(n / 10, ++counter);
    }
    return countZero(n / 10, counter);
  }

  // ------------------------------------------------------------
  // LeetCode Problem 1342
  // Number of Steps to Reduce a Number to Zero
  //
  // If number is even -> divide by 2
  // If odd -> subtract 1
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
