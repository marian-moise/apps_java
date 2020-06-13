package Interviu;

public class ExcellSheetColumnNumber {
    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(titleToNumber(s));

        String s2 = "A";
        char[] chars2 = s2.toCharArray();
        int number = 0;
        //number = number + chars2[0] - 'A';
        System.out.println(
                (chars2[0] + 1) - 'A');
    }

    public static int titleToNumber(String s) {

        char[] chars = s.toCharArray();
        int number = 0;
        for (int i = 0; i < chars.length ; i++) {
            number +=  (((chars[i] + 1) - 'A') * Math.pow(26, chars.length - 1 -i));
        }
        return number;
    }
}
