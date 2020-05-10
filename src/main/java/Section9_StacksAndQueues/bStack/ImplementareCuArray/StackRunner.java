package Section9_StacksAndQueues.bStack.ImplementareCuArray;

public class StackRunner {
    public static void main(String[] args) {

        StackUsingArray newStack = new StackUsingArray();

        newStack.push(5);
        newStack.push(8);
        newStack.push(10);
        newStack.pop();
        newStack.peek();
        newStack.print();

    }
}
