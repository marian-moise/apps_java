package Algorithms.DeleteNodeInLinkedList;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

    public void append(int val) {
        if (this.next == null) {
            this.next = new ListNode(val);
            return;
        }

        ListNode start = next;
        while (start.next != null) {
            start = start.next;
        }
        start.next = new ListNode(val);
    }

    public void printList() {
        ListNode start = next;
        while (start.next != null) {
            System.out.print(start.val + " ");
            start = start.next;
        }
        System.out.print(start.val + " ");
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
