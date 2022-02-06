package Algorithms.CheckIfPalindrome;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num_1 = 123121;
        System.out.println(checkIfPalindromeNumber(num_1));
        System.out.println(reverseNumber(num_1));
    }

    //iterative
    public static boolean checkIfPalindromeNumber(int number) {
        int initialNumber = number;
        int reminder = 0;
        int reversed = 0;

        while (number != 0) {
            reminder = number % 10;
            reversed = reversed * 10 + reminder;
            number = number / 10;
        }

        return initialNumber == reversed;
    }

    //reverse number recursively:
    public static int reverseNumber(int number) {
        if (number >= 10) {
            reverseNumber(number / 10);
        }
        return number;
    }
}
