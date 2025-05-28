package ss6_ke_thua.bai_tap.bai_tap_3;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint m = new MovablePoint(2.0f, 3.0f,1.0f,4.0f);
        System.out.println("Before:" + m);
        m.move();
        System.out.println("After:" + m);
    }
}
