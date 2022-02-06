package Algorithms.DesignPatterns.Singleton.implementare_cu_enum;

public enum SingletonEnum {
    INSTANTA;

    SingletonEnum() {

    }

    SingletonEnum getSingletonEnum() {
        return INSTANTA;
    }
}
