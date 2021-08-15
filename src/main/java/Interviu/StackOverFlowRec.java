package Interviu;

public class StackOverFlowRec {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println(inception(counter));

    }

    public static String inception(int counter) {
        System.out.println(counter);
        if (counter > 3) {
            return "done";
        }
        counter++;
        return inception(counter);
    }
}
