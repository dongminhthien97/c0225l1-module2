package ss7_abstract_class_interface.bai_tap_2;


public class Square extends Shape implements Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public double area() {
        return side * side;
    }
}
