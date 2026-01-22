import java.util.Arrays;

public class SortedMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 },
    };

    int[] index = searchMatrix(matrix, 9);
    System.out.println(Arrays.toString(index));
  }

  // Search in the provided row from matrix between the cStart and cEnd
  static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

    while (cStart <= cEnd) {
      int mid = cStart + (cEnd - cStart) / 2;

      if (matrix[row][mid] == target) {
        return new int[] { row, mid };
      } else if (matrix[row][mid] > target) {
        cEnd = mid - 1;
      } else {
        cStart = mid + 1;
      }
    }

    return new int[] { -1, -1 };
  }

  static int[] searchMatrix(int[][] matrix, int target) {

    int rows = matrix.length;
    int cols = matrix[0].length;

    if (rows == 1) {
      return binarySearch(matrix, 0, 0, cols - 1, target);
    }

    int rStart = 0;
    int rEnd = rows - 1;
    int cMid = cols / 2;

    // Reduce to 2 rows
    while (rStart < rEnd - 1) {
      int mid = rStart + (rEnd - rStart) / 2;

      if (matrix[mid][cMid] == target) {
        return new int[] { mid, cMid };
      } else if (matrix[mid][cMid] > target) {
        rEnd = mid;
      } else {
        rStart = mid;
      }
    }

    // Check middle column
    if (matrix[rStart][cMid] == target)
      return new int[] { rStart, cMid };

    if (matrix[rStart + 1][cMid] == target)
      return new int[] { rStart + 1, cMid };

    // Search 4 quadrants
    int[] ans;

    // 1st quadrant
    ans = binarySearch(matrix, rStart, 0, cMid - 1, target);
    if (ans[0] != -1)
      return ans;

    // 2nd quadrant
    ans = binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
    if (ans[0] != -1)
      return ans;

    // 3rd quadrant
    ans = binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
    if (ans[0] != -1)
      return ans;

    // 4th quadrant
    return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
  }

}
