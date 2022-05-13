package ss6_Inheritance.baitap.Point2dAnd3d;

import java.util.Scanner;

public class TestPoint2D3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap X:");
        float x = scanner.nextFloat();
        System.out.println("nhap Y:");
        float y = scanner.nextFloat();
        Point2D point2d = new Point2D();
        point2d = new Point2D(x, y);
        System.out.println(point2d);
        System.out.println("nhap z:");
        float z = scanner.nextFloat();
        Point3D point3d = new Point3D();
        point3d = new Point3D(x, y, z);
        System.out.println(point3d);
    }
}
