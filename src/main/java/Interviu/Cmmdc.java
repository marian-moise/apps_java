package Interviu;

public class Cmmdc {
    public static void main(String[] args) {
        System.out.println(cmmdcRec(85, 24));
        System.out.println(cmmdcIterativ(85, 24));
    }

    public static int cmmdcRec(int a, int b) {
        if (b == 0) {
            return a;
        }
        return cmmdcRec(b, a%b);
    }

    public static int cmmdcIterativ(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
