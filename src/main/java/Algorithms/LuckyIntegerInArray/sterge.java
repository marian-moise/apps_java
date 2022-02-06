package Algorithms.LuckyIntegerInArray;

import java.util.HashMap;

public class sterge {

    public static void main(String[] args) throws InterruptedException {

        int idNum = 9756;
        HashMap<Integer, Integer> map = init();
        System.out.println( idNum + "  " +(1 + map.getOrDefault(idNum, 0)));

    }

    private static HashMap<Integer, Integer> init() {
        // declare the hashmap
        HashMap<Integer, Integer> mapStudent = new HashMap<>();
        // put contents to our HashMap
        mapStudent.put(73654, 5);
        mapStudent.put(98712, 8);
        return mapStudent;
    }

}
