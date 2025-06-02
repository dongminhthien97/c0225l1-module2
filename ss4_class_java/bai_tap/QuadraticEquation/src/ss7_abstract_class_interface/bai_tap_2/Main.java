package ss7_abstract_class_interface.bai_tap_2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 5);
        shapes[2] = new Square(5);
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
