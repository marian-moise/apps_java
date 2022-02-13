package Algorithms.GetOddPartFromNumber;

public class GetOddPartFromNumber {
    public static void main(String[] args) {
        //Every number can be written like this x*2^y ---> x*2*2*2*2…
        //Write a function that takes a number as input and returns the odd part of it (the x from the formula);
        int number = 13;

        //iterative:
        System.out.println(returnOddNumberIterative(number));

        //recursive:
        System.out.println(returnOddNumberRecursive(number));

    }

    private static int returnOddNumberIterative(int num) {
        while (num % 2 == 0) {
            num = num / 2;
        }
        return num;
    }

    private static int returnOddNumberRecursive(int num) {
        if (num % 2 != 0) {
            return num;
        }
        return returnOddNumberRecursive(num / 2);
    }
}
