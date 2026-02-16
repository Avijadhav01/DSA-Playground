public class RaphsonSQRT {

  public static void main(String[] args) {
    System.out.println(sqrt(40));
  }

  // Square root using Newton-Raphson method
  // Idea: repeatedly improve the guess until it becomes stable
  static double sqrt(double n) {

    // initial guess (starting from n itself)
    double x = n;

    // will store improved approximation
    double root = 0.0;

    while (true) {

      // Newton-Raphson formula:
      // new guess = average of current guess and n/current guess
      root = (x + (n / x)) * 0.5;

      // stop when change between two consecutive values is very small
      // meaning we have reached close enough to actual square root
      if (Math.abs(root - x) < 1) // write value smaller that 1 to get more closer to sqrt
        break;

      x = root; // update guess for next iteration
    }
    return root;
  }
}
