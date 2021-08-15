package Interviu;

import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println((Arrays.toString(findIndexes(nums, 18))));;
    }

    public static int[] findIndexes(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
