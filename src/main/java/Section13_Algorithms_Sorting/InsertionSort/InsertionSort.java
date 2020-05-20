package Section13_Algorithms_Sorting.InsertionSort;
import java.util.Arrays;


public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
//        int[] array = {99, 44, 6, 2, 1, 5};
        insertSort(array);

    }

    public static void insertSort(int[] array) {
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(counter);
    }
}
