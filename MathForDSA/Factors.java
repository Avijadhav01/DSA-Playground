import java.util.ArrayList;

public class Factors {

  public static void main(String[] args) {
    // factors1(20);
    factors2(36);
    factors3(36);
  }

  // Brute force approach
  // Time Complexity : O(n)
  static void factors1(int n) {
    for (int i = 1; i <= n; i++) {
      // if i divides n completely, it is a factor
      if ((n % i) == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  // Optimized approach using square root concept
  // Time Complexity : O(sqrt(n))
  static void factors2(int n) {

    // iterate only till sqrt(n)
    for (int i = 1; (i * i) <= n; i++) {
      if ((n % i) == 0) {

        // when both factors are same (perfect square case)
        if (n / i == i) {
          System.out.print(i + " ");
        } else {
          // print both factors together
          System.out.print(i + " " + (n / i) + " ");
        }
      }
    }
    System.out.println();
  }

  // Prints factors in sorted order
  // First prints smaller factors, stores larger ones,
  // then prints stored factors in reverse order
  // Time : O(sqrt(n)),
  // Space : O(sqrt(n)) as we uses ArrayList to store the larger factors
  static void factors3(int n) {
    ArrayList<Integer> List = new ArrayList<>();

    // find factors till sqrt(n)
    for (int i = 1; (i * i) <= n; i++) {
      if ((n % i) == 0) {

        // perfect square case (avoid duplicate)
        if (n / i == i) {
          System.out.print(i + " ");
        } else {
          // print smaller factor immediately
          System.out.print(i + " ");

          // store larger factor to print later in order
          List.add(n / i);
        }
      }
    }

    // printing stored larger factors in reverse
    for (int i = List.size() - 1; i >= 0; i--) {
      System.out.print(List.get(i) + " ");
    }
  }
}
