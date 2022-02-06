package Algorithms;

import java.util.*;

public class IntersectionOfTwoArrays_Set {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 5, 8, 4};
        System.out.println(intersect(nums1, nums2));
    }


    public static Set<Integer> intersect(int[] nums1, int[] nums2) {

        Set<Integer> tempSet = new HashSet<>();
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums1.length; i++) {
            tempSet.add(nums1[i]);
        }
        return tempSet;
    }
}
