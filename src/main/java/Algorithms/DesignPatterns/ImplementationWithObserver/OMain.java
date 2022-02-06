package Algorithms.DesignPatterns.ImplementationWithObserver;

public class OMain {
    public static void main(String[] args) {
        ONotifications observable = new ONotifications();
        OUser observer_1 = new OUser();
        OUser observer_2 = new OUser();

        observable.addObserver(observer_1);
        observable.addObserver(observer_2);

        observable.setText("Ati primit o noua notificare!");

        System.out.println(observer_1.getText());
        System.out.println(observer_2.getText());
    }
}
