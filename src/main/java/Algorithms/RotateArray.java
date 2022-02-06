package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.asList(rotateArray(arr, 3)));;
    }

    public static List<Integer> rotateArray(int[] arr, int step) {
        List<Integer> rotatedArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == step) {
                for (int j = step + 1; j < arr.length ; j++) {
                    rotatedArray.add(arr[j]);
                }
                for (int k = 0; k <= step; k++) {
                    rotatedArray.add(arr[k]);
                }
            }
        }
        return rotatedArray;
    }
}
