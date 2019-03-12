package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Enter integer number:");
        Scanner sc = new Scanner(System.in);
        int x = Math.abs(sc.nextInt());
        System.out.println("Using %: " + x % 360);
        System.out.println("Using .floorMod: " + Math.floorMod(x, 360));
    }
}
