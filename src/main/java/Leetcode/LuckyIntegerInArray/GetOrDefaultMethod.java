package Leetcode.LuckyIntegerInArray;

import java.util.HashMap;

public class GetOrDefaultMethod {

    public static void main(String[] args) throws InterruptedException {

        int idNum = 9756;
        HashMap<Integer, String> map = init();
        System.out.println( idNum + "  " + map.getOrDefault(idNum, "John Doe"));

    }

    private static HashMap<Integer, String> init() {
        // declare the hashmap
        HashMap<Integer, String> mapStudent = new HashMap<>();
        // put contents to our HashMap
        mapStudent.put(73654, "Shyra Travis");
        mapStudent.put(98712, "Sharon Wallace");
        return mapStudent;
    }

}
