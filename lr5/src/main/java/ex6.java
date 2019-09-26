import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex6 {
    Path path = Paths.get("aaa");

    private void v1() {
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void v2() {
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            if (in != null) {
                try {
                    in.close();
                } finally {
                    System.err.println("Error");
                }
            }
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }

    private void v3() {
        try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8) ){
            System.out.println("good");
        } catch(IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }

    }
}
