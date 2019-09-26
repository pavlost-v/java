import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

public class Ex13 {

    private static void printFun(Method m, double lower, double upper, double step) throws IllegalAccessException, InvocationTargetException {
        for (double d = lower; d < upper; d += step) {
            System.out.println(m.invoke(null, d));
        }
    }

    private static void printFun2(DoubleFunction<Object> f, double lower, double upper, double step) {

        for (double d = lower; d < upper; d += step) {
            System.out.println(f.apply(d));
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println("PrintFun Math.sqrt");
        printFun(Math.class.getDeclaredMethod("sqrt", double.class), 0, 6, 2);
        System.out.println("PrintFun Double.toHexString");
        printFun(Double.class.getDeclaredMethod("toHexString", double.class), 0, 6, 2);
        System.out.println("PrintFun2 Math::sqrt");
        printFun2(Math::sqrt, 0, 6, 2);
        System.out.println("PrintFun2 Double::toHexString");
        printFun2(Double::toHexString, 0, 6, 2);
    }
}