package Algorithms.DesignPatterns.Factory;

public class MainFactory {
    public static void main(String[] args) {
        FactoryOS factoryOS = new FactoryOS();
        factoryOS.getOS("android").specks();
        factoryOS.getOS("mac").specks();
        factoryOS.getOS("windows").specks();
    }
}
