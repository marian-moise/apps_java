package Section9_StacksAndQueues.Recapitulare.Queues;

public class Queuey {
    Node first;
    Node last;
    int length;


    public void peek2() {
        if (length == 0) {
            System.out.println("the queue is empty!");
        }
        System.out.println(first.data);;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (length == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        length++;
    }

    public void dequeue() {
        Node temp = first;
        first = temp.next;
        length--;
    }

    public void printQueue() {
        Node start = first;
        while (start.next != null) {
            System.out.println("| " + start.data);
            start = start.next;
        }
        System.out.println("| " + start.data);
    }
}
