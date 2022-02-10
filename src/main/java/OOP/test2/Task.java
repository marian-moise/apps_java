package OOP.test2;

public interface Task {
    void execute();

    default void execute(String s) {
        System.out.println("Only default methods can have body in interfaces!!" + s);
    }

    static void doSomething() {
        System.out.println("Is doing something!!!");
    }
}
