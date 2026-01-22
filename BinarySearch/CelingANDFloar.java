import java.util.Scanner;

class CelingANDFloar {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter target: ");
    int target = in.nextInt();

    int[] arr = { 10, 20, 40, 60, 80, 90 }; // ascending

    int result = celingORFloar(target, arr);
    System.out.println(result);

    in.close();
  }

  static int celingORFloar(int target, int[] nums) {

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    // return array[left];
    // This if for smallest grether (celling) number, if target not found

    return nums[right];
    // This if for gretest smaller (floar) number, if target not found

  }
}
