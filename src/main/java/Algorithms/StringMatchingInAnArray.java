package Algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringMatchingInAnArray {
    /**
     * Input: words = ["mass","as","hero","superhero"]
     * Output: ["as","hero"]
     * Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
     * ["hero","as"] is also a valid answer.
     */

    public static void main(String[] args) {

        String[] words = {"mass", "as", "hero", "superhero"};
        System.out.println(stringMatching(words));

    }


    public static List<String> stringMatching(String[] words) {
        HashSet<String> newList = new HashSet<String>();

        for (int i = 0; i < words.length ; i++) {
            String current = words[i];
            for (int j = i + 1; j < words.length ; j++) {
                String next = words[j];
                if(current.contains(next)) {
                    newList.add(next);
                } else if (next.contains(current)) {
                    newList.add(current);
                }
            }
        }
        List<String> res = new ArrayList<String>(newList);
        return res;
    }
}
