package Section8_LinkedLists.Lectia_92_Creare_LinkedList.AplicatieCurs.Test_LLists_Single;

public class LListRunner {
    public static void main(String[] args) {
        LList myList = new LList();

        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.prepend(8);
        myList.prepend(9);
        myList.inset(9,100);
        myList.inset(2,100);
        myList.remove(2,100);
        myList.reverseLList();
        myList.print();
    }
}
