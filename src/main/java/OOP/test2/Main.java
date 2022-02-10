package OOP.test2;

public class Main {
    /**
     * *Class (interfata) Task – method execute()
     *      * 3 classes – in each of the the execute method should have a different implementation
     *      * OutTask -> will display a String
     *      * RandomTask -> will display a random number
     *      * IncrementTask -> will display the number of the instances of the class
     */

    public static void main(String[] args) {
        OutTask outTask = new OutTask();
        outTask.execute();

        RandomTask randomTask = new RandomTask();
        randomTask.execute();
        randomTask.execute("asd!!!!");

        IncrementTask incrementTask = new IncrementTask();
        IncrementTask incrementTask_2 = new IncrementTask();
        IncrementTask incrementTask_3 = new IncrementTask();
        incrementTask.execute();
    }
}
