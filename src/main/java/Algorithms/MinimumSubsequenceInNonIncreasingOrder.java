package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {

    public static void main(String[] args) {

        int[] arr1 = {4, 3, 10, 9, 8};
        int[] arr2 = {4, 4, 7, 6, 7};
        int[] arr3 = {6};

        System.out.println(minSubsequence(arr1));
        System.out.println(minSubsequence(arr2));
        System.out.println(minSubsequence(arr3));

    }

    public static List<Integer> minSubsequence(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        List<Integer> reversed = new ArrayList<Integer>();
        for (int i = nums.length - 1; i >= 0; i--) {
            reversed.add(nums[i]);
        }

        List<Integer> firstSumGreater = new ArrayList<Integer>();

        int sumLeft = 0;
        int sumRight = 0;


        for (int i = 0; i < reversed.size(); i++) {
            sumLeft = sumLeft + reversed.get(i);
            for (int j = i + 1; j < reversed.size(); j++) {
                sumRight = sumRight + reversed.get(j);
            }
            if (sumLeft <= sumRight) {
                firstSumGreater.add(reversed.get(i));
            } else if (sumLeft > sumRight) {
                firstSumGreater.add(reversed.get(i));
                break;
            }
            sumRight = 0;
        }
        return firstSumGreater;
    }
}
