package Section7_HashTables.Lectia83_First_recurring_char_app;

import java.util.HashSet;

public class FirstRecurringChar_cu_HashSet {

    public static void main(String[] args) {
        ////////////////0  1  2  3  4  5  6  7
        int[] array1 = {2, 5, 8, 6, 8, 5, 1, 10};
        int[] array2 = {2, 2};
        int[] array3 = {2};
        int[] array4 = {};
        System.out.println(firstRecurring(array1));
//        System.out.println(firstRecurring(array2));
//        System.out.println(firstRecurring(array3));
//        System.out.println(firstRecurring(array4));
    }

    public static int firstRecurring(int[] array) {

        int recursiveElement = 0;

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            recursiveElement = array[i];

            if (set.contains(recursiveElement)) {
                return recursiveElement;
            } else {
                set.add(recursiveElement);
            }
        }
        return recursiveElement;
    }
}
