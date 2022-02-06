package Algorithms.CheckIfPalindrome;

public class PalindromeString {
    public static void main(String[] args) {
        String s_1 = "racecar";
        String s_2 = "ababax";
        System.out.println(checkIfStringIsPalindrome_1(s_1));
        System.out.println(checkIfStringIsPalindrome_2(s_2));
    }

    public static boolean checkIfStringIsPalindrome_1(String s) {
        String revertedString = "";
        for (int i = s.length() - 1; i >= 0;  i--) {
            revertedString = revertedString + s.charAt(i);
        }
        return revertedString.equalsIgnoreCase(s);
    }

    public static boolean checkIfStringIsPalindrome_2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0;  i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString().equalsIgnoreCase(s);
    }
}
