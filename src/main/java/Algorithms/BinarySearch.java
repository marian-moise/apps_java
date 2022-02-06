package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 9;
        System.out.println(binarySearch(arr, target));
    }

    public static boolean binarySearch (int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid +1;
            }
        }
        return false;
    }
}
