package Section10_Trees.MeniuCursProiect;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public Node theParentNode;

    public Menu() {
        Node mainMenu = new Node("Menu", null);
        List<Node> nodeList = new ArrayList<>();
        Node userNode = new Node("1 User Menu", mainMenu);
        Node projectNode = new Node("2 Create Project", mainMenu);
        Node exit = new Node("3 Exit", mainMenu);
        nodeList.add(userNode);
        nodeList.add(projectNode);
        nodeList.add(exit);
        mainMenu.children = nodeList;
        nodeList = new ArrayList<>();
        nodeList.add(new Node("1 Create User", userNode));
        nodeList.add(new Node("2 Delete User", userNode));
        nodeList.add(new Node("3 Update User", userNode));
        userNode.children = nodeList;
        this.theParentNode = mainMenu;

    }
}
