package Algorithms.DesignPatterns.Singleton;

import Algorithms.DesignPatterns.Singleton.implementare_cu_enum.SingletonEnum;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonEnum singletonEnum = SingletonEnum.INSTANTA;
    }
}
