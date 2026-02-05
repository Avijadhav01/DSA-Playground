public class BinarySearchSQRT {

  public static void main(String[] args) {
    System.out.printf("%.3f", sqrt(16, 3));
  }

  static double sqrt(int n, int d) {

    int s = 0;
    int e = n;

    double root = 0.0;

    // Binary search to find integer part of square root
    while (s <= e) {
      int m = s + (e - s) / 2;

      // avoids overflow compared to (m * m > n)
      if (m > n / m)
        return m;

      // move left if square is greater than n
      if (m * m > n)
        e = m - 1;
      else
        // move right if square is smaller than n
        s = m + 1;
    }

    // 'e' stores the integer part of sqrt after loop ends
    root = e;

    // refining answer for decimal precision
    // each iteration fixes one decimal place
    double incr = 0.1;

    for (int i = 0; i < d; i++) {
      // increase root until square just exceeds n
      while (root * root <= n) {
        root += incr;
      }

      // step back to last correct value
      root -= incr;

      // move to next decimal place
      incr /= 10;
    }

    return root;
  }
}
