package Section8_LinkedLists.Lectia_92_Creare_LinkedList.AplicatieCurs.Recapitulare.LinkedListsSingle;

public class LinkeyRunner {
    public static void main(String[] args) {
        LinkeyList myList = new LinkeyList();
        myList.append(10);
        myList.append(5);
        myList.append(16);
        myList.prepend(55);
        myList.insert(5, 8888);
        myList.insert(2, 100);
        myList.insert(8, 11);
        myList.insert(18, 11);
        myList.removeLinkey(2);
        myList.removeLinkey(1);
        myList.reverseList();
        System.out.println(myList.printList());
    }
}
