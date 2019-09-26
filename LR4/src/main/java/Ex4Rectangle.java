public class Ex4Rectangle extends Ex4Shape implements Cloneable {
    private double w;
    private double h;

    public Ex4Rectangle(Ex4Point topLeft, double width, double height) {
        super(topLeft);
        this.w = width;
        this.h = height;
    }

    @Override
    public Ex4Point getCenter() {
        double x = p.getX() + this.w / 2;
        double y = p.getY() + this.h / 2;
        return new Ex4Point(x, y);
    }
    @Override
    public Ex4Rectangle clone() {
        return new Ex4Rectangle(this.p.clone(), w, h);
    }
}