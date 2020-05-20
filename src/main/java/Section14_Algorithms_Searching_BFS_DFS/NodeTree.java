package Section14_Algorithms_Searching_BFS_DFS;

public class NodeTree {
    int value;
    NodeTree left;
    NodeTree right;

    public NodeTree(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NodeTree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
