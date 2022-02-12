package OOP.hashMap1;

import java.util.HashSet;
import java.util.Set;

public class HashMapOverrideHasCodeAndEquals {
    public static void main(String[] args) {
        Chitara chitaraFender_1 = new Chitara(1, "Fender");
        Chitara chitaraFender_2 = new Chitara(1, "Fender");

        Set<Chitara> set = new HashSet<>();
        set.add(chitaraFender_1);
        set.add(chitaraFender_2);

        System.out.println(set.size());
        System.out.println(chitaraFender_1.hashCode());
        System.out.println(chitaraFender_2.hashCode());
        System.out.println(chitaraFender_1.equals(chitaraFender_2));
        System.out.println(chitaraFender_1 == chitaraFender_2);

        String s1 = "asd";
        String s2 = "asd";

        Integer int_1 = 1;
        Integer int_2 = 1;

        System.out.println("s1.equals(s2)" + (s1.equals(s2)));//true
        System.out.println("int_1.equals(int_2)" + (int_1.equals(int_2)));//true
        System.out.println("chitaraFender_1.equals(chitaraFender_2)" + (chitaraFender_1.equals(chitaraFender_2)));//false
        System.out.println("s1 == s2" + (s1 == s2));//true
        System.out.println("int_1 == int_2" + (int_1 == int_2));//true
        System.out.println("chitaraFender_1 == chitaraFender_2 + " + (chitaraFender_1 == chitaraFender_2));//false

        System.out.println("=====================================");

        String s3 = new String("asd");
        String s4 = new String("asd");

        Integer int_3 = new Integer(1);
        Integer int_4 = new Integer(1);

        System.out.println("s3.equals(s4)" + (s3.equals(s4)));//false
        System.out.println(s3.hashCode());
        System.out.println("s3 == s4" + (s3 == s4));//false
        System.out.println(s4.hashCode());
        System.out.println("int_3.equals(int_4)" + (int_3.equals(int_4)));//false
        System.out.println("int_3 == int_4" + (int_3 == int_4));//false

        System.out.println("========================================");
    }
}
