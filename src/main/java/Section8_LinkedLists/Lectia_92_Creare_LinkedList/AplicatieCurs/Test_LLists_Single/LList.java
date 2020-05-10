package Section8_LinkedLists.Lectia_92_Creare_LinkedList.AplicatieCurs.Test_LLists_Single;

public class LList {
    Node head;
    int length;

    public void print() {
        Node start = this.head;

        System.out.print("{ ");
        while (start.next != null) {
            System.out.print(start.data + ", ");
            start = start.next;
        }
        System.out.print(start.data + " ");
        System.out.println("}");
    }


    public void append(int value) {

        if (this.head == null) {
            this.head = new Node(value);
            this.length++;
            return;
        }

        Node start = this.head;

        while (start.next != null) {
            start = start.next;
        }
        start.next = new Node(value);
        this.length++;

    }


    public void prepend(int value) {

        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;

    }


    public void inset(int index, int value) {

        if (index >= this.length) {
            append(value);
            return;
        }

        Node newNode = new Node(value);
        Node leader = traverseToIndex(index - 1);
        Node second = leader.next;
        leader.next = newNode;
        newNode.next = second;
        this.length++;

    }

    public Node traverseToIndex(int index) {

        Node start = this.head;
        int counter = 0;
        while (counter != index) {
            start = start.next;
            counter++;
        }
        return start;
    }


    public void remove(int index, int value) {

        Node leader = traverseToIndex(index -1);
        Node nodeToRemove = leader.next;
        leader.next = nodeToRemove.next;
        this.length--;

    }

    public void reverseLList() {
        if (this.length == 1) {
            return;
        }

        Node prev = null;
        Node curr = this.head;
        Node nextNode = null;

        while (curr != null) {

            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        this.head = prev;
    }


}
