package Section7_HashTables.Lectia83_First_recurring_char_app;

public class FirstRepeatedInArray {
//nu gaseste primul element care se repeta cautand in sir de la stanga la dreapta ci gaseste primul element care
    //se regaseste in lista de 2 ori!!!!!
    public static void main(String[] args) {
        ////////////////0  1  2  3  4  5  6  7
        int[] array1 = {2, 5, 8, 6, 8, 5, 1, 2};
        int[] array2 = {2, 2};
        int[] array3 = {2};
        int[] array4 = {};
        firstRepeatedInArray(array1);
        firstRepeatedInArray(array2);
        firstRepeatedInArray(array3);
        firstRepeatedInArray(array4);
    }

    public static void firstRepeatedInArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
        System.out.println("undefined");
    }
}
