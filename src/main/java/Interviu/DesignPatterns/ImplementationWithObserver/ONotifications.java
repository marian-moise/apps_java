package Interviu.DesignPatterns.ImplementationWithObserver;

import java.util.Observable;

/**
 Notifications is an Observable
 */
public class ONotifications extends Observable {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        setChanged();
        notifyObservers(text);
    }
}
