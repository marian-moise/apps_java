package Algorithms.ReverseLinkedList;

public class NodeLL {
    int value;
    NodeLL next;

    public NodeLL(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NodeLL{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
