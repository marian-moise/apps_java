package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
       // int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        List<Integer> noDupl = new ArrayList<>();
        for (int i : nums) {
            if (!noDupl.contains(i)) {
                noDupl.add(i);
            } else {
                noDupl.remove(Integer.valueOf(i));
            }
        }
        return noDupl.get(0);
    }
}
