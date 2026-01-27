// 🧱 Level 1: String Basics (Must-Do)
// These build comfort with indexing, loops, and string methods.

// Reverse a string
// Check if a string is a palindrome
// Count vowels and consonants
// Count frequency of each character
// Find length of string without using length()
// Convert string to uppercase / lowercase (without built-ins)
// Remove spaces from a string
// Replace all spaces with %20
// Compare two strings without equals()

// 👉 Focus: loops, charAt(), ASCII values

public class LevelOne {

  public static void main(String[] args) {

    // 1st
    // String name = "Avinash";
    // String result = ReverseString(name);

    // 2nd
    // String name = "MAdam";
    // System.out.println(isPalindrome(name));

    // 3rd
    // String string = "aeiouaeioub";
    // CountVowelsAndConsonants(string);

    // 5th
    // String str = "Avinash";
    // int length = stringLength(str);

    // 6th
    // String str = "Avinash";
    // String result = toUpperCase(str);

    // 7th
    // String str = " Avinash \n Jadhav ";
    // String result = removeSpaces(str);

    // 8th
    // String str = "Avinash Jadhav";
    // String result = replaceSpace(str);
    System.out.println();

  }

  // Reverse
  static String ReverseString(String str) {

    char[] charArray = str.toCharArray();
    int left = 0;
    int right = charArray.length - 1;

    while (left <= right) {
      char temp = charArray[left];
      charArray[left] = charArray[right];
      charArray[right] = temp;
      left++;
      right--;
    }

    return new String(charArray);
  }

  // Palindrome
  static boolean isPalindrome(String str) {

    str = str.toLowerCase();

    int n = str.length();
    for (int i = 0; i < n / 2; i++) {
      char left = str.charAt(i);
      char right = str.charAt(n - 1 - i);

      if (left != right) {
        return false;
      }
    }

    return true;
  }

  // Count vowels and consonants
  static void CountVowelsAndConsonants(String str) {
    str = str.toUpperCase();

    int vCount = 0;
    int cCount = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      // Skip non-alphabet characters
      if (c < 'A' || c > 'Z') {
        continue;
      }

      boolean isVowel = false;
      if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        isVowel = true;
      }

      if (isVowel)
        vCount++;
      else
        cCount++;
    }

    System.out.println("Vowels count : " + vCount);
    System.out.println("Consonants count : " + cCount);
  }

  // str length without using .length()
  static int stringLength(String str) {
    int count = 0;

    for (char c : str.toCharArray()) {
      count++;
    }

    return count;
  }

  // toUpperCase using ASCII value
  static String toUpperCase(String str) {
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] >= 'a' && chars[i] <= 'z') {
        chars[i] = (char) (chars[i] - 32);
      }
    }

    return new String(chars);
  }

  // Remove spaces in string
  static String removeSpaces(String str) {
    StringBuilder newStr = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c != ' ') {
        newStr.append(c);
      }
    }
    return newStr.toString();
  }

  // Replace all spaces in a string with %20
  static String replaceSpace(String str) {
    // StringBuilder newStr = new StringBuilder();
    String newStr = str.replaceAll(" ", "%20");

    return newStr;
  }

  // Compare two strings without equals()

}
