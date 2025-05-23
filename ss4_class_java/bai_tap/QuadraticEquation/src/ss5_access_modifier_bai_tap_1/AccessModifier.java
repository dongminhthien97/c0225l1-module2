package ss5_access_modifier_bai_tap_1;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";
    private static final double PI = 3.14;

    public AccessModifier() {
    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
