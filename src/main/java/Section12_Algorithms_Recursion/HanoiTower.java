package Section12_Algorithms_Recursion;

import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce the number of disks");
        int disks = s.nextInt();
        moveTower(disks, "S", "T", "D");

    }

    public static void moveTower(int disks, String start, String temp, String destination) {
        if (disks == 1) {
            System.out.printf("Place the disk from " + start + " to " + destination);
            System.out.println();
        } else {
            moveTower(disks - 1, start, destination, temp);
            System.out.printf("Place the disk from " + start + " to " + destination);
            System.out.println();
            moveTower(disks - 1, temp, start, destination);
        }
    }
}
