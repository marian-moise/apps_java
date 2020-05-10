package Section5_6_DataStructures.Teste;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Math.pow(6,10000);
        System.out.println(Math.pow(6,1000));


        ArrayList<String> string = new ArrayList<String>();
        string.add(0,"a");
        string.add(1,"b");
        string.add(2,"c");
        string.add(3,"d");
        string.add(4,"e");
        string.remove(4);
        string.add(0,"x");

        System.out.println(string);

    }
}
