package Algorithms.OOP.test2;

public class IncrementTask implements Task {

    private static int counter = 0;

    @Override
    public void execute() {
        System.out.println(counter);
    }

    IncrementTask() {
        counter++;
    }
}
