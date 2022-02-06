package Algorithms;

import java.util.HashSet;
import java.util.Set;

public class FindSumInArrayGoogleInt {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6};
        int[] arr2 = {2, 2, 3, 4};
        int[] arr3 = {-1, 0 , 1, 2, 3, 5, 7, 9, 11, 21};
        System.out.println(findSumInArray2(arr3, 55));
    }

    public static boolean findSumInArray2(int[] arr, int sum) {

        Set<Integer> complements = new HashSet<>();

        for (int value: arr) {
            complements.add(value);
            if (complements.contains(sum - value)) {
                return true;
            }
        }
        return false;
    }
}
