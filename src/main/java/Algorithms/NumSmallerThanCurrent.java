package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class NumSmallerThanCurrent {

    public static void main(String[] args) {

        int[] arr1 = {8, 1, 2, 2, 3};
        smallerNumbersThanCurrent(arr1);


    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    counter++;
                }
            }
            list.add(counter);
            counter = 0;
        }

        int[] finalList = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            finalList[i] = list.get(i);
        }

        return print(finalList);
    }

    public static int[] print(int[] arr) {
        for (int temp : arr) {
            System.out.print(temp + " ");
        }
        return arr;
    }
}
