package ss4_class.baitap.ClassFan;

public class ClassFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean button = false;
    private double radius = 5;
    private String color = "blue";
    private String name;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOff() {
        return button;
    }

    public void setOff(boolean off) {
        this.button = off;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ClassFan() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassFan(int speed, boolean button, double radius, String color, String name) {
        this.speed = speed;
        this.button = button;
        this.radius = radius;
        this.color = color;
        this.name = name;
    }

    public String toString() {
        if (this.button==true) {
            return this.getName() + "ON " + "Speed:" + this.speed + " Radius:" + this.radius + " Color:" + this.color;
        } else {
            return this.getName() + "OFF " + "Color:" + this.color + " Radius:" + this.radius ;
        }
    }

}
