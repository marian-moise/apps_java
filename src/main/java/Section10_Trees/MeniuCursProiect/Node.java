package Section10_Trees.MeniuCursProiect;

import java.util.List;

public class Node {
    String menuItem;
    List<Node> children;
    Node parent;

    public Node(String menuItem, Node parent) {
        this.menuItem = menuItem;
        this.parent = parent;
    }

    @Override
    public String toString() {
        StringBuilder menu = new StringBuilder();
        for (Node n : children) {
            menu.append(n.menuItem).append("\n");
        }
        return menu.toString();
    }
}
