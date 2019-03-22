package task6;

public class Point {
    private double x;
    private double y;

    public Point(double _x, double _y) {
        this.x = _x;
        this.y = _y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void translate (double _x, double _y) {
        this.x += _x;
        this.y += _y;
    }
    public void scale (double t) {
        this.x *= t;
        this.y *= t;
    }

    public static void main(String[] args) {
        Point p = new Point (3,4);
        p.translate(1,3);
        p.scale(0.5);
        System.out.println(p.getX() + " " + p.getY());
    }



}
