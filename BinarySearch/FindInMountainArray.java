class FindInMountainArray {

  public static void main(String[] args) {
    int[] nums = { 0, 2, 4, 6, 3, 1 };
    int target = 3;

    int index = binarySearch(nums, target);
    System.out.println(index);
  }

  static int binarySearch(int[] array, int target) {
    int leftSideIndex = leftSearch(array, target);
    int rightSideIndex = rightSearch(array, target);

    if (leftSideIndex != -1) {
      return leftSideIndex;
    } else {
      return rightSideIndex;
    }
  }

  static int leftSearch(int[] nums, int target) {

    int[] pointers = peakIndexInMountainArray(nums);

    int left = 0;
    int right = pointers[1];

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

    return -1;
  }

  static int rightSearch(int[] nums, int target) {

    int[] pointers = peakIndexInMountainArray(nums);

    int left = pointers[0];
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

    return -1;
  }

  static int[] peakIndexInMountainArray(int[] arr) {

    int left = 0;
    int right = arr.length - 1;

    int mid = 0;
    while (left < right) {
      mid = left + (right - left) / 2;
      if (arr[mid] < arr[mid + 1]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    right = mid;
    left = mid + 1;

    return new int[] { left, right };
  }

}
