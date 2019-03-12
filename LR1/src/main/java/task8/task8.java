package task8;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String[] arrStr = sc.nextLine().split("\\s+");
        for (String s : arrStr) {
            int l = s.length();
            for (int i = 0; i < l; i++) {
                for (int j = i; j < s.length(); j++) {
                    System.out.println(s.substring(i, j + 1));
                }
            }
        }
    }
}