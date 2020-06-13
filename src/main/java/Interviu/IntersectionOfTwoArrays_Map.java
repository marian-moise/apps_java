package Interviu;


import java.util.*;

public class IntersectionOfTwoArrays_Map {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x,map.getOrDefault(x,0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums2.length ; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                list.add(nums2[i]);
            }
        }

        int[] intersect = new int[list.size()];

        for (int i = 0; i < list.size() ; i++) {
            intersect[i] = list.get(i);
        }
            return intersect;
    }
}
