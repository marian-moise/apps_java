package Interviu.OOP.delloitte;

public class Random implements Task{
    @Override
    public void execute() {
        System.out.println(Math.random());
    }
}
