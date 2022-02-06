package Algorithms;

public class MajorityElement {
    public static void main(String[] args) {
        //int[] array = {2, 2, 1, 1, 2};
        int[] array = {2,5,5,2,5,2,5,2,2,5,2,2};
        System.out.println(majorityElement(array));

    }

    public static int majorityElement(int[] nums) {
        //int[] nums = {2, 2, 1, 1, 2};
        int lengthArrCount = nums.length/2;


        for (int i = 0; i < nums.length; i++) {
            int counter = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter ++;
                }
            }

            if (counter > lengthArrCount) {
                return nums[i];
            }


        }

        return -1;
    }
}
