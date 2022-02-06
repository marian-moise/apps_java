package Algorithms;

public class OneTo100NoLoops {
    public static void main(String[] args) {
        System.out.println(execute(0));
        System.out.println(showNumberWithoutUsingNumbers('d'));
    }

    public static int execute(int start) {
        if (start == 100) {
            return start;
        }
        System.out.println(start);
        start++;
        return execute(start);
    }

    public static int showNumberWithoutUsingNumbers(Character c) {
        return c;
    }
}
