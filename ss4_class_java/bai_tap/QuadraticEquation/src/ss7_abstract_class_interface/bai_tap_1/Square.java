package ss7_abstract_class_interface.bai_tap_1;

public class Square implements Resizeable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }


    @Override
    public void resize(double percent) {
        side += side * percent/100;
    }
}
