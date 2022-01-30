package Interviu.OOP.delloitte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Delloitte {
    /**
     *Class (interfata) Task – method execute()
     * 3 classes – in each of the the execute method shoud have a different implementation
     * OutTask -> will display a String
     * RandomTask -> will display a random number
     * IncrementTask -> will display the number of the instances of the class
     */
    public static void main(String[] args) {
        OutTask task1 = new OutTask();
        Random random1 = new Random();
        IncrementTask incrementTask1 = new IncrementTask();

        task1.execute();
        random1.execute();
        incrementTask1.execute();

        int[] arr = {1, 4, 6, 8};
        Integer[] arr2 = {1, 4, 6, 8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        List<Rectangle> arrList = new ArrayList<>();
        for (int i = 0; i <= arr.length; i++) {
            Rectangle obj = new Rectangle(i, i);
            arrList.add(obj);
            arrList.add(obj);
            System.out.println("Value at: " + i + " = " + arrList.get(i));
        }
        System.out.println(arrList);

        System.out.println("=============================UNARY OPERATORS====================");

        int i = 3;
        System.out.println(++i);
        System.out.println(i);

        int j = 3;
        System.out.println(j++);
        System.out.println(j);

        System.out.println("===========================SWITCH====================");


        java.util.ArrayList<String> futureMonths =
                new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }
        System.out.println("================INDEX OUT OF BOUNDS==================");
        int ar[] = { 1, 2, 3, 4, 5 };
//        for (int k = 0; k <= ar.length; k++)
            //System.out.println(ar[k]);
    }

    static class Rectangle {
        private int corners;
        private int sides;

        public Rectangle(int corners, int sides) {
            this.corners = corners;
            this.sides = sides;
        }
    }
}
