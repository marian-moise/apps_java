package Interviu.DesignPatterns.ImplementationWithPropertyChangeListener_best_Practice;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 Notifications is an Observable
 */
public class PCLNotifications {
    private String text;

    private PropertyChangeSupport support;

    public PCLNotifications() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setText(String value) {
        support.firePropertyChange("text", this.text, value);
        this.text = value;
    }
}
