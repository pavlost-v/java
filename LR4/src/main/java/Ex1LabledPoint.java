import java.util.Objects;

public class Ex1LabledPoint extends Ex1Point {
    private String label;

    public Ex1LabledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String toString() {
        return super.toString() + "[Label=" + label + "]";
    }
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Ex1LabledPoint tmp = (Ex1LabledPoint) obj;
        return label.equals(tmp.getLabel());
    }
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }


    public static void main(String[] args) {
        Ex1LabledPoint x = new Ex1LabledPoint("qwe", 1, 2);
        Ex1LabledPoint y = new Ex1LabledPoint("qwe", 1, 2);
        System.out.println(x.equals(y));
        System.out.println("x hash = " + x.hashCode());
        System.out.println("y hash = " + y.hashCode());
        System.out.println(x.toString());
    }
}
