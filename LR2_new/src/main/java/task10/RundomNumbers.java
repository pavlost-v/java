package task10;

import java.util.ArrayList;
import java.util.Random;

public class RundomNumbers {

    private static Random generator = new Random();

    public static int nextlnt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static int randomElement(int[] mas) {
        if (mas.length > 0) {
            int idx = generator.nextInt(mas.length);
            return mas[idx];
        }
        return 0;
    }

    public static int randomElement(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return 0;
        }
        int idx = generator.nextInt(arr.size());
        return arr.get(idx);
    }

    public static void main(String[] args) {
        int[] mas = {1, 2, 3};
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr2.add(i);
        }
        System.out.println(randomElement(mas));
        System.out.println(randomElement(arr2));

    }

}
