package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReformatTheString {
    public static void main(String[] args) {

        String string1 = "abcd123";
        System.out.println(reformatString(string1));
    }


    public static String reformatString(String s) {

        if(s == null || s.length() <= 1) {
            return s;
        }

        List<Character> digits = new ArrayList<Character>();
        List<Character> characters = new ArrayList<Character>();

        for (int i = 0; i < s.length() ; i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits.add(s.charAt(i));
            } else {
                characters.add(s.charAt(i));
            }
        }

        if(Math.abs(digits.size() - characters.size()) >= 2) return "";

        StringBuilder result = new StringBuilder();

        boolean digitOrChar;

        if (digits.size() >= characters.size()) {
            digitOrChar = true;
        } else {
            digitOrChar = false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (digitOrChar) {
                if (digits.size() > 0) {
                    result.append(digits.remove(0));
                }
            } else {
                if (characters.size() > 0) {
                    result.append(characters.remove(0));
                }
            }
            digitOrChar = !digitOrChar;
        }
        return result.toString();
    }
}
