package Algorithms.MaximumDepthofBinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TreeUtils {
    TreeNode root;


    public List<Integer> BFS() {
        TreeNode currentNode = root;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            list.add(currentNode.val);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return list;
    }



    public void insert(int val) {
        TreeNode newNode = new TreeNode(val);

        if (this.root == null) {
            this.root = newNode;
        } else {
            TreeNode temp = this.root;
            while (true) {

                if (val < temp.val) {
                    //go left
                    if (temp.left == null) {
                        temp.left = newNode;
                        return;
                    }
                    temp = temp.left;
                } else {
                    //go right
                    if (temp.right == null) {
                        temp.right = newNode;
                        return;
                    }
                    temp = temp.right;
                }
            }
        }
    }
}
