package Section12_Algorithms_Recursion;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for fibonacci iterative: ");
        int input1 = scanner.nextInt();
        System.out.println("Result number for fibonacci iterative: ");
        System.out.println(fibonacciIterative(input1));;
        System.out.println("Input number for fibonacci recursive: ");
        int input2 = scanner.nextInt();
        System.out.println("Result number for fibonacci recursive: ");
        System.out.println(fibonacciRecursive(input2));
    }


    public static int fibonacciIterative(int input) {

        int[] list = new int[20];
        list[0] = 0;
        list[1] = 1;

        for (int i = 2; i < list.length ; i++) {
            list[i] = list[i - 2] + list[i - 1];
        }

        for (int i = 0; i < list.length ; i++) {
            if (input == i) {
                input = list[i];
            }
        }
        return input;
    }

    public static int fibonacciRecursive(int input) {
        if (input < 2) {
           return  input;
        }
        return fibonacciRecursive(input - 1)
                + fibonacciRecursive(input - 2);
    }
}
