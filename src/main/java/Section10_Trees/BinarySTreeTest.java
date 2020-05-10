package Section10_Trees;

public class BinarySTreeTest {

    NodeTree root;

    public void traversal(NodeTree root) {
        if (root == null) {
            return;
        }

        traversal(root.left);
        System.out.print(root.value + " ");
        traversal(root.right);
    }


    public void insertNode(int data) {

        NodeTree node = new NodeTree(data);

        if (root == null) {
            root = node;
        } else {

            NodeTree start = root;

            while (true) {

                if (data < start.value) {
                    if (start.left == null) {
                        start.left = node;
                        return;
                    }
                    start = start.left;

                } else {
                    if (start.right == null) {
                        start.right = node;
                        return;
                    }
                    start = start.right;
                }

                if (data == start.value) {
                    System.out.println("No duplicates!");
                }
            }
        }
    }


    public void lookupInTree(int data) {
        NodeTree start = root;

        if (root == null) {
            System.out.println("No matching!");
            return;
        } else {
            while (start != null) {

                if (data < start.value) {
                    start = start.left;
                }

                if (data > start.value) {
                    start = start.right;
                }

                if (start == null) {
                    System.out.println("Nothing found!");
                    return;
                }

                if (data == start.value) {
                    System.out.println("The element " + data + " is present in tree!" );
                    return;
                }
            }
        }
    }



}
