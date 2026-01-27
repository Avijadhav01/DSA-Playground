// 🔁 Level 2: Character & Pattern Based
// These improve logic and edge-case handling.

// Check if two strings are anagrams
// Check if a string contains only digits
// Find first non-repeating character
// Find first repeating character
// Count words in a sentence
// Reverse words in a sentence
// Toggle case of each character
// Remove all special characters
// Check if string is pangram
// Find maximum occurring character

public class LevelTwo {

  public static void main(String[] args) {
    // String str1 = "listen";
    // String str2 = "silent";
    // boolean result = areAnagram(str1, str2);

    // String str = "987876";
    // System.out.println(areOnlyDigits(str));

  }

  // Check if two strings are anagrams
  static boolean areAnagram(String str1, String str2) {

    char[] charArr = str1.toCharArray();

    for (int i = 0; i < str2.length(); i++) {
      char ch2 = str2.charAt(i);
      boolean flag = false;

      for (int j = 0; j < charArr.length; j++) {
        if (ch2 == charArr[j]) {
          charArr[j] = 0;
          flag = true;
          break;
        }
      }
      if (!flag)
        return flag;
    }

    return true;
  }

  // Check if a string contains only digits
  static boolean areOnlyDigits(String str1) {

    for (int j = 0; j < str1.length(); j++) {
      char ch = str1.charAt(j);
      if (ch < '0' || ch > '9') { // check using char literals
        return false;
      }
    }
    return true;

  }

}
