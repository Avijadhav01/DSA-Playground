public class SumOfBinary {
  public static void main(String[] args) {
    String result = addBinary("110", "010");
    System.out.println(result);
  }

  // ------------------------------------------------------------
  // LeetCode 67 - Add Binary
  //
  // Idea:
  // Add binary digits from right to left,
  // just like normal addition.
  //
  // Steps:
  // 1. Start from last index of both strings.
  // 2. Add bits and carry.
  // 3. Append (sum % 2) to result.
  // 4. Update carry = sum / 2.
  // 5. Reverse final string.
  //
  // Example:
  // 110
  // 010
  // ----
  // 1000
  //
  // Time Complexity : O(max(n, m))
  // Space Complexity : O(max(n, m))
  static String addBinary(String a, String b) {
    StringBuilder sum = new StringBuilder("");
    int carry = 0;

    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) {
      int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
      int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

      int total = bitA + bitB + carry;

      sum.append(total % 2);
      carry = total / 2;

      i--;
      j--;
    }
    return sum.reverse().toString();
  }
}
