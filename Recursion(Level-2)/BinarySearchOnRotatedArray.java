public class BinarySearchOnRotatedArray {

  public static void main(String[] args) {
    int[] array = { 4, 5, 6, 7, 1, 2, 3 };
    System.out.println(search(array, 7, 0, array.length - 1));// 4
  }

  static int search(int[] arr, int tar, int s, int e) {

    if (s > e)
      return -1;

    int mid = s + (e - s) / 2;

    if (arr[mid] == tar)
      return mid;

    if (arr[s] <= arr[mid]) {
      // left part sorted
      if (tar >= arr[s] && tar <= arr[mid]) {
        e = mid - 1;
        return search(arr, tar, s, e);
      } else {
        s = mid + 1;
        return search(arr, tar, s, e);
      }
    } else {
      // Right part is sorted
      if (tar >= arr[mid] && tar <= arr[e]) {
        s = mid + 1;
        return search(arr, tar, s, e);
      } else {
        e = mid - 1;
        return search(arr, tar, s, e);
      }
    }
  }
}
