package Algorithms.Anagram;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("egozenoviusvotumposui", "ziteousvivumzoogenous"));
    }
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character,Integer> container = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            container.put(str1.charAt(i), container.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str1.length(); i++) {
            container.remove(str2.charAt(i));
        }

        if (container.size() == 0) {
            return true;
        }
        return false;
    }
}
