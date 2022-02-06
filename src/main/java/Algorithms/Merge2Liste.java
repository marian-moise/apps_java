package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Merge2Liste {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        System.out.println(combine(list1,list2));;





    }

    public static List<Integer> combine (List<Integer> list1, List<Integer> list2 ) {

        List<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < list2.size() ; i++) {
            list3.add(i,list2.get(i));
        }

        for (int i = 0; i < list1.size() ; i++) {
            list3.add(i,list1.get(i));
        }

        return list3;
    }
}
