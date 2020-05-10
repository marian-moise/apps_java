package Section9_StacksAndQueues.Recapitulare.Stacks;

public class StackeyCuLinkedLists {
    Node head;


    public void print() {
        Node temp = head;
        System.out.println("----");
        while (temp.next != null) {
            System.out.println(temp.data);
            System.out.println("----");
            temp = temp.next;
        }
        System.out.println(temp.data + "---> null");
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty!");
        }
        return head.data;
    }

//push ul este preppend ul de la linked lists

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (head.next == null) {
            System.out.println("Nothing to pop!!!");
        }
        Node temp = head;
        head = temp.next;

    }
}
