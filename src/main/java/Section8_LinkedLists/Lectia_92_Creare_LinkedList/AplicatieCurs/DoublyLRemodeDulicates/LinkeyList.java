package Section8_LinkedLists.Lectia_92_Creare_LinkedList.AplicatieCurs.DoublyLRemodeDulicates;

import java.util.ArrayList;
import java.util.List;

public class LinkeyList {
    Node head;


    public void removeDuplicates() {
        /* verifici daca lista e goala */
        if (head == null)
            return;

        Node current = head;
        while (current.next != null) {
            /* compari nodul curent cu nodul urmator */
            if (current.value == current.next.value){
                /* stergi nodul duplicat prin pointarea nodului catre null */
                Node temp = current.next.next;
                current.next = temp;
            }
                /* else mergi la urmatorul nod */
            else
                current = current.next;
        }
    }


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
            return;
        }
        while (newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = new Node(value);
    }
}

