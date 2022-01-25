package Interviu.DesignPatterns.BasicImplementation;

public class Main {
    public static void main(String[] args) {
        Notifications observable = new Notifications();
        User observer_1 = new User();
        User observer_2 = new User();

        observable.addObserver(observer_1);
        observable.addObserver(observer_2);

        observable.setText("Ati primit o noua notificare!");

        System.out.println(observer_1.getText());
        System.out.println(observer_2.getText());
    }
}
