package OOP.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {
    public static void main(String[] args) {
        Amplificator amplificator_1 = new Amplificator(1, "Fender");
        Amplificator amplificator_2 = new Amplificator(1, "Fender");

        Map<Amplificator, Integer> map = new HashMap<>();
        map.put(amplificator_1, 1);
        map.put(amplificator_2, 2);

        //map.clear();
        System.out.println(map.containsKey(amplificator_1));
        System.out.println(map.containsValue(1));
        System.out.println(map.isEmpty());
        System.out.println(map.get(amplificator_1));

        for (Map.Entry<Amplificator, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set<Amplificator> ampSet = map.keySet();
        System.out.println(ampSet);
        Collection<Integer> values = map.values();
        System.out.println(values);

        Map<Amplificator, Integer> map_2 = new HashMap<>();
        Amplificator amplificator_3 = new Amplificator(1, "Marshall");
        map_2.put(amplificator_3, 1);
        map.putAll(map_2);
        map.remove(amplificator_3);

        System.out.println(map);
        System.out.println(map.size());


        Map<Amplificator, String> map_3 = new HashMap<>();
        map_3.put(amplificator_1, "Red");
        map_3.put(amplificator_1, "Blue");

        System.out.println(map_3.values());

    }
}
