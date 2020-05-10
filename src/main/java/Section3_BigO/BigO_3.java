package Section3_BigO;

public class BigO_3 {

    //log all pairs;
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        pairLoging(array1);

    }

    public static void pairLoging (int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                System.out.println(array[i] + " " +  array[j]);
            }
        }
    }
}
