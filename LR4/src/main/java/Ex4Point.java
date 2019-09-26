public class Ex4Point implements Cloneable {
    private double x;
    private double y;

    public Ex4Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public Ex4Point clone() {
        return new Ex4Point(x, y);
    }
}