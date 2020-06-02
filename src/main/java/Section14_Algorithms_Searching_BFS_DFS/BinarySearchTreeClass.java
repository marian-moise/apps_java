package Section14_Algorithms_Searching_BFS_DFS;

import java.util.*;

public class BinarySearchTreeClass {

    NodeTree root;

    /**
     * BREATH FIRST SEARCH
     */
    public List<Integer> BFS() {
        NodeTree currentNode = root;
        List<Integer> list = new ArrayList<>();
        Queue<NodeTree> queue = new ArrayDeque<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
//            System.out.println(currentNode.value);
            list.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return list;
    }

    /**
     * DFS - Inorder
     */

    public void DFSInorder(NodeTree root) {
        // return if the current node is empty
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        DFSInorder(root.left);

        // Display the data part of the root (or current node)
        System.out.print(root.value + ", ");

        // Traverse the right subtree
        DFSInorder(root.right);
    }

    /**
     * DFS - PreOrder
     */

    public void DFSPreOrder(NodeTree root) {
        // return if the current node is empty
        if (root == null) {
            return;
        }
        // Display the data part of the root (or current node)
        System.out.print(root.value + ", ");

        // Traverse the left subtree
        DFSPreOrder(root.left);


        // Traverse the right subtree
        DFSPreOrder(root.right);
    }

    /**
     * DFS - PostOrder
     */

    public void DFSPostOrder(NodeTree root) {
        // return if the current node is empty
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        DFSPostOrder(root.left);


        // Traverse the right subtree
        DFSPostOrder(root.right);

        // Display the data part of the root (or current node)
        System.out.print(root.value + ", ");
    }



    //////////////////////////////////////////////////////////////
    public void insertNode(int value) {

        NodeTree newNode = new NodeTree(value);

        if (root == null) {
            this.root = newNode;
        } else {
            NodeTree currentNode = this.root;

            while (true) {

                if (value < currentNode.value) {
                    //go left
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                } else {
                    //go right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }


    public void lookup(int value) {
        if (value == root.value) {
            System.out.println("Is contained by the tree!");
            return;
        }

        NodeTree temp = root;

        while (temp != null) {

            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else if (value == temp.value) {
                System.out.println("Contained by the tree!");
                break;
            }
        }
        System.out.println("Not in the tree!");
    }


    public void removeNode(int data) {
        if (root == null) {
            System.out.println("null");
            return;
        }

        NodeTree temp = root;
        NodeTree parentNode = null;

        while (temp != null) {

            if (data < temp.value) {
                parentNode = temp;
                temp = temp.left;
            } else if (data > temp.value) {
                parentNode = temp;
                temp = temp.right;
            } else if (data == temp.value) {

//Option 1: No right child:
                if (temp.right == null) {
                    if (parentNode == null) {
                        root = temp.left;
                    } else {
                        //if parent > temp.value, make current left child
                        //a child of parent
                        if (temp.value < parentNode.value) {
                            parentNode.left = temp.left;
                            //if parent < current make keft child a right
                            //of parent
                        } else if (temp.value > parentNode.value) {
                            parentNode.right = temp.left;
                        }
                    }
//Option 2: Right child wich doesn t have a left child

                } else if (temp.right.left == null) {
                    if (parentNode == null) {
                        root = temp.left;
                    } else {
                        temp.right.left = temp.left;
                        //if parent > temp, make right child of the left parrent
                        if (temp.value < parentNode.value) {
                            parentNode.left = temp.right;
                            //if parent < temp, make right child a right child
                            // of parent
                        } else if (temp.value > parentNode.value) {
                            parentNode.right = temp.right;
                        }
                    }

//Option 3 : Right child that has a left child:
                } else {

                    //find the right child's left most child
                    NodeTree leftMost = temp.right.left;
                    NodeTree leftMostParrent = temp.right;
                    while (leftMost.left != null) {
                        leftMostParrent = leftMost;
                        leftMost = leftMost.left;
                    }
                    //Parent's left subtree is now leftmost's right
                    //subtree
                    leftMostParrent.left = leftMost.right;
                    leftMost.left = temp.left;
                    leftMost.right = temp.right;


                    if (parentNode == null) {
                        root = leftMost;
                    } else {
                        if (temp.value < parentNode.value) {
                            parentNode.left = leftMost;
                        } else if (temp.value > parentNode.value) {
                            parentNode.right = leftMost;
                        }
                    }
                }
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTreeClass{" +
                "root=" + root +
                '}';
    }
}


