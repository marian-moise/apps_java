package Section9_StacksAndQueues.aQueue;

public class Queue {

    Node first;
    Node last;
    int length = 0;

    public void enQueue(int value) {

        Node newNode = new Node(value);

        if (length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
        return;
    }


    public void deQueue() {

        if (this.first == null) {
            System.out.println("The list is empty!");
        }
        if (this.first == this.last) {
            this.last = null;
        }
        this.first = this.first.next;
        this.length--;
        return;
    }


    public int peek() {

        if (this.first == null) {
            System.out.println("Queue is empty");
        }
        return first.data;
    }


    public void print() {
        Node newNode = first;
        while (newNode.next != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
        System.out.println(newNode.data);

    }
}
