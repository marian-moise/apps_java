package Section5_6_DataStructures.Lectia66;

import java.util.Arrays;

public class MyArray2 {
    int length;
    int[] data;


    public MyArray2() {
        this.length = 0;
        this.data = new int[]{};///NU SE POATE AUTOINCREMENTA DIMENSIUNEA ARRAYULUI DE ACEEA SE VA FOLOSI ARRAYLIST!!!
    }

    public int addItem2(int item) {

        this.data[this.length] = item;
        this.length++;
        return this.length;
    }

    @Override
    public String toString() {
        return "MyArray2{" +
                "length=" + length +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
