package Algorithms.MaximumSubstringNorepeatingChars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcabcaaa";
        System.out.println(lengthOfLongestSubstring_1(s));;
    }

    public static int lengthOfLongestSubstring_1(String s) {
        int max = 0;
        int curr = 0;
        int i = 0;

        Map<Character, Integer> hp = new HashMap<>();

        while (i < s.length()) {
            if (hp.containsKey(s.charAt(i))) {
                curr = 0;
                i = hp.get(s.charAt(i));
                hp.clear();
            } else {
                curr = curr + 1;
                hp.put(s.charAt(i), i);
            }
            max = Math.max(max, curr);
            i++;
        }
        return max;

    }

    public static int lengthOfLongestSubstring_2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<StringBuilder> substrings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int max = 0;

        if (s.length() == 1) {
            return 1;
        } else if (s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
                sb.append(s.charAt(i));
                if (i == s.length() - 1) {
                    substrings.add(sb);
                }
            } else {
                substrings.add(sb);
                map.clear();
                sb = new StringBuilder();
                sb.append(s.charAt(i));
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (StringBuilder string : substrings) {
            if (string.length() > max) {
                max = string.length();
                System.out.println(string);
            }
        }

        return max;
    }
}
