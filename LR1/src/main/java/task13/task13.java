package task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task13 {
    public static void main(String[] args) {
        ArrayList<Integer> start = new ArrayList();
        for (int i = 0; i < 49; i++) {
            start.add(i + 1);
        }
        ArrayList<Integer> finish = new ArrayList();
        Random generator = new Random();
        for (int i = 0; i < 6; i++) {
            int rand = generator.nextInt(49) + 1 - i;
            Integer selectedValue = start.remove(rand);
            finish.add(selectedValue);
        }
        Collections.sort(finish);
        System.out.println(finish);
    }

}
