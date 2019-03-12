import java.util.Arrays;
import java.util.Scanner;

public class task_ex {
    public static void main(String[] args) {
        System.out.println("Enter length");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter array");
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();
        }
        System.out.println("Your array " + Arrays.toString(arr));
        System.out.println("Enter index");
        int index = sc.nextInt();
        if (index > len - 1 || index < 0) {
            System.out.println("Index out of range");
            return;
        }
        System.out.println("Enter value");
        String value = sc.next();

        System.out.println("Your array " + Arrays.toString(add(arr, index, value)));

    }
    private static String[] add (String[] arr, int index, String value) {
        String[] arrNew = new String[arr.length + 1];
        boolean flag = true;
        for (int i = 0; i < (arr.length + 1); i++) {
            if (i == index) {
                arrNew[i] = value;
                flag = false;
            } else if (i != index && flag) {
                arrNew[i] = arr[i];
            } else {
                arrNew[i] = arr[i - 1];
            }
        }
        return arrNew;
    }
}
