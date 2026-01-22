import java.util.Arrays;

public class RowColMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 3, 5 },
        { 2, 4, 7 },
        { 6, 8, 9 },
        { 11, 12, 13 },
    };

    int[] index = searchElement(matrix, 12);
    System.out.println(Arrays.toString(index));

  }

  static int[] searchElement(int[][] matrix, int target) {

    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == target)
        return new int[] { row, col };
      else if (matrix[row][col] > target)
        col--; // Move left
      else
        row++; // Move down
    }

    return new int[] { -1, -1 };
  }
}