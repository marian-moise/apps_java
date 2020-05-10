package Section8_LinkedLists.Lectia_92_Creare_LinkedList.AplicatieCurs.ImplementareLList;


public class Linked_List {

    Node head;


    public void append(int value) {

        Node newNode = head;
        if (head == null) {
            head = new Node(value);
            return;
        }

        while (newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = new Node(value);
    }

    public void prepend(int value) {

        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
        }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(node.value);
    }

    public void delete (int value) {
        if (head == null) return;
        if (head.value == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;

        }
    }

    public void reverse(Linked_List list) {
    }

}
