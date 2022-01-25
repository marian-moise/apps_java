package Interviu.DesignPatterns.ImplementationWithPropertyChangeListener_best_Practice;

public class PCLMain {
    public static void main(String[] args) {
        PCLNotifications observable = new PCLNotifications();
        PCLUser observer_1 = new PCLUser();
        PCLUser observer_2 = new PCLUser();

        observable.addPropertyChangeListener(observer_1);
        observable.addPropertyChangeListener(observer_2);

        observable.setText("Ati primit o noua notificare!");

        System.out.println(observer_1.getText());
        System.out.println(observer_2.getText());
    }
}
