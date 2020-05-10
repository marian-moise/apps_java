package Leetcode;

public class ReverseInteger {
    public static void main(String[] args) {

        int num = 12345;
        System.out.println(reverse(num));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE );
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println(Integer.MAX_VALUE + 1);

    }

    public static int reverse(int x) {

        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = (x - x % 10) / 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reversed;
        }
    }
}
