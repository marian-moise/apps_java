package Section9_StacksAndQueues.Recapitulare.Stacks;

import java.util.Arrays;

public class StackRunner {
    public static void main(String[] args) {

        StackeyCuLinkedLists newStack = new StackeyCuLinkedLists();
        StackeyCuArrays otherStack = new StackeyCuArrays();


        System.out.println("========ImplementareCuLinkedLists=========");

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println("peek value is : " + newStack.peek());
        newStack.pop();
        newStack.print();

        System.out.println("========ImplementareCuArrays=========");

        otherStack.pushInArray(1);
        otherStack.pushInArray(2);
        otherStack.pushInArray(3);
        System.out.println("current array is :");
        otherStack.printArray();
//
//        otherStack.popArray();
//        System.out.println("current array is :");
//        otherStack.printArray();

        System.out.println("peeked elem is: " + otherStack.peek());
        otherStack.peek2();

    }
}
