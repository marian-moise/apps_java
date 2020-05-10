package Section9_StacksAndQueues.Recapitulare.Queues;

public class QueueyRunner {
    public static void main(String[] args) {
        Queuey queue1 = new Queuey();


        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.printQueue();
        System.out.println("=============");
        queue1.dequeue();
        queue1.printQueue();
        queue1.peek2();
    }
}
