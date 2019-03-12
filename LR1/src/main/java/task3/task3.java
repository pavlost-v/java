package task3;

import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The largest number using if: ");
        if (arr[0] >= arr[1] && arr[0] >= arr[2]) {
            System.out.println(arr[0]);
        } else if (arr[1] >= arr[2]) {
            System.out.println(arr[1]);
        } else {
            System.out.println(arr[2]);
        }
        System.out.print("The largest number using if: " + Math.max(arr[0], Math.max(arr[1], arr[2])));

    }
}
