package Section9_StacksAndQueues.bStack.ImplementareCuLinkedList;

public class Stack {
    Node head;


    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        head = newNode;
    }

    public int pop() {

        if (this.head == null) {
            System.out.println("Stack is empty!");
        }
        Node temp = this.head;
        this.head = this.head.next;
        return temp.value;
    }

    public int peek() {

        if (this.head == null) {
            System.out.println("Stack is empty!");
        }
        return head.value;
    }

    public void print() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(node.value);
    }


}
