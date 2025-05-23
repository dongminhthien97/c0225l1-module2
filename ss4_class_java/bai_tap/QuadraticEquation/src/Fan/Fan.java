package Fan;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        speed = 1;
        on = false;
        radius = 5;
        color = "blue";
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    " radius=" + radius +
                    ", color='" + color + '\'' +
                    "Fan is off" +
                    '}';
        }else{
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    "Fan is on" +
                    '}';
        }
    }
}
