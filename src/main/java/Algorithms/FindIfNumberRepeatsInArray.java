package Algorithms;

import java.util.HashSet;
import java.util.Set;

public class FindIfNumberRepeatsInArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(hasDuplicate1(nums));
        System.out.println(hasDuplicate2(nums));
    }

    //O(n^2)
    public static boolean hasDuplicate1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   return true;
                }
            }
        }
        return false;
    }

    //O(n)
    public static boolean hasDuplicate2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
