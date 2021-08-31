package Interviu.Anagram;

import java.util.*;

public class ValidAnagram_Map {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "agranam";
        System.out.println(isAnagram(s, t));
        //isAnagram(s,t);
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
                }
                else {
                    map.put(c, counter - 1);
                }
            }
        }
        return map.isEmpty();
    }
}
