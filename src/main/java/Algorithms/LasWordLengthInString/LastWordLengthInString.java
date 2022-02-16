package Algorithms.LasWordLengthInString;

public class LastWordLengthInString {
    public static void main(String[] args) {
        String s = " q ";
        System.out.println(lengthWord(s));
    }

    public static int lengthWord(String s) {
        int currLength = 0;
        int lastLengthFound = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                currLength++;
                lastLengthFound = currLength;
            } else {
                currLength = 0;
            }
        }
        return lastLengthFound;
    }
}
