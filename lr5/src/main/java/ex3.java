import java.io.IOException;
import java.util.stream.DoubleStream;

public class ex3 {
    public static void func(String filename) {
        try {
            System.out.println(ex2.sumOfValues(filename));
        } catch (IOException ex) {
            System.err.println("Cant read file " + filename);
        } catch (NumberFormatException ex) {
            System.err.println("Get bad data");
        }
    }
    public static void main(String[] args) {
        func("/Users/p.starikov/studing/lr5/src/main/java/file.txt");
        func("AA");
        func("/Users/p.starikov/studing/lr5/src/main/java/good");
    }
}
