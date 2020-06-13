package Interviu.ReverseLinkedList;

public class Linke {
    NodeLL head;


    public void insert(int value) {
        if (head == null) {
            this.head = new NodeLL(value);
            return;
        }
        NodeLL temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new NodeLL(value);

    }

    public void printList() {
        NodeLL temp = this.head;
        while (temp.next != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.print(temp.value + " ");

    }

    public void reverseLL() {
        NodeLL current = this.head;
        NodeLL prev = null;
        NodeLL next ;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;

    }
}
