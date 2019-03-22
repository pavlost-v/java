package task5;

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

    public Point translate(double _x, double _y) {
        return new Point(x + _x, y + _y);
    }

    public Point scale(double t) {
        return new Point(x * t, y * t);
    }
}
