import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        String r = "/Users/p.starikov/studing/lr5/src/main/java/good";
        String w = "/Users/p.starikov/studing/lr5/src/main/java/out";

        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(new FileReader(r));
            out = new PrintWriter(w);
            while (in.hasNext()) {
                out.println(in.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
