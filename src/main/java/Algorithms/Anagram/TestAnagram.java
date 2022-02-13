package Algorithms.Anagram;

import java.util.HashMap;
import java.util.Map;

public class TestAnagram {
    public static void main(String[] args) {
        String s1 = "123456789";
        String s2 = "574839125";

        System.out.println(checkIfStringIsAnagram(s1, s2));
    }

    private static boolean checkIfStringIsAnagram(String s1, String s2) {
        //s1.lenght = s2.length;
        //s1 || s2 are equals to "";
        //iterate through s1 an copy elements to map;
        //iterate through s2 an remove counted items;
        //if map is empty -> true : false;

        if ("".equalsIgnoreCase(s1) || s1 == null || "".equalsIgnoreCase(s2) || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))) {
                int counter = map.get(s2.charAt(i));
                if (counter == 1) {
                    map.remove(s2.charAt(i));
                } else {
                    map.put(s2.charAt(i), counter - 1);
                }
            }
        }

        return map.isEmpty();
    }
}
