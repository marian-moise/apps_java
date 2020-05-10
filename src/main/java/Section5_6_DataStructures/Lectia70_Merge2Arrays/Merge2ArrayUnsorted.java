package Section5_6_DataStructures.Lectia70_Merge2Arrays;

import java.util.Arrays;


public class Merge2ArrayUnsorted {
    //arr1 = {0,3,4,31}
    //arr2 = {4,6,30}
    //sortedArr = {0, 3, 4, 4, 6, 30, 31}

    public static void main(String[] args) {

        int[] array1 = {3, 2, 5, 8};
        int[] array2 = {1};

        System.out.println(Arrays.toString(mergeAndSortArrays(array1, array2)));

    }

    public static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int count = 0;
        int temp;

        if (arr1.length == 0) {
            System.out.println("arr1 is 0!!!");
        }

        if (arr2.length == 0) {
            System.out.println("arr2 is 0!!!");
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            count++;
        }
        //System.out.println(count);

        for (int j = 0, i = count; j < arr2.length; j++, i++) {
            arr3[i] = arr2[j];
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] >= arr3[j]) {
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        return arr3;
    }
}
