package Section5_6_DataStructures.Lectia70_Merge2Arrays;

import java.util.Arrays;

/**
 * //https://www.youtube.com/watch?v=zwPUBnl6pBU
 */

public class Merge2ArraySorted {

    public static void main(String[] args) {

        int[] array1 = {0, 3, 4, 31};
        int[] array2 = {4, 6, 30};

        System.out.println(Arrays.toString(mergeAndSortArrays(array1, array2)));

    }

    public static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;


        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }


}
