package Algorithms.RotateArrayOfInt;

import java.util.Arrays;

public class RotateArrayOfInt {
    public static void main(String[] args) {
        //Write a function that takes an integers array and an integer n as input and rotates the first n numbers to left.
        // For example, for { 5, 3, 7, 9 ,2} and n=2 it would return { 7, 9, 2, 5, 3 }.
        //5, 3, 7, 9 ,2

        //3, 7, 9, 2, 5 ---> n = 0
        //7, 9, 2, 5, 3 ---> n = 1

        int[] arr = {5, 3, 7, 9 ,2};
        rotateArrayList(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArrayList(int[] arr, int n) {
        int x = 0;
        while (x < n) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            x++;
        }
    }
}
