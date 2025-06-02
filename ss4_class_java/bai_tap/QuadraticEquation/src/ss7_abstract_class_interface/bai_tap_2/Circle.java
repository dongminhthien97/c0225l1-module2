package ss7_abstract_class_interface.bai_tap_2;

public class Circle extends Shape {
    public double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}