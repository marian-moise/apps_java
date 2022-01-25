package Interviu.FindVowlsNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountVowls {
    public static void main(String[] args) {
        String string = "pneumonoultramicroscopicsilicovolcaniconioza";
        //answer : 18 vocale

        System.out.println(numberOfVowls_1(string));
        System.out.println(numberOfVowls_2(string));
        System.out.println(numberOfVowls_3(string));

        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }

    private static int numberOfVowls_1(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }
        return counter;
    }

    private static long numberOfVowls_2(String string) {
        return string.chars().mapToObj(ch -> (char) ch).filter(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u').count();
    }

    private static long numberOfVowls_3(String string) {
        return string.chars().filter(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u').count();
    }
}
