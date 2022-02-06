package Algorithms.DesignPatterns.ImplementationWithPropertyChangeListener_best_Practice;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 User is an Observer
 */
public class PCLUser implements PropertyChangeListener {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setText((String) evt.getNewValue());
    }
}
