package ss6_Inheritance.Triangle;

import java.util.Scanner;

public class RunTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap side:");
        double side= scanner.nextFloat();
        Triangle triangle = new Triangle();
        triangle= new Triangle(side,side,side);
        triangle.getArea();
        triangle.getPerimeter();
        System.out.println(triangle.toString());
    }
}
