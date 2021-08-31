package Interviu.OOP.delloitte;

public class Delloitte {
    /**
     *Class (interfata) Task – method execute()
     * 3 classes – in each of the the execute method shoud have a different implementation
     * OutTask -> will display a String
     * RandomTask -> will display a random number
     * IncrementTask -> will display the number of the instances of the class
     */
    public static void main(String[] args) {
        OutTask task1 = new OutTask();
        Random random1 = new Random();
        IncrementTask incrementTask1 = new IncrementTask();
        task1.execute();
        random1.execute();
        incrementTask1.execute();
    }
}
