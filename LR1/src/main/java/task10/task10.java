package task10;

import java.util.Random;

public class task10 {
    public static void main(String[] args) {
        Random gen = new Random();
        long l = gen.nextLong();
        System.out.println("Base 10: " + l);
        System.out.println("Base 36: " + Long.toString(l, 36));
    }
}
