import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex10IntArr {
    public static void main(String[] args) {
        Class<?> cl = int[].class;
        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getCanonicalName() + " " + m.getName() + Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
        }
    }
}
