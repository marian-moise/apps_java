package Algorithms.NeedleInHaystack;

public class NeedleInHaystack {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {

        if (needle == null || needle.length() == 0) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        return haystack.indexOf(needle);
    }
}
