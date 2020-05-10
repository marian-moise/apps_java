package Section7_HashTables.Lectia83_First_recurring_char_app;

public class FirstRecurringChar {

    public static void main(String[] args) {
        ////////////////0  1  2  3  4  5  6  7
        int[] array1 = {2, 5, 8, 6, 8, 5, 1, 10};
        int[] array2 = {2, 2};
        int[] array3 = {2};
        int[] array4 = {};
        System.out.println(firstRecurring(array1));
        System.out.println(firstRecurring(array2));
        System.out.println(firstRecurring(array3));
        System.out.println(firstRecurring(array4));
    }

    public static int firstRecurring(int[] array) {

        int recElement = 0;
        int[] container = new int[array.length];

        int i = 0;

        while (recElement == 0) {
            if (array.length == 1) {
                return array[i];
            } else if (array.length == 0) {
                return recElement;
            } else {
                i++;
                if (array[i] != array[i - 1]) {
                    container[i - 1] = array[i - 1];
                    for (int j = 0; j < container.length; j++) {
                        if (array[i] == container[j]) {
                            recElement = array[i];
                            break;
                        }
                    }
                } else {
                    recElement = array[i];
                }
            }
        }
        return recElement;
    }
}
