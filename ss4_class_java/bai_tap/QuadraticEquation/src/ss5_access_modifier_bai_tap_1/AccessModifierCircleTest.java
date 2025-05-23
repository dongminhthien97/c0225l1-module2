package ss5_access_modifier_bai_tap_1;

public class AccessModifierCircleTest {
    public static void main(String[] args) {
        AccessModifier circle = new AccessModifier(2.0);

        System.out.println("Ban kinh hinh tron: " + circle.getRadius());
        System.out.println("Chu vi hinh tron: " + circle.getArea());
    }
}
