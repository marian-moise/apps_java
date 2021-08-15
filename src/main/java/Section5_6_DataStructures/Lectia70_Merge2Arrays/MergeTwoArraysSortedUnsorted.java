package Section5_6_DataStructures.Lectia70_Merge2Arrays;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoArraysSortedUnsorted {

    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 1, 3, 5, 9};
        int[] arr2 = {3, 6, 30};
        int[] arr3 = {-1, 0, 1, 9, -2, 8};
        int[] arr4 = {2, 30, 6};
        int[] arr3Sorted = sortArray(arr3);
        int[] arr4Sorted = sortArray(arr4);

//        sortAndMerge(arr3, arr4);

        int[] ints = mergeTwoArrays(arr1, arr1.length, arr2, arr2.length);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
//        System.out.println("");
//        int[] ints1 = mergeTwoArrays(arr3Sorted, arr3Sorted.length, arr4Sorted, arr4Sorted.length);
//        for (int i = 0; i < ints1.length; i++) {
//            System.out.print(ints1[i] + " ");
//        }
//        arr(arr1, arr1.length);
    }

    public static int[] mergeTwoArrays(int[] arr1, int arr1Length, int[] arr2, int arr2Length) {

        int[] arr3 = new int[arr1Length + arr2Length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else arr3[k++] = arr2[j++];
        }

        while (i < arr1Length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2Length) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] arr(int[] arr1, int arr1Length) {

        int[] arr3 = new int[arr1Length];
        int i = 0;
        int k = 0;

        while (i < arr1Length) {
            arr3[k++] = arr1[i++];
            System.out.println(k);
        }

        return arr3;
    }

    public static void sortAndMerge(int[] arr1, int[] arr2) {
        Map<Integer, Boolean> map = new HashMap<>();
        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], true);
        }

        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], true);
        }

        for (Map.Entry<Integer, Boolean> e : map.entrySet()) {
            System.out.println(e.getKey() + " ");
        }
    }
}
