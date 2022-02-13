package OOP.string;

import java.math.BigDecimal;
import java.util.*;

public class StringTest_1 {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";
        String s3 = new String("test");

        int[] arr = {1,2,3,4,5,6,7};
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr2);

//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));

        Map<Integer, String> mapUnsorted = new HashMap<>();
        Map<Integer, String> mapSorted = new TreeMap<>();

        mapUnsorted.put(5, "asd");
        mapUnsorted.put(3, "ccc");
        mapUnsorted.put(9, "asd");
        mapUnsorted.put(0, "cc");
        System.out.println(mapUnsorted.toString());

        mapSorted.put(5, "c");
        mapSorted.put(3, "asd");
        mapSorted.put(9, "asd");
        mapSorted.put(0, "cc");
        System.out.println(mapSorted.toString());

        String ss1 = "123123";
        String ss2 = "12312313123123123123123123";

        BigDecimal bd = new BigDecimal(ss1);
        BigDecimal bd2 = new BigDecimal(ss2);

        System.out.println(bd);
        System.out.println(bd2);

    }
}
