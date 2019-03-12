package task15;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import task6.task6;

public class task15 {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            int c = 1;
            for (int j = 0; j <= i; j++) {
                if (j != 0) {
                    c = c * (i - j + 1) / j;
                }
                tmp.add(c);
            }
            triangle.add(tmp);
        }
        for (ArrayList<Integer> tmp : triangle) {
            System.out.println(tmp);
        }
    }
}
