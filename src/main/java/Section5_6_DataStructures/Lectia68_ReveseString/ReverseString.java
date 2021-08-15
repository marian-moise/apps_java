package Section5_6_DataStructures.Lectia68_ReveseString;

public class ReverseString {
    public static void main(String[] args) {
        //String : "Hi my name is Andrei"
        String string1 = "Hi my name is Andrei";
        String[] array1 = new String[string1.length()];
//        StringBuilder stringBuilder = new StringBuilder(string1);

        //System.out.println(string1.length());
        //System.out.println(string1.charAt(0));
//        System.out.println("varianta cu metoda facuta manual: ");
//        reverseString(string1,array1);
//        System.out.println();
//        System.out.println("===================================");
//        System.out.println("varianta cu metoda built in: ");
//        System.out.println(stringBuilder.reverse());
//        reverseString(string1, array1);
        String s = reverseString2(string1);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(String.valueOf(s.charAt(i)) + " ");
        }

    }

    public static void reverseString(String string, String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = String.valueOf(string.charAt(i));
            System.out.print(array[i]);
        }
    }

    public static String reverseString2(String str) {
        char[] initialChars = str.toCharArray();
        char[] reversed = new char[str.length()];
        int k = 0;
        for (int i = str.length() - 1; i >= 0 ; i--) {
            while (k < str.length()) {
                reversed[k] = initialChars[i];
                k++;
            }
        }
        return reversed.toString();
    }
}
