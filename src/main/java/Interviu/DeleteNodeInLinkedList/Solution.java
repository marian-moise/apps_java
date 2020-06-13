package Interviu.DeleteNodeInLinkedList;

public class Solution {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        deleteNode(list.next);
        list.printList();

    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
