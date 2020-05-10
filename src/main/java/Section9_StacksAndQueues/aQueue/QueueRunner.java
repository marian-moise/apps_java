package Section9_StacksAndQueues.aQueue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue myQuewe = new Queue();
        myQuewe.enQueue(5);
        myQuewe.enQueue(8);
        myQuewe.enQueue(10);
        myQuewe.peek();
        myQuewe.deQueue();
        myQuewe.print();
    }
}
