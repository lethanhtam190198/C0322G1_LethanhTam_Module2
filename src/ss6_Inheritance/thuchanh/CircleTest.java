package ss6_Inheritance.thuchanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle= new Circle(7.5);
        System.out.println(circle);
        circle=new Circle(8.5,"ABc",false);
        System.out.println(circle);
    }
}
