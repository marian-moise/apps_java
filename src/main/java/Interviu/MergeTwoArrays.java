package Interviu;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {0, 4, 3, 5};
        int[] arr2 = {6, 4, 9, 8, 10};
        mergeArrays(arr1, arr2);
    }

    public static void mergeArrays(int[] arr1, int[] arr2) {

        int[] mergedArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < mergedArr.length; i++) {
            mergedArr[i] = arr2[j];
            j++;
        }
        sortArray(mergedArr);
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + ",");
        }
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
