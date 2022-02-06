package Algorithms.DesignPatterns.ImplementationWithObserver;

import java.util.Observable;
import java.util.Observer;

/**
 User is an Observer
 */
public class OUser implements Observer {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void update(Observable o, Object text) {
        this.setText((String) text);
    }
}
