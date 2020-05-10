package Section4_HowToSolveCodingProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AplicatieInterviu {


    public static void main(String[] args) {
        //o functie care sa returneze true sau false daca arrayurile urmatoare contin elemente comune
        // 2 parametri - nu avem limita de spatiu;
        //returnul trebuie sa fie de tip booolean;

//        int a;
//        int b;
//        a = 5;
//        b = 3;
//
//       // a = 5 + 3   ==> a = 8       a = a + b;
//       // b = 8 - 3   ==> b = 5       b = a - b;
//       // a = 8 - 5   ==> a = 3       a = a - b;
//
//        a = 3;
//        b = 5;
//        // c = a   c = 3
//        // b = c   b = 3
//        //a = b    a = 5
//
//        System.out.println(a = a + b);
//        System.out.println("b= " + (b = a - b));
//        System.out.println("a= " + (a = a - b));
        //System.out.println(a + " " + b);


        String[] array1 = {"a", "b", "c", "x"};
        String[] array2 = {"w", "y", "m"};

        Arr1Obj arr1Obj1 = new Arr1Obj("a", true);
        Arr1Obj arr1Obj2 = new Arr1Obj("b", true);
        Arr1Obj arr1Obj3 = new Arr1Obj("c", true);
        Arr1Obj arr1Obj4 = new Arr1Obj("x", true);

        Map<String, Arr1Obj> mapa1 = new HashMap<String, Arr1Obj>();
        mapa1.put(arr1Obj1.getKey(), arr1Obj1);
        mapa1.put(arr1Obj2.getKey(), arr1Obj2);
        mapa1.put(arr1Obj3.getKey(), arr1Obj3);
        mapa1.put(arr1Obj4.getKey(), arr1Obj4);

//        System.out.println(mapa1);
        System.out.println("=====================");
        System.out.println(containsPair1(array1,array2));


        Set<Map.Entry<String, Arr1Obj>> entries1 = mapa1.entrySet();
        Iterator<Map.Entry<String, Arr1Obj>> iterator = entries1.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Arr1Obj> next = iterator.next();
            for (int i = 0; i < array2.length; i++) {
                if (next.getKey().equals(array2[i])) {
                   break;
                }
            }
        }
        System.out.println("true");
    }

    //varianta bruta de abordare:

    static boolean containsPair1(String[] arr1, String[] arr2) {
        for (int i = 0; i <= arr1.length - 1; i++) {
            for (int j = 0; j <= arr2.length - 1; j++) {
                if (arr1[i].equalsIgnoreCase(arr2[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    //O(a*b) daca avem arrayurile de dimesiuni diferite;
    //O(n^2) daca avem arayurile de dimensiuni egale;

    //varianta eficienta:
    //daca facem unul din arrayuri obiecte:
    //array1 ==> obj {
    //a: true;
    //b: true;
    //c: true;
    //x: true;
    //}
    //verificam daca array2[index] = obj.properties;

}
