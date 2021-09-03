package Interviu;

public class NumarulCelMaiApropiatDeOLimita {
    public static void main(String[] args) {
        System.out.println(number(20, -120, 100));
    }

    public static int number(int a, int b, int limit) {
        int x = limit - a;
        int y = limit - b;

        if (x < y) {
            return a;
        } else {
            return b;
        }
    }
}
