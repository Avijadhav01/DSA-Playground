public class SumOfBinary {
  public static void main(String[] args) {
    String result = addBinary("110", "010");
    System.out.println(result);
  }

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