
public class Pattern {

  public static void main(String[] args) {

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // pattern1(5);

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    // pattern1No(4);

    // mirror of above pattern
    // pattern2(5);

    // * * * *
    // * * *
    // * *
    // *
    // pattern3(4);

    // mirror of above pattern
    // pattern4(4);

    // * * * * *
    // * - - - *
    // * - - - *
    // * * * * * take - as space
    // patter5(4, 4);

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    // pattern6(5);

    // - -- *
    // - - * *
    // -- * * *
    // - * * * *
    // -* * * * *
    // - * * * *
    // -- * * *
    // - - * *
    // - -- *
    // pattern7(5);

    // * ------- *
    // ** ----- **
    // *** --- ***
    // **** - ****
    // ***** *****
    // **** - ****
    // *** --- ***
    // ** ----- **
    // * ------- *

    pattern8(5);

  }

  static void pattern1(int n) {
    for (int row = 1; row <= n; row++) {
      for (int j = 0; j < row; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern1No(int n) {
    for (int row = 1; row <= n; row++) {
      for (int j = 0; j < row; j++) {
        System.out.printf("%d ", j);
        // System.out.printf("%d ", row);
      }
      System.out.println();
    }
  }

  static void pattern2(int n) {

    for (int row = 1; row <= n; row++) {
      // for space
      for (int j = 0; j < n - row; j++) {
        System.out.print("   ");
      }

      // for *
      for (int j = 0; j < row; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int row = 0; row < n; row++) {
      for (int j = 0; j < n - row; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {

    for (int row = 0; row < n; row++) {
      // for space
      for (int j = 0; j < row; j++) {
        System.out.print("  ");
      }

      // for *
      for (int j = 0; j < n - row; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }

  static void patter5(int rows, int cols) {
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {

        if (row == 0 || row == rows - 1 || col == 0 || col == cols - 1)
          System.out.print("* ");
        else
          System.out.print("  ");

      }
      System.out.println();
    }
  }

  static void pattern6(int n) {
    for (int row = 1; row <= 2 * n - 1; row++) {

      // int innerLoop = 0;
      // if (row <= n) {
      // innerLoop = row;
      // } else {
      // int i = row - n;
      // innerLoop = n - i;
      // }

      int stars = row <= n ? row : 2 * n - row;

      for (int j = 0; j < stars; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern7(int n) {
    for (int row = 1; row <= 2 * n - 1; row++) {

      int stars = row <= n ? row : 2 * n - row;

      // for spaces
      for (int i = 0; i < n - stars; i++) {
        System.out.print(" ");
      }

      // for * print
      for (int j = 0; j < stars; j++) {
        System.out.print("* ");
      }
      System.out.println();

    }
  }

  static void pattern8(int n) {

    for (int row = 1; row <= 2 * n - 1; row++) {

      int stars = row <= n ? row : 2 * n - row;
      int spaces = 2 * (n - stars);

      // left stars
      for (int i = 0; i < stars; i++) {
        System.out.print("* ");
      }

      // middle spaces
      for (int i = 0; i < spaces; i++) {
        System.out.print("  ");
      }

      // right stars (only if spaces exist)
      if (spaces >= 0) {
        for (int i = 0; i < stars; i++) {
          System.out.print("* ");
        }
      }

      System.out.println();
    }
  }

}
