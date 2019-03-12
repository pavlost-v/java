package task6;

import java.math.BigInteger;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Factorial of 1000" + factorial(1000));
        System.out.println("Enter your n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " " + factorial(n));
    }

    private static BigInteger factorial(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
