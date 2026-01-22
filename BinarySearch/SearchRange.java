class Solution {
  public int peakIndexInMountainArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) { // note: < not <=
      int mid = left + (right - left) / 2;

      if (arr[mid] > arr[mid + 1]) {
        // descending slope, move left
        // This may be the ans that why we keep end to mid
        right = mid;
      } else {
        // ascending slope, move right
        // Here if arr[mid] < arr[mid+1] that's why we directly points left to mid+1
        left = mid + 1;
      }
    }

    // at the last left == right points to max element i.e. peak index
    return left;
  }
}
