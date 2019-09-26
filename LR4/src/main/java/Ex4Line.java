public class Ex4Line extends Ex4Shape implements Cloneable {
    private Ex4Point to;
    public Ex4Line(Ex4Point p, Ex4Point to) {
        super(p);
        this.to = to;
    }
    @Override
    public Ex4Point getCenter() {
        double x = (this.p.getX() + this.to.getX()) / 2;
        double y = (this.p.getY() + this.to.getY()) / 2;
        return new Ex4Point(x, y);
    }
    @Override
    public Ex4Line clone() {
        return new Ex4Line(this.p.clone(), this.to.clone());
    }

}
