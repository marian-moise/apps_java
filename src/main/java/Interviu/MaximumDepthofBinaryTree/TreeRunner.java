package Interviu.MaximumDepthofBinaryTree;

public class TreeRunner {
    public static void main(String[] args) {
        TreeUtils tree = new TreeUtils();
        tree.insert(3);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(7);
        tree.insert(11);

        System.out.println(tree.BFS());
        //System.out.println(maxDepth(tree.root));
        System.out.println(maxD(tree.root));
    }

    public static int maxD(TreeNode root) {
        if (root == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxD(root.left);
            int rDepth = maxD(root.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}
