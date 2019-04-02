package task4;

public class task4 {
    public static void main(String[] args) {
        IntHolder var = new IntHolder();
        var.value = 4;
        System.out.println(var.value);
        var = modify(var);
        System.out.println(var.value);
        Integer var2 = 2;
        System.out.println(var2);
        var2 = modify2(var2);
        System.out.println(var2);
    }
    public static IntHolder modify (IntHolder in) {
        in.value = 3;
        return in;
    }
    public static Integer modify2 (Integer in) {
        in = 3;
        return in;
    }
}
