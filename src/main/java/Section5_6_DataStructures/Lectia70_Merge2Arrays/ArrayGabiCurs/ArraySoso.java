package Section5_6_DataStructures.Lectia70_Merge2Arrays.ArrayGabiCurs;

/**MAI TREBUIE LUCRAT - NU AFISEAZA CORECT!!!!
 */

public class ArraySoso {
    public static void main(String[] args) {
        int[] arr1 = {1, 1};
        int[] arr2 = {1, 1, 1, 1};

        int[] sum = sumArrays(arr1, arr2);

        System.out.println(nrFromArray(arr1));
        System.out.println(nrFromArray(arr2));
        System.out.println(nrFromArray(sum));
        printArrChars(arr1,arr2);

    }

    private static int[] sumArrays(int[] arr1, int[] arr2) {

        int sum = nrFromArray(arr1) + nrFromArray(arr2);
        return arrayFromNr(sum);
    }

    private static int nrFromArray(int[] arr) {
        int i = 0;
        String nrStr = "";

        while (i < arr.length) {
            nrStr += arr[i];
            i++;
        }
        return Integer.parseInt(nrStr);
    }

    private static int[] arrayFromNr(int nr) {

        int[] temp = new int[String.valueOf(nr).length()];
        int i = String.valueOf(nr).length() - 1;

        do {
            temp[i] = nr % 10;
            nr = nr / 10;
            i--;
        } while (nr > 0);
        return temp;
    }

    private static void printArrChars(int[] arr1, int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
