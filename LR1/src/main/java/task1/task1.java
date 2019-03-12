package task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter integer number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float  reciprocal = 1 / (float) x;
        System.out.println("Binary: " + Integer.toBinaryString (x));
        System.out.println("Octal: " + Integer.toOctalString(x));
        System.out.println("Hexadecimal: " + Integer.toHexString(x));
        System.out.println("Reciprocal: " + Float.toHexString(reciprocal));
    }
}
