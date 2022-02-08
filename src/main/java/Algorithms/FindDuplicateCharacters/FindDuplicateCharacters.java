package Algorithms.FindDuplicateCharacters;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String s = "aabbbccxvvv";

        System.out.println(numberOfRepeatingCharacters(s));
        System.out.println(charactersThatRepeatMoreThanTwice(s));
        System.out.println(charactersThatRepeatTwice(s));
    }

    public static int numberOfRepeatingCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                counter++;
            }
        }

        return counter;
    }

    public static String charactersThatRepeatMoreThanTwice(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 2) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }

    public static String charactersThatRepeatTwice(String s) {

        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }
}
