public class Ex4Circle extends Ex4Shape implements Cloneable {
    private double radius;
    public Ex4Circle(Ex4Point p, double radius) {
        super(p);
        this.radius = radius;
    }
    @Override
    public Ex4Point getCenter() {
        return p;
    }
    @Override
    public Ex4Circle clone() {
        return new Ex4Circle(this.p.clone(), this.radius);
    }
}
