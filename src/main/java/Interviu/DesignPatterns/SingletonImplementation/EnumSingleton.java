package Interviu.DesignPatterns.SingletonImplementation;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }
}
