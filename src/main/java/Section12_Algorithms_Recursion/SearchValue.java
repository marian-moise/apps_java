package Section12_Algorithms_Recursion;

public class SearchValue {
    public static void main(String[] args) {
        int[] a = {1, 5, 22, 14, 16, 9, 27};
        System.out.println(recursiveLinearSearch(a, a[0], 16));
    }

    public static int recursiveLinearSearch(int [] arr, int position,  int searchedValue) {
        int result = 0;

        if (position <= arr.length) {
            result = recursiveLinearSearch(arr, position + 1, searchedValue);
            if (searchedValue == arr[position - 1]) {
                result = searchedValue;
                System.out.println("Found searched value!!!");
            }
        }

        return result;
    }
}
