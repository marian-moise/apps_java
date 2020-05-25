package Section8_LinkedLists.Lectia_92_Creare_LinkedList.AplicatieCurs.DoublyLRemodeDulicates;

import java.util.LinkedList;

public class LinkeyRunner {
    public static void main(String[] args) {
        LinkedList newlist = new LinkedList();
        newlist.push(5);
        newlist.push(5);
        newlist.push(5);
        newlist.push(5);
        System.out.println(newlist);




        LinkeyList myList = new LinkeyList();
        myList.append(10);
        myList.append(10);
        myList.append(1);
        myList.append(5);
        myList.append(7);
        myList.append(7);
        myList.removeDuplicates();
        System.out.println(myList.printList());
    }
}
