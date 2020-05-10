package Section10_Trees;

public class BinarySearchTreeRunner {
    public static void main(String[] args) {

        BinarySearchTreeClass tree1 = new BinarySearchTreeClass();
        BinarySTreeTest tree2 = new BinarySTreeTest();

        tree1.insertNode(5);
        tree1.insertNode(4);
        tree1.insertNode(2);
        tree1.insertNode(8);
        tree1.insertNode(9);
        tree1.insertNode(10);
        tree1.lookup(10);

        tree1.inorderTraversal(tree1.root);
        tree1.lookup(9);

        tree2.insertNode(20);
        tree2.insertNode(19);
        tree2.insertNode(18);
        tree2.insertNode(22);
        tree2.insertNode(21);
        tree2.insertNode(23);
        tree2.traversal(tree2.root);
        System.out.println();

        tree2.lookupInTree(22);
        tree2.lookupInTree(18);
        tree2.lookupInTree(24);

        tree1.removeNode(2);
        tree1.inorderTraversal(tree1.root);

    }
}
