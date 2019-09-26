import java.io.IOException;
import java.util.ArrayList;

public class ex2 {
    public static double sumOfValues(String filename) throws IOException, NumberFormatException {
        ArrayList<Double> arr = ex1.readValues(filename);
        Double s = 0D;
        for (Double d : arr) {
            s += d;
        }
        return s;
    }
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(sumOfValues("/Users/p.starikov/studing/lr5/src/main/java/file.txt"));
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
            //        System.out.println(sumOfValues("AAA"));
    }
}
