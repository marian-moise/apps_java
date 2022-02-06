package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberOfDigits {
    public static void main(String[] args) {

        int[] arr1 = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr1));

    }


    public static int findNumbers(int[] nums) {

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] > 9 && nums[i] < 100) || (nums[i] > 1000 && nums[i] < 9999) ||
                    (nums[i] > 100000 && nums[i] < 999999)) {
                counter++;
            }
        }
        return counter;
    }
}
