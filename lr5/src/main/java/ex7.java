import java.io.Closeable;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class ex7 {
    private class Res implements Readable, Closeable {
        @Override
        public void close() throws IOException {
            throw new IOException();
        }
        @Override
        public int read(CharBuffer charBuffer) throws IOException {
            throw new IOException();
        }
    }

    private void test() {
        try(Scanner sc = new Scanner(new Res())) {
            sc.next();
        }
    }
    public static void main(String[] args) {
        ex7 tmp = new ex7();
        try {
            tmp.test();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
