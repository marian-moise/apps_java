package Algorithms;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 4};
        System.out.println(containsDuplicate(nums));
    }

//    public static boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = i + 1; j < nums.length ; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//    public static boolean containsDuplicate(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int n : nums) {
//            map.put(n, map.getOrDefault(n,0) + 1);
//        }
////        System.out.println(map.entrySet());
////        System.out.println(map.get(1));//2
//        for (int i = 0; i < map.size() ; i++) {
//            try {
//                if (map.get(i) > 1) {
//                    return true;
//                }
//            } catch (NullPointerException n) {
//                map.get(i + 1);
//            }
//
//        }
//        //System.out.println(map);
//       return false;
//    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}
