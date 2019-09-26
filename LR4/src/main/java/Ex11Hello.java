import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Ex11Hello {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method m = System.out.getClass().getMethod("println", String.class);
        m.invoke(System.out, "Hello World");
    }
}
