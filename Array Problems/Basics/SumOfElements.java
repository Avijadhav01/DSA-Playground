
public class SumOfElements {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 7 };

    sumOfArray(arr);
  }

  static void sumOfArray(int[] array) {
    int sum = 0;
    for (int num : array) {
      sum += num;
    }

    System.out.println("Sum of elements of array : " + sum);
  }
}
