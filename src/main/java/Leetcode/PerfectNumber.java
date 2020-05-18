package Leetcode;

public class PerfectNumber {
    /**
    Primele 4 numere perfecte:
     6, 28, 496, 8128
     6 = 1 + 2 + 3
     Nr perfect = numarul care reprezinta suma divizorilor sai exceptandu-se pe el insusi;
     */

    public static void main(String[] args) {

        isPerfect(6);
        isPerfect(28);
        isPerfect(496);
        isPerfect(8128);
        isPerfect(5);
        isPerfect(8);
    }

    public static void isPerfect(int number) {

        int sum = 1;

        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                sum = sum + (number / i);
            }
        }

        if (sum == number) {
            System.out.println("Is perfect!");
        } else {
            System.out.println("Not perfect");
        }



    }
}
