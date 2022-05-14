package ss7_Interface.Colorable;

import java.util.Scanner;

public class TestTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap height:");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap Width:");
        double width = Double.parseDouble(scanner.nextLine());
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(height, "yellow", true);
        shapes[1] = new Rectangle(height, width, "red", true);
        shapes[2] = new Square("red", true, 6);
        for (Shape shape:shapes) {
            System.out.println(shape.toString());
            if(shape instanceof Square){
                ((Square) shape).howtoColor();
            }
        }


    }
}
