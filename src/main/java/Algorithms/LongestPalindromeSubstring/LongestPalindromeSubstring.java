package Algorithms.LongestPalindromeSubstring;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s_1 = "cicqaabbaa";
//        String s_2 = "racecar";
        String s_2 = "abba";

        System.out.println("==============O(n^3)==============");
        System.out.println(getLongestPalindromeSubstring_1(s_1));
        System.out.println(getLongestPalindromeSubstring_1(s_2));

        System.out.println("==============O(n^2)==============");
        System.out.println(getLongestPalindromeSubstring_2(s_1));
        System.out.println(getLongestPalindromeSubstring_2(s_2));
    }

    //brute-force -> O(n^3)
    public static String getLongestPalindromeSubstring_1(String s) {
        //iterate through string;
        //chesk if each substring is palindrome;
        //keep the longest palindrome;
        String longestPalindrome = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                stringBuilder.append(s.charAt(j));
                if (checkIfPalindrome(stringBuilder.toString())) {
                    if (stringBuilder.toString().length() > longestPalindrome.length()) {
                        longestPalindrome = stringBuilder.toString();
                    }
                }
            }
            stringBuilder = new StringBuilder();
        }
        return longestPalindrome;
    }

    public static boolean checkIfPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int k = s.length() - 1; k >= 0; k--) {
            sb.append(s.charAt(k));
        }
        return sb.toString().equalsIgnoreCase(s);
    }

    //O(n^2)
    public static String getLongestPalindromeSubstring_2(String s) {
        String maxSubstring = "";
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            String response_1 = expandAndGet(s, i, i);
            String response_2 = expandAndGet(s, i, i + 1);
            if (response_1.length() > maxSubstring.length()) {
                maxSubstring = response_1;
            }
            if (response_2.length() > maxSubstring.length()) {
                maxSubstring = response_2;
            }
        }
        return maxSubstring;
    }

    private static String expandAndGet(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
