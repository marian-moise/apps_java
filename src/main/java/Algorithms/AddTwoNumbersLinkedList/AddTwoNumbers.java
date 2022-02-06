package Algorithms.AddTwoNumbersLinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {



    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (head1 != null || head2 != null) {
            int val_1 = 0;
            int val_2 = 0;

            if (head1 != null) {
                val_1 = head1.val;
            }

            if (head2 != null) {
                val_2 = head2.val;
            }

            ListNode curr = new ListNode((val_1 + val_2 + carry) % 10);
            carry = (val_1 + val_2 + carry) / 10;
            temp.next = curr;
            temp = temp.next;

            if(head1 != null) {
                head1 = head1.next;
            }

            if(head2 != null) {
                head2 = head2.next;
            }
        }
        if(carry == 1){
            temp.next = new ListNode(1);
            temp = temp.next;
        }
        temp.next = null;
        return dummy.next;
    }
}
