package task14;

import java.util.Scanner;
import java.util.ArrayList;


public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter square");
        ArrayList<ArrayList<Integer>> square = new ArrayList();
        while (true) {
            String str = sc.nextLine();
            if (str.length() == 0) {
                break;
            }
            String[] elems = str.split("\\s+");
            ArrayList<Integer> tmp = new ArrayList();
            for (int i = 0; i < elems.length; i++) {
                tmp.add(Integer.parseInt(elems[i]));
            }
            square.add(tmp);
        }
        if (validate(square) && check(square)) {
            System.out.println("It is magic square");
        } else {
            System.out.println("It is not magic square");
        }
    }

    private static boolean validate(ArrayList<ArrayList<Integer>> square) {
        int rows = square.size();
        for (ArrayList<Integer> tmp : square) {
            if (rows != tmp.size()) {
                return false;
            }
        }
        return true;
    }

    private static boolean check(ArrayList<ArrayList<Integer>> square) {
        ArrayList<Integer> flags = new ArrayList<Integer>();
        int size = square.size();
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        int flag4 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                flag1 += square.get(i).get(j);
                flag2 += square.get(j).get(i);
            }
            flag3 += square.get(i).get(i);
            flag4 += square.get(i).get(size - 1 - i);
            flags.add(flag1);
            flags.add(flag2);
            flag1 = 0;
            flag2 = 0;
        }
        flags.add(flag3);
        flags.add(flag4);
        for (int fl : flags) {
            if (flag3 != fl) {
                return false;
            }
        }
        return true;
    }

}


