import java.lang.reflect.Field;
import java.util.HashMap;

public class Ex9ToStr {

    public static String toString(Object obj) {
        HashMap<Object, String> hashMap = new HashMap<>();
        hashMap.put(obj, "cycle to " + obj.getClass().toString());
        return toString2(obj, hashMap);
    }

    public static String toString2(Object obj, HashMap<Object, String> hashMap) {

        Class<?> cl = obj.getClass();

        String result = cl.getName() + "\n";

        if (obj.getClass().toString().contains("java.lang")) {
            return obj.toString();
        }

        for (Field f : cl.getDeclaredFields()) {
            f.setAccessible(true);
            Object value = null;
            try {
                value = f.get(obj);
            }
            catch (IllegalAccessException ex) {
                return ex.getMessage();
            }
            if (hashMap.containsKey(value)) {
                result += "Field: " + f.getName() + " Type: " + f.getType().toString() + " Value: " + hashMap.get(value) + "\n";
                continue;
            }
            hashMap.put(value, "cycle");
            String tmp = "Field: " + f.getName() + " Type: " + f.getType().toString() + " Value: " + toString2(value, hashMap) + "\n";
            result += tmp;
            hashMap.put(value, tmp);
        }
        return result;
    }
    private static class Cl1 {
        int valA = 1;
        Cl2 subCl;
    }
    private static class Cl2 {
        int valB = 2;
        Cl1 subCl;
    }
    public static void main(String[] args) {
        Cl1 a = new Cl1();
        Cl2 b = new Cl2();
        a.subCl = b;
        b.subCl = a;

        System.out.println(toString(a));
    }
}
