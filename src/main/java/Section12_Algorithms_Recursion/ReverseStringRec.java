package Section12_Algorithms_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringRec {
    public static void main(String[] args) {

        String input = "yoyo mastery";
//        reverseStringIt(input);
//        reverseIt(input);
        System.out.println(reverseRec(input));;
    }


//    public static void reverseStringIt(String input) {
//        String[] rev = new String[input.length()];
//        for (int i = input.length() - 1 ; i >= 0; i--) {
//            rev[input.length() - 1 - i] = String.valueOf(input.charAt(i));
//            System.out.print(rev[i] + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(rev));
//    }

    public static void reverseStringIt(String input) {
        String[] rev = new String[input.length()];
        int j = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            rev[j] = String.valueOf(input.charAt(i));
            j++;
        }
        System.out.println();
        System.out.println(Arrays.toString(rev));
    }


    public static void reverseIt(String input) {
        List<Character> rev = new ArrayList<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            rev.add(input.charAt(i));
        }
        System.out.println(rev);
    }


    public static String reverseRec(String input) {
        if (input.equalsIgnoreCase("")) {
            return "";
        }
        return reverseRec(input.substring(1)) + input.charAt(0);
    }
}
