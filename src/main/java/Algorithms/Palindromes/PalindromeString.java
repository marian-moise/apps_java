package Algorithms.Palindromes;

public class PalindromeString {
    public static void main(String[] args) {
        String s_1 = "racecar";
        String s_2 = "ababax";
        System.out.println(checkIfStringIsPalindrome_1(s_1));
        System.out.println(checkIfStringIsPalindrome_2(s_2));
        System.out.println(checkIfStringIsPalindrome_3(s_1));
    }

    //mai putin eficienta decat varianta cu pointeri - se parcurge tot stringul
    public static boolean checkIfStringIsPalindrome_1(String s) {
        String revertedString = "";
        for (int i = s.length() - 1; i >= 0;  i--) {
            revertedString = revertedString + s.charAt(i);
        }
        return revertedString.equalsIgnoreCase(s);
    }

    //mai putin eficienta decat varianta cu pointeri - se parcurge tot stringul
    public static boolean checkIfStringIsPalindrome_2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0;  i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString().equalsIgnoreCase(s);
    }

    //varianta cu pointeri - mai eficienta pentru ca in cel mai bun caz nu se parcurge tot stringul
    public static boolean checkIfStringIsPalindrome_3(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
