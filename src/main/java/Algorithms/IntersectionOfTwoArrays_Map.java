package Algorithms;


import java.util.*;

public class IntersectionOfTwoArrays_Map {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,5,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersect = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();


        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num) - 1);
                intersect.add(num);
            }
        }

        int index=0;
        int[] result = new int[intersect.size()];
        for(int num : intersect) {
            result[index++]=num;
        }
        return result;
    }
}
