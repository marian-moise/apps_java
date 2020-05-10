package Section7_HashTables.Lectia78_Maps;

import java.util.HashMap;
import java.util.Map;

public class BascketRunner {
    public static void main(String[] args) {

        Bascket bascket1 = new Bascket("grapes",100);
        Bascket bascket2 = new Bascket("apples",150);
        Bascket bascket3 = new Bascket("strawberrys",500);

        Map<String,Bascket> container1 = new HashMap<String, Bascket>();
        container1.put(bascket1.getFruits(),bascket1);
        container1.put(bascket2.getFruits(),bascket2);
        container1.put(bascket3.getFruits(),bascket3);

        Map<String,Bascket> container2 = new HashMap<String, Bascket>();
        bascket1.setFruits("blabla");
        bascket2.setQuantity(200);
        bascket3.setFruits("grapes");
        container2.put(bascket1.getFruits(),bascket1);
        container2.put(bascket2.getFruits(),bascket2);
        container2.put(bascket3.getFruits(),bascket3);

        System.out.println(container1);
        System.out.println(container2);

    }
}
