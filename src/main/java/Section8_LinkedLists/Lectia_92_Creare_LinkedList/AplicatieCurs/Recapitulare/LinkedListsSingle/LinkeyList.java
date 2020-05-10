package Section8_LinkedLists.Lectia_92_Creare_LinkedList.AplicatieCurs.Recapitulare.LinkedListsSingle;

import java.util.ArrayList;
import java.util.List;

public class LinkeyList {
    Node head;
    int length;


    public List<Integer> printList() {

        List<Integer> array = new ArrayList<>();

        Node temp = head;

        while (temp.next != null) {

            array.add(temp.value);
            temp = temp.next;
        }
        array.add(temp.value);
        return array;
    }

    public void append(int value) {

        Node newNode = head;
        if (head == null) {
            head = new Node(value);
            this.length++;
            return;
        }

        while (newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = new Node(value);
        this.length++;
    }


    public void prepend(int value) {

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        this.length++;

    }


    public void insert(int index, int data) {

        if (index >= this.length) {
            append(data);
            return;
        }

        Node newNode = new Node(data);
        Node leader = traverseToIndex(index - 1);
        Node holdingPointer = leader.next;
        leader.next = newNode;
        newNode.next = holdingPointer;
        this.length++;

    }

    public Node traverseToIndex(int index) {

        int counter = 0;

        Node current = this.head;
        while (counter != index) {
            current = current.next;
            counter++;
        }
        return current;
    }

    public void removeLinkey(int index) {
        Node leader = this.traverseToIndex(index - 1);
        Node wantedNode = leader.next;
        leader.next = wantedNode.next;
        this.length--;
    }

    public void reverseList() {
        if (this.length == 1) {
            return;
        }
        Node first = this.head;
        Node second = first.next;

        while (second != null) {
            Node temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        this.head.next = null;
        this.head = first;
        return;
    }
}

