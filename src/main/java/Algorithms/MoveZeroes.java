package Algorithms;
import java.util.Arrays;


public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

    }


    public static void moveZeroes(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                cnt++;
            }
            else{
                nums[i - cnt] = nums[i];
            }
        }

        for(int i=n-1;i>n-1-cnt;i--){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
