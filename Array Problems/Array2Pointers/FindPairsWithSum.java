import java.util.Arrays;
import java.util.Scanner;

public class FindPairsWithSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = { 2, 5, 3, 9, 2, 0, 7 };
    int sumValue = sc.nextInt();

    PairsWithSum(sumValue, array);

    sc.close();
  }

  static void PairsWithSum(int k, int[] arr) {
    Arrays.sort(arr);

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int sum = arr[start] + arr[end];

      if (sum == k) {
        System.out.println("Pair found: " + arr[start] + ", " + arr[end]);
        start++;
        end--;
      } else if (sum < k) {
        start++;
      } else {
        end--;
      }
    }

  }
}
