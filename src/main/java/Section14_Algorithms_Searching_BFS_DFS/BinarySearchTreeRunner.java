package Section14_Algorithms_Searching_BFS_DFS;

import Section10_Trees.BinarySTreeTest;

public class BinarySearchTreeRunner {
    public static void main(String[] args) {

        BinarySearchTreeClass tree1 = new BinarySearchTreeClass();

        tree1.insertNode(9);
        tree1.insertNode(4);
        tree1.insertNode(20);
        tree1.insertNode(1);
        tree1.insertNode(6);
        tree1.insertNode(15);
        tree1.insertNode(170);

        System.out.println(tree1.BFS());


    }
}
