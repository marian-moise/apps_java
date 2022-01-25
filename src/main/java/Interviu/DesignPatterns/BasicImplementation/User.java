package Interviu.DesignPatterns.BasicImplementation;

/**
 User is an Observer
 */
public class User implements Channel{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void update(Object notification) {
        this.setText((String) notification);
    }
}
