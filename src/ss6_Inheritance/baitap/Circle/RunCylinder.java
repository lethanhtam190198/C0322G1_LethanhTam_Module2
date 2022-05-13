package ss6_Inheritance.baitap.Circle;

public class RunCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(3.2, "red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(3.3, "blue", 5);
        System.out.println(cylinder);
    }
}
