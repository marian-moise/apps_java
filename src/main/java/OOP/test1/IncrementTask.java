package OOP.test1;

public class IncrementTask implements Task{
    private static int counter = 0;

    public IncrementTask() {
        counter++;
    }
    @Override
    public void execute() {
        System.out.println(counter);
    }
}
