package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumV2 {
    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }


//    public static int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[j]) == target - nums[i]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();
        int complement;

        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (complements.containsKey(complement)) {
                return new int[] {complements.get(complement), i};
            } else {
                complements.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No pair found");
    }
}
