
// This is binary search 744 th problem on leetcode
class NGL {
  public static void main(String[] args) {

    char[] letters = { 'a', 'b', 'e', 'h', 'k' };

    char target = 'b';
    char result = nextGreatestLetter(letters, target);
    System.out.println(result);
  }

  static char nextGreatestLetter(char[] letters, char target) {

    int left = 0;
    int right = letters.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (target < letters[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return letters[left % letters.length];
  }
}
