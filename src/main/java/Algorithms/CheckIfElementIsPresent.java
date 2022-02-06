package Algorithms;

import java.util.HashSet;
import java.util.Set;

public class CheckIfElementIsPresent {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d"};
        String[] arr2 = {"x", "y", "a", "z"};
        int[] arr3 = {1,2,3,9};
        int[] arr4 = {1,2,-5,13};

        boolean isPresent = checkIfElementIsPresent(arr1, arr2);
        boolean isPresent1 = checkIfPairEqualsSum(arr3, 8);
        boolean isPresent2 = checkIfPairEqualsSum(arr4, 8);

        System.out.println(isPresent);
        System.out.println(isPresent1);
        System.out.println(isPresent2);

    }

    public static boolean checkIfElementIsPresent(String[] arr1, String[] arr2) {
        Set<String> elements = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            elements.add(arr1[i]);
        }

        for (String s : arr2) {
            if (elements.contains(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfPairEqualsSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i] == sum) {
                    return true;
                }
                if (sum == arr[i] + arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
