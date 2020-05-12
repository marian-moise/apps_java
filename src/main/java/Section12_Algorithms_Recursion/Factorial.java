package Section12_Algorithms_Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for fact iterative: ");
        int input1 = scanner.nextInt();
        System.out.println("Input number for fact recursive: ");
        int input2 = scanner.nextInt();
        System.out.println("Result number for fact iterative: ");
        factorialIterative(input1);
        System.out.println("Result number for fact recursive: ");
        System.out.println(factorialRecursive(input2));


    }


    public static void factorialIterative(int input) {

        int produs = 1;

        for (int i = 1; i <= input ; i++) {
            produs = produs * i;
        }
        System.out.println(produs);
    }

    public static int factorialRecursive(int input) {
        if (input == 2) {
            return 2;
        }
        return input * factorialRecursive(input - 1);
    }
}
