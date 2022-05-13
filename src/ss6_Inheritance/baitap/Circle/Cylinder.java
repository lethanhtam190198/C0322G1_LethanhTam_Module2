package ss6_Inheritance.baitap.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double volume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "height=" + height + " " +
                super.toString();
    }
}
