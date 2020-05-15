package Section13_Algorithms_Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 2  ; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                counter++;
            }
        }
        //99 pasi
        System.out.println(Arrays.toString(array));
        System.out.println(counter);
    }
}
