package OOP.operators;

public class Main {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 1;
//        b = a + b; // error : cannot convert from int to byte
        b += a; // ok

        System.out.println(3*0.1);
        if (3 * 0.1 == 0.3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        System.out.println(Runtime.getRuntime().freeMemory());
//        System.out.println(Runtime.getRuntime().totalMemory());
//        System.out.println(Runtime.getRuntime().maxMemory());
    }
}
