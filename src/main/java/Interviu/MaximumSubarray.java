package Interviu;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] n = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSum1(n));
        System.out.println(maximumSum2(n));

    }
    public static int maximumSum1(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum = currentSum + nums[i];
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static int maximumSum2(int[] nums) {
        int maxSum = 0;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length ; j++) {
                sum = sum + nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
