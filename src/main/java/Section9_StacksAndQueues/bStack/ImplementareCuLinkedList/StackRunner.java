package Section9_StacksAndQueues.bStack.ImplementareCuLinkedList;

public class StackRunner {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(8);
        myStack.push(28);
        myStack.push(14);
        myStack.push(11);
        myStack.pop();
        myStack.print();
        System.out.println(myStack.peek());
    }
}
