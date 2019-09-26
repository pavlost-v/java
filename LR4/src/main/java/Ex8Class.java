import java.util.ArrayList;

public class Ex8Class {

    private class InnerClass {
    }

    private static class StaticInnerClass {
    }

    public static void main(String[] args) {

        printClassName(int.class);

        printClassName(Integer.class);

        printClassName(String[].class);

        printClassName(InnerClass.class);

        printClassName(StaticInnerClass.class);

        printClassName(ArrayList.class);

        printClassName(Ex8Class.class);
    }

    private static void printClassName(Class<?> cl) {
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();
    }
}
