package Algorithms.DesignPatterns.Singleton;

public class SingletonClass {
    private static SingletonClass INSTANCE;
    private SingletonClass() {
        System.out.println("Created unique instance of singleton");
    }
    public static SingletonClass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }
}
