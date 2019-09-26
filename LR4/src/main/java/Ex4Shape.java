public abstract class Ex4Shape {
    Ex4Point p;
    public Ex4Shape (Ex4Point p) {
        this.p = p;
    }
    public void moveBy (double dx, double dy) {
        this.p = new Ex4Point(p.getX() + dx, p.getY() + dy);
    }
    public abstract Ex4Point getCenter();
}
