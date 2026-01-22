import java.util.Scanner;

public class EvenDigits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = { 10, 343, 5, -13, -1, 3567, 0 };

    int result = checkEvenDigitsNo(array);
    System.out.println(result);
    sc.close();
  }

  static int checkEvenDigitsNo(int[] arr) {

    int count = 0;
    for (int i = 0; i < arr.length; i++) {

      int digits = countDigits(arr[i]);
      if (digits % 2 == 0) {
        count++;
      }
    }
    return count;
  }

  static int countDigits(int num) {
    if (num == 0) {
      return 1;
    }
    int digits = 0;

    while (num != 0) {
      num = num / 10;
      digits++;
    }
    return digits;
  }
}