import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class ClassTask {
    public static class CalculateException extends Exception {
        public CalculateException(String msg) {
            super(msg);
        }
    }

    private static void work(String path_in, String path_out, String path_er) throws IOException, CalculateException {
        try (Scanner in = new Scanner(new FileReader(path_in));
             PrintWriter out = new PrintWriter(path_out);
             PrintWriter er = new PrintWriter(path_er)) {
            while (in.hasNext()) {
                String vals = in.next();
                System.out.println("Have string:" + vals);
                Double sum = 0D;
                for (String val : vals.split(",")) {
                    Double d;
                    try {
                        d = Double.parseDouble(val);
                    } catch (Exception e) {
                        System.err.println("ALARM");
                        throw new CalculateException("Cant parse string " + vals);
                    }
                    sum += d;
                }
                out.println(sum);
            }
            File f = new File(path_in);
            FileUtils.forceDelete(FileUtils.getFile(path_in));
            FileUtils.forceDelete(FileUtils.getFile(path_er));
        }
    }

    public static void do_work() {
        String path = "/Users/p.starikov/studing/lr5/src/main/java/";
        try {
            work(path + "file_in", path + "file_out", path + "file_er");
        } catch (IOException | CalculateException e) {
            System.err.println("Get errors during work");
            PrintWriter f = null;
            try {
                FileUtils.forceDelete(FileUtils.getFile(path + "file_out"));
                f = new PrintWriter(path + "file_er");
                for (Throwable secEx : e.getSuppressed()) {
                    f.println("Get suppressed ex " + secEx);
                }
                f.println("Error in work function " + e);
            } catch (IOException ex) {
                System.err.println("Errors during work");
                System.err.println("Suppressed:");
                for (Throwable secEx : e.getSuppressed()) {
                    System.err.println("Ex: " + secEx);
                }
                System.err.println("Main exception " + e);
                System.err.println("Also errors when try to log errors" + ex);
            } finally {
                if (f != null) {
                    try {
                        f.close();
                    } catch (Exception exF) {
                        System.err.println("Exception in close error file " + exF);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        do_work();
    }
}