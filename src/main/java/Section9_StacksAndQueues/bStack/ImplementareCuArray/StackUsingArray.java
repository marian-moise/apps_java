package Section9_StacksAndQueues.bStack.ImplementareCuArray;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArray {

    List<Integer> stackAsArray = new ArrayList<>();
    int top = 0;

    public void push(int value) {

        stackAsArray.add(top, value);
        top++;
    }

    public void pop() {
        top--;
        stackAsArray.remove(top);
    }

    public void peek() {
        top--;
        System.out.println(stackAsArray.get(top));
    }

    public void print() {
        for (int temp : stackAsArray) {
            System.out.println(temp);
        }
    }


}
