package Section13_Algorithms_Sorting.InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        insertSort(array);

    }

    public static void insertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));
    }
}
