package Section12_Algorithms_Recursion;

public class FactorialRecAndIterative {


    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialIterative(n));
        System.out.println(factorialRecursive(n));

    }

    public static int factorialIterative(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int factorialRecursive(int number) {
        if (number == 2) {
            return 2;
        }
        return factorialRecursive(number - 1) * number;
    }
}
