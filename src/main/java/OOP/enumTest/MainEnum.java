package OOP.enumTest;

import java.util.Arrays;

public class MainEnum {
    public static void main(String[] args) {
        System.out.println(EnumTest.MONDAY);
        System.out.println(EnumTest.TUESDAY);
        System.out.println(EnumTest.a);
        System.out.println(EnumTest.b);
        System.out.println(Arrays.toString(EnumTest.values()));
        System.out.println(EnumTest.MONDAY.getC() + EnumTest.MONDAY.getD());
        System.out.println(EnumTest.TUESDAY.getC() + EnumTest.TUESDAY.getD());
    }
}
