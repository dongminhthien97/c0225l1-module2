package ss6_ke_thua.bai_tap;

public class CircleCynlinder {
    private double radius;
    private String color;

    public CircleCynlinder(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "CircleCynlinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }
}


