package Algorithms.DesignPatterns.Factory;

public class FactoryOS {
    public OS getOS(String key) {
        if (key.equalsIgnoreCase("android")) {
            return new AndroidOS();
        } else if (key.equalsIgnoreCase("mac")) {
            return new MacOS();
        } else if (key.equalsIgnoreCase("windows")) {
            return new WindowsOS();
        } else {
            return null;
        }
    }
}
