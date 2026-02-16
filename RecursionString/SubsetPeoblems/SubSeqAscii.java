public class SubSeqAscii {

  public static void main(String[] args) {
    subSeqAscii("", "ab");
  }

  static void subSeqAscii(String p, String up) {

    // Base condition:
    // when unprocessed string becomes empty,
    // current processed string is one subset
    if (up.length() == 0) {
      System.out.printf("{%s}, ", p);
      return;
    }

    char ch = up.charAt(0);

    // Include current character
    subSeqAscii(p + ch, up.substring(1));

    // Include current Ascii character
    subSeqAscii(p + (ch + 0), up.substring(1));

    // Exclude current character
    subSeqAscii(p, up.substring(1));
  }
}
