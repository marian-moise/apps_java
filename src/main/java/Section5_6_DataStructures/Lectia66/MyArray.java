package Section5_6_DataStructures.Lectia66;

import java.util.ArrayList;

public class MyArray {
    ArrayList<Integer> data;

    public MyArray() {
        this.data = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getData(int index) {
        return this.data;
    }

    public ArrayList<Integer> addItem(Integer item) {

        this.data.add(item);
        return data;
    }

    public ArrayList<Integer> removeItem(Integer item){

        this.data.remove(item);
        return data;
    }


    @Override
    public String toString() {
        return "MyArray{" +
                "data=" + data +
                '}';
    }
}
