package Section5_6_DataStructures.Lectia68_ReveseString;

public class ReverseString {
    public static void main(String[] args) {
        //String : "Hi my name is Andrei"
        String string1 = "Hi my name is Andrei";
        String[] array1 = new String[string1.length()];
        StringBuilder stringBuilder = new StringBuilder(string1);



        //System.out.println(string1.length());
        //System.out.println(string1.charAt(0));
        System.out.println("varianta cu metoda facuta manual: ");
        reverseString(string1,array1);
        System.out.println();
        System.out.println("===================================");
        System.out.println("varianta cu metoda built in: ");
        System.out.println(stringBuilder.reverse());

    }

    public static String reverseString(String string, String[] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            array[i] = String.valueOf(string.charAt(i));
            System.out.print(array[i]);
        }
        return string;
    }
}
