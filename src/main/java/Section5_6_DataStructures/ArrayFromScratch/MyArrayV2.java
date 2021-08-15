package Section5_6_DataStructures.ArrayFromScratch;

import java.util.ArrayList;
import java.util.List;

public class MyArrayV2 {

    private int length = 0;
    private List<Object> data;

    public MyArrayV2(int length, List<Object> data) {
        this.length = length;
        this.data = data;
    }

    public void add(Object object) {
        this.data.add(object);
    }

    public Object get(int index) {
        return this.data.get(index);
    }

    public void remove(Object object) {
        this.data.remove(object);
    }

    public static void main(String[] args) {
        Integer data1 = 0;
        Boolean data2 = true;
        String data3 = "asd";
        List<Object> objects = new ArrayList<>();
        MyArrayV2 myArrayV2 = new MyArrayV2(3, objects);
        myArrayV2.add(data1);
        myArrayV2.add(data2);
        myArrayV2.add(data3);
        for (int i = 0; i < myArrayV2.length; i++) {
            System.out.println(myArrayV2.get(i).toString());
        }
        myArrayV2.remove(data1);
        for (int i = 0; i < myArrayV2.length; i++) {
            System.out.println(myArrayV2.get(i).toString());
        }
    }
}
