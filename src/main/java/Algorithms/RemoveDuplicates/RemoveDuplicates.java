package Algorithms.RemoveDuplicates;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return n;
        }

        int i = 2;

        for (int j = i; j < n; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i++] = nums[j];
            }
        }

        return i;
    }
}
