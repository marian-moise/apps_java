package Section12_Algorithms_Recursion;

public class OneTo100NoLoops {
    public static void main(String[] args) {
        buildNumbersRecursively(100);
    }

    public static void buildNumbersRecursively(int maxNumber) {
        if (maxNumber == 0) {
            System.out.println(maxNumber);
            return;
        }
        buildNumbersRecursively(maxNumber - 1);
        System.out.print(maxNumber + " ");
    }
}
