package Interviu;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        //int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums = {0};
        System.out.println(missingNumber(nums));;
    }

    public static int missingNumber(int[] nums) {

//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = i + 1; j < nums.length ; j++) {
//                if (nums[i] > nums[j]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }

        Arrays.sort(nums);

        // Ensure that n is at the last index
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }

        int number = 0;

        for (int i = 0; i < nums.length - 1 ; i++) {
            if ((nums[i + 1] - nums[i]) > 1) {
                number += nums[i] + 1;
            }
        }
        return number;
    }
}
