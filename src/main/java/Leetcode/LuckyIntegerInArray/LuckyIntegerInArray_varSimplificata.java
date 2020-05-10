package Leetcode.LuckyIntegerInArray;

import java.util.*;

public class LuckyIntegerInArray_varSimplificata {
    /**
     * Input: arr = [2,2,3,4]
     * Output: 2
     * Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
     */

    public static void main(String[] args) {

        int[] arr1 = {2, 2, 3, 4};
        int[] arr2 = {1, 2, 2, 3, 3, 3};
        int[] arr3 = {2, 2, 2, 3, 3};
        int[] arr4 = {5};
        int[] arr5 = {7, 7, 7, 7, 7, 7, 7};
        int[] arr6 = {4, 2, 3, 2};

        System.out.println(findLucky(arr1));
        System.out.println(findLucky(arr2));
        System.out.println(findLucky(arr3));
        System.out.println(findLucky(arr4));
        System.out.println(findLucky(arr5));
        System.out.println(findLucky(arr6));
        print(arr1);
        System.out.println("==============");
        print(arr2);
        System.out.println("==============");
        print(arr3);
        System.out.println("==============");
        print(arr4);
        System.out.println("==============");
        print(arr5);
        System.out.println("==============");
        print(arr6);
    }

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, 1 + map.getOrDefault(a, 0));

        }
        int ans = -1;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getKey() == e.getValue()) {
                ans = Math.max(ans, e.getKey());
            }
        }
        return ans;
    }

    public static void print(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            map.put(array[i], 1 + map.getOrDefault(array[i],0));
        }
//        for (int a : array) {
//            map.put(a, 1 + map.getOrDefault(a, 0));
//        }
        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            System.out.println(temp);
        }
    }

}
