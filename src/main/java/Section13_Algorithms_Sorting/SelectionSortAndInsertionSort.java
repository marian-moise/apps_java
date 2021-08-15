package Section13_Algorithms_Sorting;

import java.util.Arrays;

public class SelectionSortAndInsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 9, 7, 6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                    int temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
