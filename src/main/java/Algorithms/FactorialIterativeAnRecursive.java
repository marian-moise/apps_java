package Algorithms;

public class FactorialIterativeAnRecursive {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(3));
        System.out.println("RECURSIVE:");
        System.out.println(factorialRec(5));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        int i = 1;
        int fact = 1;
        while (i < n) {
            fact = fact * (i + 1);
            i++;
        }
        return fact;
    }

    public static int factorialRec(int n) {
        if (n == 2) {
            return 2;
        }
        return n * factorial(n - 1);
    }
}
