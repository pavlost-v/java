import java.io.FileNotFoundException;
import java.io.IOException;

public class ex10 {

    private static void factorial(Throwable ex) {
        StackTraceElement[] frames = ex.getStackTrace();
        for (StackTraceElement frame : frames) {
            System.out.println(frame);
        }

        Throwable[] ex1 = ex.getSuppressed();
        for (Throwable kek : ex1) {
            factorial(kek);
        }
    }

    public static void main(String[] args) {
        tmp_work();
    }
    static void tmp_work() {
        work();
    }
    static void  work() {
        IOException ex = new IOException("my exception");
        ex.addSuppressed(new FileNotFoundException("second exception"));
        factorial(ex);
    }
}
