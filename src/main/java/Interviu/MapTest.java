package Interviu;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        int[] num = {22, 15, 35, 22, 45, 22, 22};
        String[] name = {"Gigel", "Cornel", "Andrei", "Mirel", "Gigel", "Gigel"};

        Map<Integer, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        //Map<String, Integer> table = new Hashtable<>();


        for (int i = 0; i < num.length; i++) {
            //map.put(num[i], "0");
            Integer value = map.get(num[i]);
            if (value == null) {
                value = 0;
            }
            map.put(num[i], value + 1);
            System.out.println(value);

        }
        for (int i = 0; i < name.length; i++) {
            map2.put(name[i], map2.getOrDefault(name[i], 0) + 1);
        }

        System.out.println(map);
        System.out.println(map2);


    }
}
