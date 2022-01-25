package Interviu.DesignPatterns.BasicImplementation;

import java.util.ArrayList;
import java.util.List;

/**
 Notifications is an Observable
 */
public class Notifications {
    private String text;
    private List<User> users = new ArrayList<>();

    public void addObserver(User user) {
        this.users.add(user);
    }

    public void removeObserver(User user) {
        this.users.remove(user);
    }

    public void setText(String text) {
        this.text = text;
        for (User u : this.users) {
            u.update(this.text);
        }
    }

}
