package task7;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("Enter 2 short numbers: ");
        Scanner sc = new Scanner(System.in);
        short x1 = (short) sc.nextInt();
        short x2 = (short) sc.nextInt();

        System.out.println("Sum  = " + (Short.toUnsignedInt(x1) + Short.toUnsignedInt(x2)));
        System.out.println("Diff = " + (Short.toUnsignedInt(x1) - Short.toUnsignedInt(x2)));
        System.out.println("Prod = " + (Short.toUnsignedInt(x1) * Short.toUnsignedInt(x2)));
        System.out.println("Quot = " + (Short.toUnsignedInt(x1) / Short.toUnsignedInt(x2)));
        System.out.println("Rem  = " + (Short.toUnsignedInt(x1) % Short.toUnsignedInt(x2)));
    }
}
