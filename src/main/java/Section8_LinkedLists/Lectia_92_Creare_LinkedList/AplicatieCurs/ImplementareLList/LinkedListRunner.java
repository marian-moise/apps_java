package Section8_LinkedLists.Lectia_92_Creare_LinkedList.AplicatieCurs.ImplementareLList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListRunner {
    public static void main(String[] args) {
        Linked_List myLinkedList = new Linked_List();
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(20);
        myLinkedList.prepend(7);
        myLinkedList.delete(6);
        myLinkedList.show();


        System.out.println("======================================");
        Node nod1 = new Node(5);
        Node nod2 = nod1;
        System.out.println(nod1);
        System.out.println(nod2);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(0,45);
        List<Integer> list2 = list1;
        System.out.println("analiza liste : ");
        System.out.println(list1);
        System.out.println(list2);




    }
}
