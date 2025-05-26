package ss6_ke_thua.bai_tap;

public class Cynlinder extends CircleCynlinder {
    private double height;

    public Cynlinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cynlinder{" +
                "height=" + height +
                ", radius=" + getRadius() +
                ", color=" + getColor() +
                ", Volume=" + getVolume() +
                '}';
    }
}
