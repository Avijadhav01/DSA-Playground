public class SkipCharacters {

  public static void main(String[] args) {

    // Original string
    String str = "baccad";

    // --------- Method 1 (Using same StringBuilder) ----------
    // StringBuilder ans = new StringBuilder();
    // SkipChar(str, ans, 0);
    // System.out.println(ans);

    // --------- Method 2 (Returning new string from recursion) ----------
    // String ans2 = SkipChar2(str, 0);
    // System.out.println(ans2); // Output: bccd

    String str2 = "aeappledj";
    System.out.println(SkipString(str2));
  }

  // ------------------------------------------------------------
  // METHOD 1:
  // This method removes all 'a' characters
  // It uses ONE StringBuilder that is shared in all recursive calls
  // ------------------------------------------------------------
  static void SkipChar(String str, StringBuilder ans, int i) {

    if (i == str.length())
      return;

    char ch = str.charAt(i);
    if (ch != 'a')
      ans.append(ch);

    SkipChar(str, ans, i + 1);
  }

  // ------------------------------------------------------------
  // METHOD 2:
  // This method removes all 'a' characters
  // It creates a NEW StringBuilder in each recursive call
  // It builds the answer while returning back (bottom to top)
  // ------------------------------------------------------------
  static String SkipChar2(String str, int i) {

    if (i == str.length())
      return "";

    char ch = str.charAt(i);
    if (ch != 'a')
      return ch + SkipChar2(str, i + 1);
    else
      return SkipChar2(str, i + 1);
  }

  static String SkipString(String str) {

    if (str.length() == 0)
      return "";

    if (str.startsWith("apple"))
      return SkipString(str.substring(5));
    else {
      char ch = str.charAt(0);
      return ch + SkipString(str.substring(1));
    }
  }
}
