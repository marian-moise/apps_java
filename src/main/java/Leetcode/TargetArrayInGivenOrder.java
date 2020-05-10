package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

/**
        Explanation:
        nums       index     target
        0            0        [0]
        1            1        [0,1]
        2            2        [0,1,2]
        3            2        [0,1,3,2]
        4            1        [0,4,1,3,2]
 */

        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            arrList.add(index[i],nums[i]);
        }

        int[] arrFinal = new int[arrList.size()];

        for (int i = 0; i < arrFinal.length; i++) {
            arrFinal[i] = arrList.get(i);
        }
        return arrFinal;
    }
}
