package ss6_Inheritance.baitap.MoveablePoint;

import java.util.Scanner;

public class RunMoveablePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap X:");
        float x = scanner.nextFloat();
        System.out.println("nhap Y:");
        float y = scanner.nextFloat();
        Point point = new Point();
        point = new Point(x, y);
        System.out.println(point);
        System.out.println("nhap xSpeed:");
        float xSpeed = scanner.nextFloat();
        System.out.println("nhap ySpeed:");
        float ySpeed = scanner.nextFloat();
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint = new MoveablePoint(xSpeed, ySpeed);
        System.out.println(moveablePoint);
    }
}
