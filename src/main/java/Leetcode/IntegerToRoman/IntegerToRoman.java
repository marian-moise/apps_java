package Leetcode.IntegerToRoman;

public class IntegerToRoman {
    /**
     - scrise de la cel mai mare la cel mai mic stanga-dreapta;
     - 4 se scrie IV si nu IIII;
     - 9 se scrie IX si nu IIIIIIIII;
     - exista 6 cazuri cand se foloseste scaderea:
     1. cand avem I in fata lui V sau X ca sa ne dea 4 sau 9;
     2. cand avem X in fata lui L sau C ca sa ne dea 40 sau 90;
     3. cand avem C in fata lui D sau M ca sa ne dea 400 sau 900;

     */

    //TREBUIE FACUTA SI VARIANTA CU ROMAN TO INTEGER;

    public static void main(String[] args) {

        int number = 104;
        System.out.println(intToRoman(number));;
    }

    public static String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        int counter;
        String[] romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] ints = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        for (int i = ints.length - 1; i >= 0 ; i--) {
            counter = num / ints[i];
            num = num % ints[i];

            while (counter > 0) {
                sb.append(romans[i]);
                counter--;
            }
        }
        return sb.toString();
    }
}
