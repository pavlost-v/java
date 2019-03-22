package task9;

public class Car {
    private double x;
    private double bak;
    private final double maxBak = 100;
    private final int lpkm = 5;

    public Car(int start, double benzin) {
        this.x = start;
        this.bak = benzin;
    }

    public double getX() {
        return x;
    }

    public double getBak() {
        return bak;
    }

    public void addBenzin(double b) {
        if (bak + b > maxBak) {
            bak = maxBak;
        } else {
            bak += b;
        }
    }

    public void move(double distance) {
        double canMove = lpkm * bak;
        if (distance < canMove) {
            x += distance;
            bak -= distance / lpkm;
        } else {
            x += canMove;
            bak = 0;
        }
    }

    public static void main(String[] args) {
        Car car = new Car(30, 10);
        car.move(30);
        car.move(50);
        car.addBenzin(200);
        System.out.println(car.getX() + " " +car.getBak());
    }
}
