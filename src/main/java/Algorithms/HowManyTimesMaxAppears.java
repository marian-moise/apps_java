package Algorithms;

public class HowManyTimesMaxAppears {
    public static void main(String[] args) {
        int[] nums = {9, 9, 10, 10, 10};
        System.out.println(numberOfAppearancesOfMaxNr(nums));
    }

    public static int numberOfAppearancesOfMaxNr(int[] arr) {
        int currentMax = arr[0];
        int numberOfAppearances = 1;

        for (int i = 1; i < arr.length; i++) {
            if (currentMax < arr[i]) {
                currentMax = arr[i];
            }
            if (currentMax == arr[i]) {
                if (numberOfAppearances != 1) {
                    numberOfAppearances = 1;
                }
                numberOfAppearances++;
            }
        }
        return numberOfAppearances;
    }
}
