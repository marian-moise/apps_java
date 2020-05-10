package Leetcode.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerV2 {
    public static void main(String[] args) {

        System.out.println(romanToInt("CXXIV"));

    }

    public static int romanToInt(String string) {

        //cifrele romane se aduna daca prima valoare este mai mare sau egala cu valoarea urmatoare;
        //cifrele romane se scad daca prima valoare este mai mica decat urmatoarea valoare;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        //CXXIV

        for (int i = 0; i < string.length(); i++) {

            if (i > 0  && map.get(string.charAt(i)) > map.get(string.charAt(i - 1))) {

                result += map.get(string.charAt(i)) - 2 * map.get(string.charAt(i - 1));

                //mai intai se analizeaza varianta din else dupa care se intra in prima conditie cu result = 121
                // se face undo pt ca numarul de dinaintea numarului la care s a ajuns este mai mic decat numarul curent
                //adica result = 121 - 1 + 5 - 1, rezultand 124, se iese din for pt ca s a ajuns la finalul stringului;

            } else {

                result += map.get(string.charAt(i));

            }
        }
        return result;
    }
}
