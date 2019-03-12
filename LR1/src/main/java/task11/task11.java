package task11;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int code = (int) str.charAt(i);
            if (code >255) {
                System.out.println(code);
            }
        }
    }
}
