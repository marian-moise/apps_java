package Algorithms.LongestCommonPrefixI;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flex"};
        //functia trebuie sa returneze prefixul de lungime maxima comun tuturor stringurilor din array

        System.out.println(longestCommonPrefix(arr));
    }

    private static String longestCommonPrefix(String[] arr) {
        StringBuilder sb = new StringBuilder();
        if (arr == null || arr.length == 0) {
            return sb.toString();
        }

        //iterate through first string:
        for (int i = 0; i < arr[0].length(); i++) {
            //iterate through array of strings but from the next index:
            for (int j = 1; j < arr.length; j++) {
                if (i >= arr[j].length() || arr[0].charAt(i) != arr[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(arr[0].charAt(i));
        }
        return sb.toString();
    }
}
