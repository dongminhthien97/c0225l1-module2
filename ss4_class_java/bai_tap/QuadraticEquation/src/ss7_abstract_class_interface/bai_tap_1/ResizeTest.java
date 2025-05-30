package ss7_abstract_class_interface.bai_tap_1;

public class ResizeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Before : "+ circle);
        circle.resize(50);
        System.out.println("After : "+ circle);
        Square square = new Square(2);
        System.out.println("Before : "+ square);
        square.resize(100);
        System.out.println("After : "+ square);
        Rectangle rectangle = new Rectangle(2, 2);
        System.out.println("Before : "+ rectangle);
        rectangle.resize(70);
        System.out.println("After : "+ rectangle);
    }
}
