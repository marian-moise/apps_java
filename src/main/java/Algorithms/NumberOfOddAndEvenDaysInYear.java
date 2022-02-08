package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOddAndEvenDaysInYear {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ianuarie", 31);
        map.put("februarie", 28);
        map.put("martie", 31);
        map.put("aprilie", 30);
        map.put("mai", 31);
        map.put("iunie", 30);
        map.put("iulie", 31);
        map.put("august", 31);
        map.put("septembrie", 30);
        map.put("octombrie", 31);
        map.put("noiembrie", 30);
        map.put("decembrie", 31);

        System.out.println("Numbers ODD in year: " + countOddNumbersInYear(map));
        System.out.println("Numbers EVEN in year: " + countEvenNumbersInYear(map));

        int count = 0;
        int count2 = 0;
        int sum = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            count = getSumOfEvenNumbers(entry.getValue()) + count;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            count2 = getSumOfOddNumbers(entry.getValue()) + count2;
        }

        sum = count  +count2;
        int count3 = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            count3 = entry.getValue() + count3;
        }

        System.out.println("Suma calculata este:" + sum);
        System.out.println("Suma de intrare este:" + count3);
    }

    public static int countOddNumbersInYear(Map<String, Integer> map) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            count = getSumOfOddNumbers(entry.getValue()) + count;
        }
        return count;
    }

    public static int countEvenNumbersInYear(Map<String, Integer> map) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            count = getSumOfEvenNumbers(entry.getValue()) + count;
        }
        return count;
    }

    private static int getSumOfOddNumbers(int number) {
        return number / 2 + 1;
    }

    private static int getSumOfEvenNumbers(int number) {
        return number / 2;
    }
}
