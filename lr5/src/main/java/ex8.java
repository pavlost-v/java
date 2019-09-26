import java.util.concurrent.locks.ReentrantLock;

public class ex8 {
    private AutoCloseable get (ReentrantLock locker) {
        locker.lock();
        return new AutoCloseable() {
            @Override
            public void close() throws Exception {
                locker.unlock();
            }
        };
    }

    public static void main(String[] args) {

    }
}
