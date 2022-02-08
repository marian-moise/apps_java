package Algorithms.OOP.test2;

public class RandomTask implements Task {
    @Override
    public void execute() {
        System.out.println(Math.random());
    }
}
