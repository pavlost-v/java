package task16;

public class task16 {
    public static void main(String[] args) {
        System.out.println(average(3));
    }
    public static double average(double first, double... values) {
        double sum = first;
        for (double v : values) sum += v;
        return sum / (values.length + 1);
    }
}
