package Algorithms.RemoveDuplicatesInPlace;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2};
        System.out.println(removeDuplicates(nums));

//        int i = 0;
//        System.out.println(i);
//        System.out.println(i++);
//        System.out.println(i);
//
//        System.out.println("=============");
//
//        int j = 0;
//        System.out.println(j);
//        System.out.println(++j);
//        System.out.println(j);

    }

    public static int removeDuplicates(int[] nums) {
        int a = 0;
        int b = 1;
        while (b < nums.length) {
            if (nums[a] != nums[b]) {
                nums[++a] = nums[b];
            }
            b++;
        }
        return a + 1;
    }
}
