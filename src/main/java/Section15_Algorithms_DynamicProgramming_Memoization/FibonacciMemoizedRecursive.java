package Section15_Algorithms_DynamicProgramming_Memoization;

import java.util.HashMap;

public class FibonacciMemoizedRecursive {
    public static void main(String[] args) {
      Fib fib1 = new Fib();
        System.out.println("value rec :");
        System.out.println(fib1.fibonacciRec(7));
        System.out.println("============================");
        System.out.println("value rec + mem :");
        System.out.println(fib1.getFibonacciNumberTopDown(7));
    }
}


