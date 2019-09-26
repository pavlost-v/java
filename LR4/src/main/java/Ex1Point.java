import java.util.Objects;


public class Ex1Point {
    protected Double x;
    protected Double y;

    public Ex1Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        String result = getClass().getName() + "[x=" + x + "]" + "[y=" + y + "]";
        return result;
//        return new StringBuilder().append(getClass().getName()).append("[x = " + x + "]").append("[y = " + y + "]").toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) return false;
        Ex1Point tmp = (Ex1Point) obj;
        return x.equals(tmp.getX()) && y.equals(tmp.y);
    }
    public int hashCode() {
        return Objects.hash(x, y);
    }


    public static void main(String[] args) {
        Ex1Point x = new Ex1Point(1,2);
        Ex1Point y = new Ex1Point(1,2);
        System.out.println(x.equals(y));
    }
}



