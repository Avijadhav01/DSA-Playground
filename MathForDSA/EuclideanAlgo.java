public class EuclideanAlgo {

  public static void main(String[] args) {
    // System.out.println(HCF(80, 100));
    // System.out.println(gcd(80, 100));

    System.out.println(lcm(80, 100));
  }

  // Iterative Euclidean Algorithm
  // Idea: GCD(a, b) = GCD(b, a % b)
  // Time Complexity : O(log(min(a, b)))
  // Space Complexity : O(1)
  static int HCF(int a, int b) {

    // keep reducing problem size until remainder becomes 0
    while (b != 0) {
      int temp = b;
      b = a % b; // replace b with remainder
      a = temp; // move previous b to a
    }

    // when b becomes 0, 'a' stores the GCD
    return a;
  }

  // Recursive Euclidean Algorithm
  // Time Complexity : O(log(min(a, b)))
  // Space Complexity : O(log(min(a, b))) due to recursion stack
  static int gcd(int a, int b) {

    // base condition: when remainder becomes 0
    if (b == 0)
      return a;

    // recursive reduction using Euclidean property
    return gcd(b, a % b);
  }

  static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

}
