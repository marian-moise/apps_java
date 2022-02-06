package Algorithms;

public class LongestWordInString {
    public static void main(String[] args) {
        String s = "Ego Zenovius votum posui";
        System.out.println(longestWord(s));
    }

    public static String longestWord(String str) {
        String[] arr = str.split(" ");
        String maxWordLength = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxWordLength.length()) {
                maxWordLength = arr[i];
            }
        }
        return maxWordLength;
    }
}
