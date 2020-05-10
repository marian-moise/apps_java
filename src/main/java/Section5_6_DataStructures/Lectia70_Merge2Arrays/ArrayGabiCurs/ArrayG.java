package Section5_6_DataStructures.Lectia70_Merge2Arrays.ArrayGabiCurs;

import java.util.Arrays;

/**VARIANTA CORECTA
 */

public class ArrayG {
    public static void main(String[] args) {
        int[] array1 = {9, 9};
        int[] array2 = {9, 9, 9, 9};
        //1234 + 9999 = 11233

        sumaArray(array1, array2);
    }

    public static void sumaArray(int arr1[], int[] arr2) {
        int a = 0;
        int b = 0;
        int sum;

        for (int i = 0; i < arr1.length; i++) {
            a += arr1[i] * Math.pow(10, (arr1.length - i - 1));
        }
        System.out.println(a);

        for (int i = 0; i < arr2.length; i++) {
            b += arr2[i] * Math.pow(10, (arr2.length - i - 1));
        }
        System.out.println(b);

        sum = a + b;

        System.out.println(sum);


        if (sum / Math.max(a, b) > 1) {

            int c = Math.max(arr1.length, arr2.length);
            int[] arr3 = new int[c];

            for (int i = 0; i < arr3.length; i++) {
                arr3[arr3.length - 1 - i] = sum % 10;
                sum = (sum - sum % 10) / 10;
            }
            System.out.println(Arrays.toString(arr3));

        } else {
            int c = Math.max(arr1.length, arr2.length) + 1;
            int[] arr3 = new int[c];

            for (int i = 0; i < arr3.length; i++) {
                arr3[arr3.length - 1 - i] = sum % 10;
                sum = (sum - sum % 10) / 10;
            }
            System.out.println(Arrays.toString(arr3));
        }
    }
}
