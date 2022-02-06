package Algorithms.ReverseLinkedList;

public class LinkedRunner {

    public static void main(String[] args) {
        Linke l = new Linke();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        //l.reverseLL();

        l.printList();
        System.out.println();
        reverseList(l.head);
    }


    public static void reverseList(NodeLL head) {
        NodeLL current = head;
        NodeLL prev = null;
        NodeLL next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

        NodeLL temp = head;
        while (temp.next != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.print(temp.value + " ");

    }


}
