package Algorithms.RemoveElementFromArrayInPlace;

public class RemoveElementFromArrayInPlace {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2};
        System.out.println(removeItem(nums, 2));
    }

    public static int removeItem(int[] nums, int val) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
