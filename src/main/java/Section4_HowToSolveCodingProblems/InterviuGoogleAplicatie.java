package Section4_HowToSolveCodingProblems;

public class InterviuGoogleAplicatie {

    public static void main(String[] args) {

        int array1[] = {1, 2, 4, 4};
        int array2[] = {1, 2, 3, 9};
        int sum1 = 8;
       // System.out.println(hasPairWithSum(array1, sum1));
        System.out.println(hasPairWithSum(array2, sum1));


    }

    static boolean hasPairWithSum(int array[], int sum) {
        int low = 0;
        int hi = array.length - 1;

        while (low < hi) {
            int s = array[low] + array[hi];
            if (s == sum) {
                break;
            }
        }
        return true;
    }

}
