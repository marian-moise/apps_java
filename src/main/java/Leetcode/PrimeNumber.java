package Leetcode;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrime(3);
        isPrime(12);
        isPrime(24);
        isPrime(1);
    }

    public static void isPrime(int number) {

        int counter = 0;

        for (int i = 1; i < Math.sqrt(number); i++) {
            int rest = number % i;
            counter++;
        }

        if (number == 1) {
            System.out.println("Number not prime!");
            return;
        }

        if (counter > 1) {
            System.out.println("Number not prime!");
        } else {
            System.out.println("Number is prime!");
        }
    }
}
