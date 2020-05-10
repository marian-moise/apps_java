package Leetcode.LuckyIntegerInArray;

import java.util.*;

public class LuckyIntegerInArray {
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

        System.out.println(returnLucky(arr1));
        System.out.println(returnLucky(arr2));
        System.out.println(returnLucky(arr3));
        System.out.println(returnLucky(arr4));
        System.out.println(returnLucky(arr5));
        System.out.println(returnLucky(arr6));
    }

    public static List<Integer> returnLucky(int[] arr) {

        //sortare array:

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        Set<Integer> luckylist = new HashSet<Integer>();

        int countOcurrency = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length <= 1) {
                luckylist.add(-1);
            } else if (arr[0] == arr[arr.length - 1]) {
                luckylist.add(arr[i]);
                break;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        countOcurrency++;
                    }
                }
                countOcurrency++;
                if (countOcurrency > 1) {
                    luckylist.add(countOcurrency);
                }
                countOcurrency = 0;
            }
        }

        //am facut o copie a setului sub forma de array ca sa pot accesa lista dupa fiecare index;
        List<Integer> luckyListAsArray = new ArrayList<Integer>(luckylist);
        //am facut final/list ca sa bag doar maximele in lista
        List<Integer> finalList = new ArrayList<Integer>();

        int maxOcurrency = 0;

        if (luckylist.size() == 1) {
            return luckyListAsArray;
        }

        for (int i = 1; i < luckylist.size(); i++) {
            maxOcurrency += Math.max(luckyListAsArray.get(i), luckyListAsArray.get(i - 1));
            finalList.add(maxOcurrency);
        }
        return finalList;
    }
}
