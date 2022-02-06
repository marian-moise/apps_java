package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList2 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 8, 2};
        decompressRLEList(arr);
    }

    public static int[] decompressRLEList(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
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

