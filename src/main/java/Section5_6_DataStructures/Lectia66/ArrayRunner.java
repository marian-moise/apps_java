package Section5_6_DataStructures.Lectia66;

public class ArrayRunner {
    public static void main(String[] args) {
        MyArray newArray = new MyArray();
        newArray.addItem(7);
        newArray.addItem(5);
        newArray.addItem(8);
        newArray.addItem(9);
        newArray.removeItem(7);
        newArray.removeItem(9);
        System.out.println(newArray);

//        MyArray2 newArray2 = new MyArray2();
//        newArray2.addItem2(7);
//        //newArray2.addItem2(5);
//        System.out.println(newArray2);


    }
}
