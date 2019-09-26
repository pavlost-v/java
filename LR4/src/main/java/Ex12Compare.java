import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex12Compare {
    private static void Prime(long times, double val) {
        Object tmp;
        for (int i = 0; i < times; i++) {
            tmp = Math.sqrt(val);
        }
    }

    private static void Reflect(long times, double val) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object tmp;
        for (int i = 0; i < times; i++) {
            tmp = Math.class.getDeclaredMethod("sqrt", double.class).invoke(Math.class, val);
        }
    }

    private static void Invoke (Method m, long times, double val) throws IllegalAccessException, InvocationTargetException {
        Object tmp;
        for (int i = 0; i < times; i++) {
            tmp = m.invoke(Math.class, val);
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        long times = 1005000L;
        long startTime = System.nanoTime();
        Prime(times, 100);
        long resultTime = System.nanoTime() - startTime;
        long primeTime = resultTime;
        System.out.println("Prime = " + resultTime);
        startTime = System.nanoTime();
        Reflect(times, 100);
        resultTime = System.nanoTime() - startTime;
        System.out.println("Reflect = " + resultTime);
        System.out.println("Reflect / Prime = " + resultTime / primeTime);
        startTime = System.nanoTime();
        Invoke(Math.class.getDeclaredMethod("sqrt", double.class), times, 100);
        resultTime = System.nanoTime() - startTime;
        System.out.println("Invoke = " + resultTime);
        System.out.println("Invoke / Prime = " + resultTime / primeTime);
    }
}
