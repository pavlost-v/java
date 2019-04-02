package task5;

public class Task5 {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1,3).scale(0.5);
        System.out.println(Double.toString(p.getX()));
        System.out.println(Double.toString(p.getY()));
    }

}
