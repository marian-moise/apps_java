package Algorithms;

import java.util.Arrays;

public class FibonacciIterativeAndRecursive {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(iterativeFib(20)));
        int maxNumber = 20;
        for (int i = 0; i < maxNumber; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    public static int[] iterativeFib(int range) {
        int[] fib = new int[range];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < range; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }
}
