import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    public static ArrayList<Double> readValues (String filename) throws IOException {
        ArrayList<Double> res = new ArrayList();
        try (FileReader f = new FileReader(filename)){
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    res.add(sc.nextDouble());
                } else {
                    throw new NumberFormatException("get not double");
                }
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(readValues("/Users/p.starikov/studing/lr5/src/main/java/file.txt"));
    }
}
