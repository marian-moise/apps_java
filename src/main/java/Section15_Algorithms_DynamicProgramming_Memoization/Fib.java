package Section15_Algorithms_DynamicProgramming_Memoization;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Fib {

    public HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    public int fibonacciRec(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    public int getFibonacciNumberTopDown(int n) {
        if (hm.containsKey(n)) return hm.get(n);
        if (n == 0) return 0;
        if (n == 1) return 1;
        int nthValue = getFibonacciNumberTopDown(n - 1) + getFibonacciNumberTopDown(n - 2);
        hm.put(n, nthValue);
        return nthValue;
    }

}
