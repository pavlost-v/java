import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.printf("First: %d, second: %d\n", x1, x2);
        int max = Math.max(x1, x2);
        System.out.println("Max: " + max);
        System.out.println("Avarage: " + avarage(x1, x2));
    }

    private static double avarage(double d1, double d2) {
        return (d1 + d2) / 2;
    }
}
