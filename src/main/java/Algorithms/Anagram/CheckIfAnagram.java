package Algorithms.Anagram;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAnagram {
    public static void main(String[] args) {
        String string_1 = "abba";
        String string_2 = "babc";
        System.out.println(isAnagram_(string_1, string_2));
    }

    //O(n)
    public static boolean isAnagram_(String s1, String s2) {
        if (s1.equalsIgnoreCase("") || s2.equalsIgnoreCase("")) {
            return true;
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

    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
            System.out.println(map);
        }
        //System.out.println(map);
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                int counter = map.get(c);;
                if (counter == 1) {
                    map.remove(c);
                } else {
                    map.put(c, counter - 1);
                }
            }
        }
        return map.isEmpty();
    }
}
