package Section9_StacksAndQueues.Recapitulare.Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackeyCuArrays {

    int[] myArrayStack = new int[10];
    int top = 0;

    public void pushInArray(int value) {
        myArrayStack[top] = value;
        top++;
    }

    public void printArray() {

        for (int i = myArrayStack.length - 1; i >= 0; i--) {
            System.out.println(myArrayStack[i]);
        }
    }

    public void popArray() {
        top--;
        myArrayStack[top] = 0;
    }

    public int peek() {
        top--;
        return myArrayStack[top];
    }

    public void peek2() {
        System.out.println(myArrayStack[top]);
    }
}
