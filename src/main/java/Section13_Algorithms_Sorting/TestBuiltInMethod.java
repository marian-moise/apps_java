package Section13_Algorithms_Sorting;

import java.util.Arrays;

public class TestBuiltInMethod {
    public static void main(String[] args) {
        String[] input1 = {"a", "x", "c", "z", "e"};
        int[] input2 = {0, 24, 7, 2, 5, 2, 11};

        Arrays.sort(input1);
        Arrays.sort(input1);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
    }
}
