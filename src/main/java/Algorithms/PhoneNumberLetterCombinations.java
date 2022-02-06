package Algorithms;

import java.util.*;

public class PhoneNumberLetterCombinations {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(letterCombinations("23")));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuw", "wxyz"};
        List<String> results = new ArrayList<>();
        List<String> listTemp1 = new ArrayList<>();
        List<String> listTemp2 = new ArrayList<>();

        results.add("");

        for (int i = 0; i < digits.length() ; i++) {
            for (int j = 0; j < mapping.length; j++) {
                if (digits.charAt(i) - '0' == j) {
                    listTemp1.add(mapping[j]);
                }
                results = listTemp1;
                for (int k = 0; k < results.size(); k++) {

                }
            }
        }

        return  null;
    }
}
